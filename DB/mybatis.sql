/*
Navicat MySQL Data Transfer

Source Server         : caoding
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2018-06-27 22:03:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `birsday` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'caoding', '1', '2018-06-24');
INSERT INTO `user` VALUES ('3', 'ding', '23', '2018-06-05');
INSERT INTO `user` VALUES ('4', '王小二', '浙江杭州', '2018-06-27');
INSERT INTO `user` VALUES ('5', '王小二', '浙江杭州', '2018-06-24');
INSERT INTO `user` VALUES ('6', '王小二', '浙江杭州', '2018-06-24');
INSERT INTO `user` VALUES ('7', '王小二', '浙江杭州', '2018-06-24');
INSERT INTO `user` VALUES ('8', '王小二', '浙江杭州', '2018-06-24');
INSERT INTO `user` VALUES ('9', '王小二', '浙江杭州', '2018-06-24');
INSERT INTO `user` VALUES ('10', '王小二', '浙江杭州', '2018-06-24');
INSERT INTO `user` VALUES ('11', '王小二', '浙江杭州', '2018-06-24');
