use  b5f4dzkesh9qz2h03fnp;


-- inserciones a tabla ninja
insert into Ninja ( nombre, rango, aldea) values('naruto','chunin','kohona');
insert into Ninja ( nombre, rango, aldea) values('sakura','chunin','kohona');
insert into Ninja ( nombre, rango, aldea) values('sasuke','chunin','kohona');



-- inserciones a tabla mision
insert into Mision (descripcion, rango, recompensa) values('exterminio clan uchija','chuninx3','kohona');
insert into Mision (descripcion, rango, recompensa) values('busqueda de sasuke','chuninx2','niebla');
insert into Mision (descripcion, rango, recompensa) values('entrenamiento sabio','chunin','kohona');

-- inserciones a tabla habilidades 
insert into Habilidad (nombre_Habilidad, descripcion) values('rasengan', 'cunai de chacra');
insert into Habilidad (nombre_Habilidad, descripcion) values('modo sabio', 'sabiduria sapo');
insert into Habilidad (nombre_Habilidad, descripcion) values('invocacion', 'invoca a sapos');

-- inserciones a tabla misionNinja
insert into MisionNinja (FechaInicio, FechaFin) values('2002-04-14', '2002-10-14');
insert into MisionNinja (FechaInicio, FechaFin) values('2002-07-19', '2002-09-12');
insert into MisionNinja (FechaInicio, FechaFin) values('2002-01-15', '2002-07-15');
