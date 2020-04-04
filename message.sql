drop table if exists message;
create table message(
msg_id int not null auto_increment,
msg_text varchar(32) not null,
msg_summary varchar(32) default null,
primary key (msg_id)
)engine=InnoDB auto_increment=1 default charset=utf8

drop table if exists orders;
create table orders(
o_id int not null auto_increment,
o_name varchar(32) not null,
o_time varchar(32) not null,
o_price int not null,
o_num int not null,
primary key (o_id)
)engine=InnoDB auto_increment=1 default charset=utf8

insert into orders(o_name,o_time,o_price,o_num) values ('苹果','2020-3-20 11:23:40','4000','2');