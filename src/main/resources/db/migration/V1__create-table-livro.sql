create table livro(
id bigint not null auto_increment,
nome varchar(100) not null,
editora varchar(100) not null,
quantidade int(20) not null,
edicao varchar(100) not null, 
categoria varchar(100) not null,
idioma varchar(100) not null,

primary key (id)


);