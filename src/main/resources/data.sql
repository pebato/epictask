CREATE TABLE task (
	id bigint primary key auto_increment,
	title varchar(200),
	description varchar(200),
	points int
);




INSERT INTO task (title, description, points) VALUES(
	'Criar banco de dados',
	'Criar bd oracle na nuvem',
	300
);



INSERT INTO task (title, description, points) VALUES(
	'Protótipo',
	'Criar protótipo de alta fidelidade',
	150
);



INSERT INTO task (title, description, points) VALUES(
	'Modelagem de dados',
	'Criar modelo lógico dos dados',
	200
);