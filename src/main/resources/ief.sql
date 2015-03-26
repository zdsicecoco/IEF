CREATE DATABASE IF NOT EXISTS IEF;
USE IEF;
CREATE TABLE IF NOT EXISTS USER_INFO(
id int not null primary key auto_increment,
username varchar(20) not null comment '姓名',
sex tinyint(1) not null default '-1' comment '性别',
birthday DATE comment '生日',
home_town varchar(100) comment '家乡',
present_address varchar(100) comment '现居地',
career varchar(20) comment '职业',
phone varchar(15) comment '电话号码',
school varchar(100) comment '毕业院校',
device_info varchar(50) comment '设备信息',
signature varchar(100) comment '个性签名',
books_wanted varchar(150) comment '想看的书',
concerned_persons varchar(150) comment '关心的人（person_id list）',
known_persons varchar(150) comment '认识的人（person_id list）',
created_date TIMESTAMP
)
ENGINE MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin; 

CREATE TABLE IF NOT EXISTS UPLOAD_BOOKS(
id int not null primary key auto_increment,
book_id int not null comment '书籍id',
user_id int not null comment '用户id',
on_loan tinyint(1) not null default '0' comment '是否借出',
comment varchar(100) comment '评价',
img_addres int not null comment '封面（图片id）',
created_date timestamp
)
ENGINE MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin; 

CREATE TABLE IF NOT EXISTS BOOKS(
id int not null primary key auto_increment,
book_name varchar(50) not null comment '书名',
category_id int not null comment '类别id',
user_wanted varchar(100) comment '想看这本书的person_id list'
)
ENGINE MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin; 

CREATE TABLE IF NOT EXISTS CATEGORY(
id int not null primary key auto_increment,
category_name varchar(20) comment '类别名'
)
ENGINE MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin; 

CREATE TABLE IF NOT EXISTS BOOK_DATE(
id int not null primary key auto_increment,
book_owner_id int not null comment '书主id',
borrower_id int not null comment '借阅者id',
upload_book_id int not null comment '上传的书的id',
activity_time date comment '活动时间',
address varchar(100) comment '活动地点（经纬度）',
remark varchar(50) comment '备注'
)
ENGINE MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin; 

CREATE TABLE IF NOT EXISTS PHOTO(
id int not null primary key auto_increment,
address varchar(50) comment '地址'
);