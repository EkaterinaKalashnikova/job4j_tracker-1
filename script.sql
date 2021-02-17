create table home(
	id serial primary key,
	floor int,
	room varchar(255),
	description text,
	type varchar(34)
);

insert into home(floor, room, description, type) values ('2', '8(eight)','with garden' , 'wood');
insert into home(floor, room, description, type) values('1', '5(five)', 'with pond', 'clay');
