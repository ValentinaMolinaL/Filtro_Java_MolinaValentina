use  b5f4dzkesh9qz2h03fnp;

create table Ninja  (
id_Ninja int auto_increment primary key,
nombre varchar(255) not null,
rango varchar(255) not null,
aldea varchar(255) not null
);
 
create table Mision  (
id_Mision int auto_increment primary key,
descripcion varchar(255) not null,
rango varchar(255) not null,
recompensa varchar (255) not null
);

create table MisionNinja (
id_Ninja int,
id_Mision int,
FechaInicio date,
FechaFin date,
foreign key (id_Ninja) references Ninja(id_Ninja),
foreign key (id_Mision) references Mision(id_Mision)
 );

create table Habilidad  (
id_Ninja int,
nombre_Habilidad varchar(255),
descripcion varchar(255),
foreign key (id_Ninja) references Ninja(id_Ninja)
)
-- MUCHOS ninja tiene MUCHAS misiones (MisicionNinja)
-- UN ninja tiene MUCHAS habilidades

