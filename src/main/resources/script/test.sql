/*
 Navicat Premium Data Transfer

 Source Server         : 123.57.73.52
 Source Server Type    : MySQL
 Source Server Version : 50627
 Source Host           : 123.57.73.52
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 50627
 File Encoding         : utf-8

 Date: 01/13/2017 16:49:11 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `sys`
-- ----------------------------
DROP TABLE IF EXISTS `sys`;
CREATE TABLE `sys` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_min` int(11) NOT NULL DEFAULT '0' COMMENT '最小人数',
  `user_max` int(11) NOT NULL DEFAULT '0' COMMENT '最大人数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `sys`
-- ----------------------------
BEGIN;
INSERT INTO `sys` VALUES ('1', '10', '10');
COMMIT;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` varchar(50) NOT NULL COMMENT '登录账号',
  `user_pass` varchar(50) NOT NULL COMMENT '登录密码',
  `user_name` varchar(50) NOT NULL COMMENT '真实姓名',
  `user_telephone` varchar(50) NOT NULL COMMENT '联系电话',
  `user_birthday` varchar(50) NOT NULL COMMENT '出生日期，格式“1989-02-14”',
  `user_answer` varchar(255) DEFAULT NULL COMMENT '密保答案',
  `user_faq` int(50) DEFAULT '0' COMMENT '密保问题',
  `user_city` varchar(255) NOT NULL COMMENT '所在城市',
  `user_creator` varchar(50) NOT NULL COMMENT '创建者',
  `created_time` bigint(20) NOT NULL COMMENT '创建时间戳',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', 'admin', '21232f297a57a5a743894a0e4a801fc3', 'admin', '10010001001', '2009-12-31', '1', '1', '深圳', 'admin', '1484203312795'), ('2', 'zhangsan', '01d7f40760960e7bd9443513f22ab9af', 'zhangsan', '10010001002', '2009-01-12', '2', '2', '北京', 'admin', '1484203349798'), ('3', 'lisi', 'dc3a8f1670d65bea69b7b65048a0ac40', 'lisi', '10010001003', '2010-12-05', '3', '3', '南京', 'admin', '1484207269561');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
