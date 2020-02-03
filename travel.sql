/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.0.67-community-log : Database - travel
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`travel` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `travel`;

/*Table structure for table `contact` */

DROP TABLE IF EXISTS `contact`;

CREATE TABLE `contact` (
  `name` varchar(10) NOT NULL,
  `email` varchar(15) NOT NULL,
  `phone` varchar(12) NOT NULL,
  `message` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `contact` */

insert  into `contact`(`name`,`email`,`phone`,`message`) values ('李四','lisi@sina.com','147287045','你们非常棒！！！'),('张三','zhang@182.com','1983649830','我很喜欢你们的功能！'),('aquih','1234@163.com','1356','GOOD！'),('李四','lisi@163.com','183409202','一切顺利！！！！！');

/*Table structure for table `information` */

DROP TABLE IF EXISTS `information`;

CREATE TABLE `information` (
  `name` varchar(20) NOT NULL,
  `sex` varchar(10) NOT NULL,
  `age` int(3) default NULL,
  `religion` varchar(20) NOT NULL,
  `mother_tongue` varchar(10) default NULL,
  `country` varchar(20) NOT NULL,
  `location` varchar(20) default NULL,
  `education` varchar(20) default NULL,
  `profession` varchar(20) default NULL,
  `status` varchar(10) default NULL,
  `date` date NOT NULL,
  PRIMARY KEY  (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `information` */

insert  into `information`(`name`,`sex`,`age`,`religion`,`mother_tongue`,`country`,`location`,`education`,`profession`,`status`,`date`) values ('Angelica','女',23,'印度教','汉语','中国','郑州','管理学硕士','待业','未婚','1996-12-06'),('Bentley','女',25,'无宗教信仰','汉语','中国','北京','本科','职员','未婚','1990-09-09'),('Bob','男',26,'无宗教信仰','英语','美国','北京','本科','职员','未婚','1991-03-09'),('Emmeline','男',28,'印度教','印度语','印度','印度','本科','销售','未婚','1991-00-00'),('Lily','女',24,'基督教','英语','英国','伦敦','天文学硕士','学者','未婚','1995-07-18'),('Mary','女',27,'无宗教信仰','汉语','中国','中国','本科','职员','未婚','1998-03-03'),('Sam','男',23,'基督教','英语','美国','纽约','本科','销售','离婚','1991-05-15'),('w','男',25,'印度教','汉语','中国','北京','天文学博士','学者','未婚','1994-12-12'),('wang','女',26,'伊斯兰教','汉语','中国','上海','计算机博士','学者','未婚','1996-12-12'),('张','男',27,'基督教','汉语','中国','北疆','本科','待业','未婚','1992-10-09'),('张丽','男',25,'伊斯兰教','英语','美国','加利福尼亚','本科','工程师','未婚','1994-00-00'),('朴海美','女',25,'基督教','汉语','中国','洛阳','计算机硕士','项目组长','未婚','1994-09-16'),('李四','男',27,'印度教','汉语','中国','中国','本科','职员','未婚','1992-09-09'),('林梅','女',25,'基督教','汉语','中国','北京','本科','职员','未婚','1990-09-09'),('王五','女',27,'佛教','英语','中国','中国','本科','职员','未婚','1992-09-09'),('王强','男',26,'基督教','汉语','中国','北京','本科','职员','未婚','1991-09-09'),('赵六','女',27,'印度教','汉语','中国','中国','本科','职员','未婚','1992-09-09');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `name` char(20) NOT NULL,
  `email` char(20) NOT NULL,
  `password` char(20) NOT NULL,
  PRIMARY KEY  (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`name`,`email`,`password`) values ('Angelica','196583456@qq.com','666666'),('张丽','2656699153@qq.com','111111'),('Emmeline','456789123@qq.com','888888'),('Sam','asdfghjkl@163.com','777777'),('Bentley','guoqiang@163.com','999999'),('朴海美','haimei@163.com','555555'),('Lily','lily@163.com','444444'),('林梅','linmei@163.com','123456'),('李四','lisi@163.com','lisi'),('Mary','Mary@163.com','mary'),('w','q@qq.com','qiao'),('Bob','version@163.com','333333'),('wang','wang@qq.com','wang'),('王强','wangqiang@163.com','222222'),('王五','wangwu@163.com','wangwu'),('张','zhang@163.com','zhang'),('赵六','zhaoliu@163.com','zhaoliu');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
