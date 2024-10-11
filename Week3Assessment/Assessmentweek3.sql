create table Worker(
	worker_id int primary key,
	first_name varchar(50),
	last_name varchar(50),
	salary decimal(10,2),
	joining_date date,
	department varchar(50)
);
insert into Worker(worker_id,first_name,last_name,salary,joining_date,department) values
(1,'Srujana','G',40000,'2024-09-16','Admin'),
(2,'Jane','H',50000,'2024-12-16','HR'),
(3,'Jyothi','A',80000,'2024-09-26','Admin'),
(4,'vidya','G',60000,'2024-10-16','HR'),
(5,'srividya','G',90000,'2024-01-16','HR'),
(6,'anu','G',60000,'2024-10-16','HR'),
(7,'arya','G',5000,'2024-11-16','Accounts');

select * from Worker;


create table Title(
	worker_ref_id int,
	worker_title varchar(50),
	affected_from date,
	foreign key(worker_ref_id) references Worker(worker_id)
);

insert into Title(worker_ref_id,worker_title,affected_from) values
(1,'Manager','2021-06-12'),
(2,'Accountant','2021-06-12'),
(3,'Manager','2021-06-09'),
(4,'lead','2021-06-12'),
(5,'HR','2021-06-02');
select * from Title;
create table Bonus(
	worker_ref_id int,
	bonus_amount decimal(10,2),
	bonus_date date,
	foreign key(worker_ref_id) references Worker(worker_id)
);
insert into Bonus(worker_ref_id,bonus_amount,bonus_date) values
(1,6000.00, '2021-06-02'),
(2,3000.00, '2021-06-15'),
(3,5000.00, '2021-06-02');

select * from Bonus;

-------Question1-------
select 
	w.first_name,
	w.salary,
	t.worker_title
from 
	worker w
join Title t on w.worker_id = t.worker_ref_id;

-------Question2--------
create or replace function get_worker_count_by_nth_highest_salary(n INT)
returns integer as $$
declare
	nth_highest_salary decimal;
	worker_count integer;
begin
	select distinct salary into nth_highest_salary
	from Worker
	order by salary desc
	limit 1 offset n-1;

select count(*) into worker_count from Worker 
	where salary=nth_highest_salary;
	return worker_count;
end;
$$ language plpgsql;

select get_worker_count_by_nth_highest_salary(4);

