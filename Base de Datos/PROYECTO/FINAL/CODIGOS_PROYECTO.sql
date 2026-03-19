-- CONSULTAS

-- 1.mostrar el total gastado por cada mesa, indicando también 
-- cuántos pedidos se han hecho en cada una, ordenado de mayor a menor gasto.

select 
    m.num_mesa,
    m.zona,
    count(p.id_pedido) as num_pedidos,
    round(sum(p.total), 2) as total_gastado
from mesa m
join pedido p on m.num_mesa = p.num_mesa
group by m.num_mesa, m.zona
order by total_gastado desc;

-- 2.mostrar los productos más vendidos, indicando cuántas unidades 
-- se han vendido y cuánto dinero han generado.

select 
    pr.nombre as producto,
    pr.categoria,
    sum(dp.cantidad) as unidades_vendidas,
    round(sum(dp.subtotal), 2) as dinero_generado
from producto pr
join detalle_pedido dp on pr.id_producto = dp.id_producto
group by pr.id_producto, pr.nombre, pr.categoria
order by unidades_vendidas desc, dinero_generado desc;


-- 3. mostrar los empleados que han atendido pedidos cuyo 
-- total está por encima del total medio de todos los pedidos.

select 
    e.nombre as empleado,
    p.id_pedido,
    p.total
from empleado e
join pedido p on e.id_empleado = p.id_empleado
where p.total > (
    select avg(total)
    from pedido
)
order by p.total desc;

-- 4. mostrar los ingredientes que se usan en más de un producto, 
-- indicando en cuántos productos aparece cada uno.

select 
    i.nombre as ingrediente,
    count(pi.id_producto) as veces_usado
from ingrediente i
join producto_ingrediente pi on i.id_ingrediente = pi.id_ingrediente
group by i.id_ingrediente, i.nombre
having count(pi.id_producto) > 1
order by veces_usado desc, ingrediente asc;

-- 5. mostrar los pedidos con su empleado, mesa y método de pago, 
-- incluyendo solo aquellos pedidos que ya han sido pagados.

select 
    p.id_pedido,
    e.nombre as empleado,
    m.num_mesa,
    m.zona,
    p.total,
    pa.metodo_pago,
    pa.fecha as fecha_pago
from pedido p
join empleado e on p.id_empleado = e.id_empleado
join mesa m on p.num_mesa = m.num_mesa
join pago pa on p.id_pedido = pa.id_pedido
where pa.estado = 'pagado'
order by pa.fecha desc;

-- VISTAS

-- PRODUCTOS MAS VENDIDOS
create or replace view vw_productos_mas_vendidos as
select 
    pr.nombre as producto,
    pr.categoria,
    sum(dp.cantidad) as unidades_vendidas,
    round(sum(dp.subtotal), 2) as dinero_generado
from producto pr
join detalle_pedido dp on pr.id_producto = dp.id_producto
group by pr.id_producto, pr.nombre, pr.categoria;

select * from vw_productos_mas_vendidos;

-- PEDIDOS PAGADOS COMPLETOS
create or replace view vw_pedidos_pagados as
select 
    p.id_pedido,
    e.nombre as empleado,
    m.num_mesa,
    m.zona,
    p.total,
    pa.metodo_pago,
    pa.fecha as fecha_pago
from pedido p
join empleado e on p.id_empleado = e.id_empleado
join mesa m on p.num_mesa = m.num_mesa
join pago pa on p.id_pedido = pa.id_pedido
where pa.estado = 'pagado';

select * from vw_pedidos_pagados;

-- FUNCIONES

-- 1. devolver el número total de pedidos que ha atendido un empleado.

delimiter //

create function fn_total_pedidos_empleado(p_id_empleado int)
returns int
deterministic
begin
    declare total_pedidos int;

    select count(*)
    into total_pedidos
    from pedido
    where id_empleado = p_id_empleado;

    return total_pedidos;
end //

delimiter ;

select fn_total_pedidos_empleado(1) as total_pedidos;

-- 2. devolver el importe medio de los pedidos de una mesa.

delimiter //

create function fn_media_gasto_mesa(p_num_mesa int)
returns decimal(10,2)
deterministic
begin
    declare media_gasto decimal(10,2);

    select ifnull(avg(total), 0)
    into media_gasto
    from pedido
    where num_mesa = p_num_mesa;

    return media_gasto;
end //

delimiter ;

select fn_media_gasto_mesa(3) as media_gasto;

-- PROCEDECIMIENTOS

-- 1. mostrar todos los pedidos de una mesa concreta.

delimiter //

create procedure sp_pedidos_por_mesa(in p_num_mesa int)
begin
    select 
        id_pedido,
        fecha,
        total,
        estado
    from pedido
    where num_mesa = p_num_mesa
    order by fecha desc;
end //

delimiter ;

call sp_pedidos_por_mesa(3);

-- 2. actualizar el estado de una mesa.

delimiter //

create procedure sp_actualizar_estado_mesa(
    in p_num_mesa int,
    in p_estado varchar(20)
)
begin
    update mesa
    set estado = p_estado
    where num_mesa = p_num_mesa;
end //

delimiter ;

call sp_actualizar_estado_mesa(2, 'ocupada');

-- 3. mostrar un resumen de un empleado indicando su nombre y cuántos pedidos ha atendido. este procedimiento usa una función.

delimiter //

create procedure sp_resumen_empleado(in p_id_empleado int)
begin
    select 
        nombre,
        fn_total_pedidos_empleado(p_id_empleado) as pedidos_atendidos
    from empleado
    where id_empleado = p_id_empleado;
end //

delimiter ;

call sp_resumen_empleado(1);


-- TRIGGERS

-- 1. antes de insertar una línea en detalle_pedido, calcular automáticamente el subtotal

delimiter //

create trigger trg_calcular_subtotal_before_insert
before insert on detalle_pedido
for each row
begin
    set new.subtotal = new.cantidad * new.precio_unitario;
end //

delimiter ;

select * from detalle_pedido;

insert into detalle_pedido (id_pedido, id_producto, cantidad, precio_unitario, subtotal)
values (1, 13, 3, 2.30, 0);

select * 
from detalle_pedido
where id_pedido = 1 and id_producto = 13
order by id_detalle desc;

-- 2. después de insertar un pago, cambiar automáticamente el estado del pedido a cobrado.

delimiter //

create trigger trg_marcar_pedido_cobrado_after_insert
after insert on pago
for each row
begin
    update pedido
    set estado = 'cobrado'
    where id_pedido = new.id_pedido;
end //

delimiter ;

select id_pedido, estado
from pedido
where id_pedido = 2;

insert into pago (id_pedido, fecha, importe, metodo_pago, estado)
values (2, now(), 14.10, 'bizum', 'pagado');

select id_pedido, estado
from pedido
where id_pedido = 2;