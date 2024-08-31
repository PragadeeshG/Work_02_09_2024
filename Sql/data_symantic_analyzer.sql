create table if not exists data_symantic_analyzer(
symantic_analyzer_id bigint not null,
symantic_analyzer_name varchar(255) null,
symantic_analyzer_type varchar(255) null,
symantic_analyzer_behaviour varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_State varchar(255) null,
constraint data_symantic_analyzer_pk primary key(symantic_analyzer_id));