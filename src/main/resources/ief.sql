CREATE DATABASE IF NOT EXISTS IEF;
USE IEF;
CREATE TABLE IF NOT EXISTS USER_INFO(
id int(20) not null primary key auto_increment,
username varchar(30) not null,
sex int(2) not null default '0',
birthday DATE,
home_town varchar(50),
present_address varchar(50),
phone varchar(11),
school varchar(20),
device_info varchar(50),
signature varchar(80),
books_wanted varchar(150),
concerned_persons varchar(150),
known_persons varchar(150),
created_date TIMESTAMP
)
ENGINE MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin; 

CREATE TABLE IF NOT EXISTS UPLOAD_BOOKS(
id int(20) not null primary key auto_increment,
book_id int(30) not null,
user_id int(30) not null,
on_loan tinyint(1) not null default '0',
commont varchar(100),
created_date timestamp
)
ENGINE MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin; 

CREATE TABLE IF NOT EXISTS BOOKS(
id int(20) not null primary key auto_increment,
book_name varchar(30) not null,
category_id int(3) not null,
user_wanted varchar(100) not null default '0'
)
ENGINE MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin; 

CREATE TABLE IF NOT EXISTS CATEGORY(
id int(3) not null primary key auto_increment,
category_name varchar(20)
)
ENGINE MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin; 

CREATE TABLE IF NOT EXISTS BOOK_DATE(
id int(20) not null primary key auto_increment,
book_owner int(20) not null,
borrower int(20) not null,
upload_book int(20) not null,
activity_time date,
address varchar(50),
remark varchar(20)
)
ENGINE MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin; 
