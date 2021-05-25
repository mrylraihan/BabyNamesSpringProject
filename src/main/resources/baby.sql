drop database if exists baby_db;
create database baby_db;
use baby_db;

create table baby_name(
	baby_name_id INT primary key auto_increment,
	baby_name VARCHAR(100) not null,
	gender VARCHAR(10) not null,
	meaning VARCHAR(100),
	CONSTRAINT check_gender check(lower(gender)='female' or lower(gender)='male' or lower(gender)='unisex')
);


insert into baby_name(baby_name,gender,meaning)
values
('Aadi','Female','Begining'),
('Adolf','Male','Noble Wolf'),
('Acadia', 'Female', 'Idyllic Place'),
('Abcde','Unisex','First five letters of the english alphabet'),
('Adel','Female','Noble, and kind'),
('Baby','Unisex','Infent'),
('Bahadur', 'Male','Hero, Warrier'),
('Bai', 'Female','Pure'),
('Cable','Unisex','Rope'),
('Daichi', 'Male','Large, Great,Land, Earth'),
('Armin','Male','Soldier,warrior'),
('Ash','Unisex','Ash tree'),
('Spike','Male','Sharp'),
('Alphonse','Male','Ready for battle'),
('Itachi','Male','Weasel'),
('Goku','Male','aware of emptiness')
;
commit;
