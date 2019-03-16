DROP DATABASE IF EXISTS young;
CREATE DATABASE young;
USE young;
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(32) NOT NULL,
  `pwd` varchar(32) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into user values (null,'灵犀','5454564gf');

select * from user;
