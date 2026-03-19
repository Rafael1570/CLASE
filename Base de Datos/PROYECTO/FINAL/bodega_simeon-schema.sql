create database if not exists bodega_simeon;
use bodega_simeon;

drop table if exists pago;
drop table if exists detalle_pedido;
drop table if exists pedido;
drop table if exists reserva;
drop table if exists producto_ingrediente;
drop table if exists ingrediente_proveedor;
drop table if exists producto;
drop table if exists ingrediente;
drop table if exists proveedor;
drop table if exists mesa;
drop table if exists empleado;

create table empleado (
    id_empleado int auto_increment primary key,
    nombre varchar(100) not null,
    dni varchar(20) not null unique,
    fecha_nac date,
    telefono varchar(20),
    correo varchar(100),
    cargo varchar(50) not null
);

create table mesa (
    num_mesa int primary key,
    capacidad int not null,
    zona varchar(50) not null,
    estado enum('libre','ocupada','reservada') default 'libre'
);

create table proveedor (
    id_proveedor int auto_increment primary key,
    nombre varchar(100) not null,
    contacto varchar(100),
    telefono varchar(20),
    email varchar(100)
);

create table ingrediente (
    id_ingrediente int auto_increment primary key,
    nombre varchar(100) not null unique,
    stock decimal(10,2) not null default 0,
    unidad varchar(20) not null
);

create table producto (
    id_producto int auto_increment primary key,
    nombre varchar(120) not null unique,
    categoria varchar(50) not null,
    precio decimal(8,2) not null,
    disponible boolean default true
);

create table ingrediente_proveedor (
    id_ingrediente int not null,
    id_proveedor int not null,
    precio_compra decimal(8,2),
    primary key (id_ingrediente, id_proveedor),
    foreign key (id_ingrediente) references ingrediente(id_ingrediente),
    foreign key (id_proveedor) references proveedor(id_proveedor)
);

create table producto_ingrediente (
    id_producto int not null,
    id_ingrediente int not null,
    cantidad_necesaria decimal(10,2) not null,
    primary key (id_producto, id_ingrediente),
    foreign key (id_producto) references producto(id_producto),
    foreign key (id_ingrediente) references ingrediente(id_ingrediente)
);

create table reserva (
    id_reserva int auto_increment primary key,
    nombre_cliente varchar(100) not null,
    telefono varchar(20) not null,
    fecha date not null,
    hora time not null,
    num_personas int not null,
    num_mesa int,
    observaciones varchar(255),
    foreign key (num_mesa) references mesa(num_mesa)
);

create table pedido (
    id_pedido int auto_increment primary key,
    fecha datetime not null default current_timestamp,
    total decimal(10,2) not null default 0,
    id_empleado int not null,
    num_mesa int not null,
    estado enum('abierto','servido','cobrado','cancelado') default 'abierto',
    foreign key (id_empleado) references empleado(id_empleado),
    foreign key (num_mesa) references mesa(num_mesa)
);

create table detalle_pedido (
    id_detalle int auto_increment primary key,
    id_pedido int not null,
    id_producto int not null,
    cantidad int not null,
    precio_unitario decimal(8,2) not null,
    subtotal decimal(10,2) not null,
    foreign key (id_pedido) references pedido(id_pedido),
    foreign key (id_producto) references producto(id_producto)
);

create table pago (
    id_pago int auto_increment primary key,
    id_pedido int not null unique,
    fecha datetime not null default current_timestamp,
    importe decimal(10,2) not null,
    metodo_pago enum('efectivo','tarjeta','bizum') not null,
    estado enum('pendiente','pagado') default 'pagado',
    foreign key (id_pedido) references pedido(id_pedido)
);