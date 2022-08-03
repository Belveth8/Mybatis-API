create table company (
	id integer auto_increment primary key,
	company_name varchar(128),
	company_address varchar(128),
	index (company_name)
);

create table employee (
	id integer auto_increment primary key,
	company_id integer,
	employee_name varchar(128),
	employee_address varchar(128),
	index (employee_name),
	foreign key (company_id) references company(id)
);