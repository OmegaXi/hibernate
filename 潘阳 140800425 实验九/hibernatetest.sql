/*
Navicat MySQL Data Transfer

Source Server         : jsp
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : hibernatetest

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-05-05 16:41:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for kcb
-- ----------------------------
DROP TABLE IF EXISTS `kcb`;
CREATE TABLE `kcb` (
  `kch` varchar(255) NOT NULL,
  `kcm` varchar(255) DEFAULT NULL,
  `xf` int(11) DEFAULT NULL,
  `xs` int(11) DEFAULT NULL,
  PRIMARY KEY (`kch`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kcb
-- ----------------------------
INSERT INTO `kcb` VALUES ('1', 'math', '2', '48');
INSERT INTO `kcb` VALUES ('198', 'JavaEE', '3', '48');
