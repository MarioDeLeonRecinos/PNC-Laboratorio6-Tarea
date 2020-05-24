CREATE TABLE public.importancia (
	c_importancia SERIAL PRIMARY KEY,
	s_importancia VARCHAR (30)
)

CREATE TABLE public.contribuyente (
	c_contribuyente SERIAL PRIMARY KEY,
	c_importancia INTEGER,
	s_nombre VARCHAR (30),
	s_apellido VARCHAR (30),
	s_nit VARCHAR (14),
	f_fecha_ingreso DATE,
	FOREIGN KEY (c_importancia) REFERENCES public.importancia (c_importancia)
)

insert into public.importancia(s_importancia)
values ('Grandes'),('Medianos'),('Otros')

insert into public.contribuyente(c_importancia,s_nombre,s_apellido,s_nit,f_fecha_ingreso)
values(1,'Mario','De Leon','00614110000000','2020/10/15')
;
