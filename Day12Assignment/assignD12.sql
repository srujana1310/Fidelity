--------Question 1---------
create table Delivery_partner(
	partner_id varchar(10) primary key,
	partner_name varchar(20) not null,
	ph_number BIGINT not null,
	rating decimal(2,1) check (rating between 0 and 5)
);

insert into Delivery_partner(partner_id,partner_name,ph_number,rating)values
(1, 'Anu', 7890654321, 4.5),
(2, 'Asha', 9780654321, 3.8),
(3, 'Srujana', 78990654321, 2.5),
(4, 'Nandu', 8880654321, 5),
(5, 'Jan', 9980654321, 3.9);
select * from Delivery_partner;

select partner_id, partner_name, ph_number from Delivery_partner
where rating between 3 and 5
order by partner_id;

--------------Question2--------------------
create table customers(
	customer_id varchar(10) primary key,
	customer_name varchar(20) not null,
	address varchar(20) not null,
	phone_no varchar(20),
	email_id varchar(20) not null unique
);

insert into customers(customer_id,customer_name, address,phone_no, email_id)values
('CUST1001','Thomas','kochi',9876123456,'thomas@gmail.com'),
('CUST1002','Alice','Banglore',9876123458,'alice@gmail.com'),
('CUST1003','Bob','Mysure',9876123457,'bob@gmail.com'),
('CUST1004','Joni','Mandya',9876123450,'Joni@gmail.com'),
('CUST1005','Jane','kochi',9876678945,'janes@gmail.com');

select *from customers;
update customers
set phone_no = '9876543210'
where customer_id = 'CUST1004';

SELECT * from customers;

------------Question 3------------------
select customer_id, customer_name, address, phone_no
from customers
where email_id Like '%@gmail.com'
order by customer_id;

---------------Question 4------------------
ALTER TABLE customers
ALTER COLUMN customer_id TYPE INT USING customer_id::integer;

create table hotel_details(
	hotel_id varchar(10) primary key,
	hotel_name varchar(20) not null,
	hotel_type varchar(20) not null,
	rating int null
);
insert into hotel_details(hotel_id,hotel_name,hotel_type,rating) values
('1','Haripriya', 'veg', 3.9),
('2','Udupi', 'veg',4.5),
('3','Nati Style', 'Nonveg',5),
('4','Adiga', 'veg', 4.8);

create table orders(
	order_id varchar(20) primary key,
	customer_id varchar(10),
	hotel_id varchar(10),
	partner_id varchar(10),
	order_date DATE null,
	order_amount INT,
	foreign key(hotel_id) references hotel_details(hotel_id),
	foreign key(customer_id) references customers(customer_id),
	foreign key(partner_id) references delivery_partner(partner_id)
);
 insert into orders(order_id,order_date,order_amount) values 
 ('1','8-09-2024',690),
 ('2','9-06-2024',990),
 ('3','6-05-2024',330),
 ('4','12-10-2024',440);

ALTER TABLE hotel_details
RENAME COLUMN rating TO hotel_rating;
select * from hotel_details;
 
SELECT CONCAT(hotel_name, ' is a ', hotel_type, ' hotel') AS HOTEL_INFO
FROM hotel_details
ORDER BY hotel_name DESC;
 
SELECT h.hotel_id, h.hotel_name, COUNT(o.order_id) AS NO_OF_ORDERS
FROM hotel_details h
JOIN orders o ON h.hotel_id = o.hotel_id
GROUP BY h.hotel_id, h.hotel_name
HAVING COUNT(o.order_id) > 5
ORDER BY h.hotel_id ASC;
 
SELECT h.hotel_id, h.hotel_name, h.hotel_type
FROM hotel_details h
LEFT JOIN orders o ON h.hotel_id = o.hotel_id AND o.order_date BETWEEN '2019-05-01' AND '2019-05-31'
WHERE o.order_id IS NULL
ORDER BY h.hotel_id ASC;
 
SELECT o.order_id, c.customer_name, h.hotel_name, o.order_amount
FROM orders o
JOIN customers c ON o.customer_id = c.customer_id
JOIN hotel_details h ON o.hotel_id = h.hotel_id
ORDER BY o.order_id ASC;



