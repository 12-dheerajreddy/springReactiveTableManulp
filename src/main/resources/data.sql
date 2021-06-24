create table Customers(CustomerID number(10) primary key,CustomerName varchar2(20) ,ContactName varchar2(20),Country varchar2(20), LocationCode number(20),state varchar2(20));

create table orders(orderId number(10) unique,CustomerID number(10) primary key,orderdProdName varchar2(20),OrderdStatus varchar2(20));


insert into customers values(2,'ravi','dheeraj','india',25841,'AndhraPradesh');
insert into customers values(3,'sai','dheeraj','india',25844,'AndhraPradesh');
insert into customers values(4,'ramesh','dheeraj','US',25848,'TS');
insert into customers values(5,'siva','dheeraj','US',25850,'AndhraPradesh');


insert into orders values(102,3,'watch','recived');
insert into orders values(103,4,'shoe','order conifred');
insert into orders values(101,2,'mobile','ready to delv');

