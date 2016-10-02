
drop table Price;
drop table Course;
drop table Teacher;
drop table Organisation;

drop database laba2;

create database  IF NOT EXISTS laba2 ;
use laba2;

create table IF NOT EXISTS Organisation (
orgID INT(10) not null auto_increment,
orgName VARCHAR(30) not null,
orgAddres VARCHAR(30) not null,
orgPhone INT(10) not null,
orgMail VARCHAR(20) not null,
primary key(orgID));

create table IF NOT EXISTS Price(
priceID INT(10) not null auto_increment,
priceData DATE not null,
pricePrice INT(30) not null,
pricePriceNDS INT(30) not null,
primary key(priceID));

create table Course(
  courseID INT(10) not null auto_increment,
  courseName VARCHAR(30) not null,
  courseType enum('информационные технологии', 'менеджмент') not null,
courseTrainingDays INT(10) not null,
corseNumberOfGroup INT(10) not null,
pricePrice INT(30) not null,
pricePriceNDS INT(30) not null,
primary key(courseID));

create table IF NOT EXISTS Teacher(
teacherID INT(10) not null auto_increment,
teacherFIO VARCHAR(30) not null,
teacherDataOfBirthd DATE not null,
teacherSex enum ('мужской', 'женский') not null,
teacherEducation enum ('высшее', 'среднее', 'среднеспециальное', 'без образования') not null,
teacherTupe enum ('высшая','первая','вторая'),
primary key(teacherID));

create table IF NOT EXISTS Document (
courseID INT(10) not null,
teacherID INT(10) not null,
startTrainingData DATE not null,
courseTrainingDays INT(10) not null  ,
FOREIGN KEY (courseID) REFERENCES Course(courseID),
FOREIGN KEY (teacherID) REFERENCES Teacher(teacherID));
 