create table if not exists region_data_symantic_analyzer(
country_code varchar(255) not null,
region_code varchar(255) null,
region_name varchar(255) null,
symantic_analyzer_id varchar(255) null,
is_primary varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_State varchar(255) null,
constraint region_data_symantic_analyzer_pk primary key(country_code));
