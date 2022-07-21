CREATE DATABASE adlister_db;
USE adlister_db;

CREATE USER 'andy'@'localhost' IDENTIFIED BY 'password';
GRANT ALl ON adlister_db.* TO 'andy'@'localhost';

DROP TABLE IF EXISTS user;
CREATE TABLE user(
id INT UNSIGNED NOT NULL AUTO_INCREMENT,
userName varchar(15) NOT NULL ,
email varchar(50) NOT NULL ,
password varchar(20) NOT NULL,
PRIMARY KEY (id)
);

DROP TABLE IF EXISTS ads;
CREATE TABLE IF NOT EXISTS ads(
id INT UNSIGNED NOT NULL AUTO_INCREMENT,
user_id int UNSIGNED NOT NULL,
title varchar(30) NOT NULL ,
description TEXT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (user_id) REFERENCES user (id)
);

