use bodega_simeon;

insert into empleado (nombre, dni, fecha_nac, telefono, correo, cargo) values
('juan pérez', '11111111a', '1992-05-14', '600111111', 'juan@bodegasimeon.local', 'camarero'),
('maría lópez', '22222222b', '1995-11-02', '600222222', 'maria@bodegasimeon.local', 'encargada'),
('antonio garcía', '33333333c', '1988-03-21', '600333333', 'antonio@bodegasimeon.local', 'cocinero'),
('lucía romero', '44444444d', '1999-08-09', '600444444', 'lucia@bodegasimeon.local', 'camarera');

insert into mesa (num_mesa, capacidad, zona, estado) values
(1, 2, 'barra', 'libre'),
(2, 2, 'interior', 'libre'),
(3, 4, 'interior', 'ocupada'),
(4, 4, 'patio', 'libre'),
(5, 6, 'patio', 'reservada'),
(6, 8, 'salón 1', 'libre'),
(7, 8, 'salón 2', 'libre'),
(8, 10, 'salón 3', 'libre'),
(9, 12, 'salón 4', 'libre'),
(10, 4, 'terraza', 'libre');

insert into proveedor (nombre, contacto, telefono, email) values
('distribuciones aljarafe', 'rafael ortega', '955111111', 'pedidos@aljarafeproveedores.es'),
('frutas y verduras bormujos', 'carmen ruiz', '955222222', 'info@fyvbormujos.es'),
('carnes sevillanas', 'josé manuel león', '955333333', 'ventas@carnessevillanas.es'),
('bebidas hispalenses', 'laura campos', '955444444', 'pedidos@bebidashispalenses.es'),
('pescados del guadalquivir', 'manuel gil', '955555555', 'compras@pescadosguadalquivir.es');

insert into ingrediente (nombre, stock, unidad) values
('arroz', 25.00, 'kg'),
('pollo', 12.00, 'kg'),
('langostinos', 8.00, 'kg'),
('alcachofas', 10.00, 'kg'),
('carrillada', 9.00, 'kg'),
('pato', 6.00, 'kg'),
('patatas', 30.00, 'kg'),
('huevo', 120.00, 'ud'),
('pan', 40.00, 'ud'),
('aceite de oliva', 20.00, 'l'),
('tomate', 18.00, 'kg'),
('lechuga', 12.00, 'kg'),
('mayonesa', 8.00, 'kg'),
('garbanzos', 14.00, 'kg'),
('zanahoria', 16.00, 'kg'),
('vino mosto', 60.00, 'l'),
('vino tinto', 45.00, 'l'),
('refresco cola', 96.00, 'ud'),
('cerveza', 120.00, 'ud'),
('carne ibérica', 15.00, 'kg');

insert into producto (nombre, categoria, precio, disponible) values
('ensaladilla', 'tapa', 5.50, true),
('alcachofas con langostinos', 'plato', 14.50, true),
('potaje de la casa', 'plato', 8.90, true),
('zanahorias aliñadas', 'tapa', 4.20, true),
('migas con huevo', 'plato', 9.50, true),
('arroz de perdiz', 'arroz', 15.90, true),
('arroz de pato', 'arroz', 16.50, true),
('arroz de carrillada', 'arroz', 15.50, true),
('arroz de alcachofas y langostinos', 'arroz', 17.90, true),
('carnes a la brasa', 'carne', 18.50, true),
('mosto de la casa', 'bebida', 2.20, true),
('vino tinto de la casa', 'bebida', 2.80, true),
('coca cola', 'bebida', 2.30, true),
('cerveza', 'bebida', 2.20, true);

insert into ingrediente_proveedor (id_ingrediente, id_proveedor, precio_compra) values
(1, 1, 1.90),
(2, 3, 6.50),
(3, 5, 14.00),
(4, 2, 3.20),
(5, 3, 7.80),
(6, 3, 8.90),
(7, 2, 1.10),
(8, 1, 0.18),
(9, 1, 0.35),
(10, 1, 4.20),
(11, 2, 1.40),
(12, 2, 1.10),
(13, 1, 2.80),
(14, 1, 1.60),
(15, 2, 1.00),
(16, 4, 1.90),
(17, 4, 2.50),
(18, 4, 0.95),
(19, 4, 0.85),
(20, 3, 9.50);

insert into producto_ingrediente (id_producto, id_ingrediente, cantidad_necesaria) values
(1, 7, 0.20),
(1, 8, 2.00),
(1, 13, 0.08),
(1, 10, 0.02),
(2, 4, 0.18),
(2, 3, 0.15),
(2, 10, 0.02),
(3, 14, 0.25),
(3, 10, 0.02),
(4, 15, 0.18),
(4, 10, 0.01),
(5, 7, 0.25),
(5, 8, 1.00),
(5, 9, 0.10),
(6, 1, 0.30),
(6, 2, 0.20),
(6, 10, 0.03),
(7, 1, 0.30),
(7, 6, 0.22),
(7, 10, 0.03),
(8, 1, 0.30),
(8, 5, 0.20),
(8, 10, 0.03),
(9, 1, 0.30),
(9, 4, 0.15),
(9, 3, 0.12),
(9, 10, 0.03),
(10, 20, 0.35),
(10, 10, 0.02),
(11, 16, 0.20),
(12, 17, 0.20),
(13, 18, 1.00),
(14, 19, 1.00);

insert into reserva (nombre_cliente, telefono, fecha, hora, num_personas, num_mesa, observaciones) values
('carmen sánchez', '610000001', '2026-03-21', '14:30:00', 4, 4, 'cumpleaños'),
('david morales', '610000002', '2026-03-22', '21:30:00', 6, 5, 'prefiere patio'),
('ana jurado', '610000003', '2026-03-23', '15:00:00', 8, 6, 'mesa amplia');

insert into pedido (fecha, total, id_empleado, num_mesa, estado) values
('2026-03-19 14:05:00', 0, 1, 3, 'abierto'),
('2026-03-19 14:20:00', 0, 4, 2, 'abierto'),
('2026-03-19 15:10:00', 24.10, 2, 4, 'cobrado');

insert into detalle_pedido (id_pedido, id_producto, cantidad, precio_unitario, subtotal) values
(1, 1, 2, 5.50, 11.00),
(1, 11, 2, 2.20, 4.40),
(1, 8, 1, 15.50, 15.50),
(2, 5, 1, 9.50, 9.50),
(2, 13, 2, 2.30, 4.60),
(3, 10, 1, 18.50, 18.50),
(3, 12, 2, 2.80, 5.60);

update pedido
set total = (
    select ifnull(sum(dp.subtotal), 0)
    from detalle_pedido dp
    where dp.id_pedido = pedido.id_pedido
);

insert into pago (id_pedido, fecha, importe, metodo_pago, estado) values
(3, '2026-03-19 15:40:00', 24.10, 'tarjeta', 'pagado');