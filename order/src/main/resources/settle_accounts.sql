/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.24 : Database - zh
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`zh` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `zh`;

/*Table structure for table `zh_order` */

DROP TABLE IF EXISTS `zh_order`;

CREATE TABLE `zh_order` (
  `order_id` int(255) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `order_number` varchar(255) DEFAULT NULL COMMENT '订单编号',
  `order_date` datetime DEFAULT NULL COMMENT '订单创建时间',
  `order_pay_status` varchar(10) DEFAULT NULL COMMENT '订单支付状态',
  `order_price` int(20) DEFAULT NULL COMMENT '订单金额',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `zh_order` */

/*Table structure for table `zh_order_details` */

DROP TABLE IF EXISTS `zh_order_details`;

CREATE TABLE `zh_order_details` (
  `commodity_name` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `commodity_id` int(11) DEFAULT NULL COMMENT '商品ID',
  `commodity_type` varchar(200) DEFAULT NULL COMMENT '商品类别',
  `commodity_price` longblob COMMENT '商品价格',
  `order_id` int(11) DEFAULT NULL COMMENT '订单ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `zh_order_details` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
