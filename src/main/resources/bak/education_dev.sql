/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : education_dev

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-11-03 13:31:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `e_appointment`
-- ----------------------------
DROP TABLE IF EXISTS `e_appointment`;
CREATE TABLE `e_appointment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `teacher_id` bigint(20) DEFAULT NULL COMMENT '预约教师id',
  `student_id` bigint(20) DEFAULT NULL COMMENT '学生id',
  `start_time` date DEFAULT NULL COMMENT '预约开始时间',
  `end_time` date DEFAULT NULL COMMENT '预约结束时间',
  `status` varchar(20) DEFAULT NULL COMMENT '当前预约状态已约 /缺课/调课/完成',
  `attr01` varchar(100) DEFAULT NULL,
  `attr02` varchar(100) DEFAULT NULL,
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `last_time` date DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='预约数据字典';

-- ----------------------------
-- Records of e_appointment
-- ----------------------------

-- ----------------------------
-- Table structure for `e_course`
-- ----------------------------
DROP TABLE IF EXISTS `e_course`;
CREATE TABLE `e_course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '课程id',
  `name` varchar(50) NOT NULL COMMENT '课程名称',
  `url` varchar(50) DEFAULT NULL COMMENT '课件地址',
  `version` varchar(50) DEFAULT NULL COMMENT '课件版本',
  `status` varchar(10) DEFAULT NULL COMMENT '开课状态 ON/OFF',
  `attr01` varchar(100) DEFAULT NULL,
  `attr02` varchar(100) DEFAULT NULL,
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `last_time` date DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of e_course
-- ----------------------------

-- ----------------------------
-- Table structure for `e_order`
-- ----------------------------
DROP TABLE IF EXISTS `e_order`;
CREATE TABLE `e_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `order_no` varchar(64) DEFAULT NULL COMMENT '记录主订单号',
  `fav_total` double(20,2) DEFAULT NULL COMMENT '优惠总价',
  `amount` decimal(20,2) DEFAULT NULL COMMENT '记录主订单总额',
  `quantity` bigint(20) DEFAULT NULL COMMENT '记录主订单的商品数量',
  `equipment` varchar(50) DEFAULT NULL COMMENT '设备编号',
  `warehouse_code` varchar(20) DEFAULT NULL COMMENT '记录主订单所属门店或仓库的编号,引用t_warehouse.num',
  `payment_type` varchar(64) DEFAULT NULL COMMENT '记录主订单支付类型——支付宝、虹支付、微信',
  `status` varchar(64) DEFAULT NULL COMMENT '记录主订单状态——成功、失败',
  `remark` varchar(256) DEFAULT NULL COMMENT '备注',
  `attr01` varchar(256) DEFAULT NULL COMMENT '预留扩展属性01',
  `attr02` varchar(256) DEFAULT NULL COMMENT '预留扩展属性02',
  `attr03` varchar(256) DEFAULT NULL COMMENT '预留扩展属性03',
  `create_date` datetime DEFAULT NULL COMMENT '记录创建时间',
  `last_update` datetime DEFAULT NULL COMMENT '记录最后更新时间',
  `openid` varchar(50) DEFAULT NULL COMMENT '微信号id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_index` (`order_no`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=94 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of e_order
-- ----------------------------
INSERT INTO `e_order` VALUES ('93', '20171103134291464917146765751382', null, '0.01', null, '323', null, 'WX', null, null, null, null, null, '2017-11-03 11:31:41', null, 'wx24234');

-- ----------------------------
-- Table structure for `e_teacher`
-- ----------------------------
DROP TABLE IF EXISTS `e_teacher`;
CREATE TABLE `e_teacher` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(20) NOT NULL COMMENT '教师姓名',
  `type` varchar(20) DEFAULT NULL COMMENT '教师类别（职业教师）',
  `nationality` varchar(20) DEFAULT NULL COMMENT '国籍',
  `level` varchar(20) DEFAULT NULL COMMENT '等级',
  `payment` decimal(20,4) DEFAULT NULL COMMENT '收费（元）',
  `unit` varchar(10) DEFAULT NULL COMMENT '收费标准（H/D/M）',
  `teacher_time` decimal(20,4) DEFAULT NULL COMMENT '已受课时',
  `self_evaluation` varchar(500) DEFAULT NULL COMMENT '自我评价',
  `socre` varchar(10) DEFAULT NULL COMMENT '评分',
  `student_count` int(11) DEFAULT NULL COMMENT '学生人数',
  `start_time` date DEFAULT NULL COMMENT '教学开始时间',
  `pic_url` varchar(50) DEFAULT NULL COMMENT '图片地址',
  `attr01` varchar(100) DEFAULT NULL,
  `attr02` varchar(100) DEFAULT NULL,
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `last_time` date DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='教师数据字典';

-- ----------------------------
-- Records of e_teacher
-- ----------------------------

-- ----------------------------
-- Table structure for `e_user`
-- ----------------------------
DROP TABLE IF EXISTS `e_user`;
CREATE TABLE `e_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '注册人id',
  `name` varchar(50) DEFAULT NULL COMMENT '注册人姓名',
  `age` int(11) DEFAULT NULL COMMENT '注册人年龄',
  `sex` varchar(10) DEFAULT NULL COMMENT '注册人性别',
  `guardian` varchar(10) DEFAULT NULL COMMENT '监护人',
  `guardian_type` varchar(20) DEFAULT NULL COMMENT '监护人关系（父母）',
  `guardian_mobile` varchar(20) DEFAULT NULL COMMENT '监护人手机号',
  `openid` varchar(32) DEFAULT NULL COMMENT '监护人微信号',
  `pic_url` varchar(50) DEFAULT NULL COMMENT '图片地址',
  `attr01` varchar(100) DEFAULT NULL,
  `attr02` varchar(100) DEFAULT NULL,
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `last_time` date DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='注册人数据字典';

-- ----------------------------
-- Records of e_user
-- ----------------------------

-- ----------------------------
-- Table structure for `e_weixin`
-- ----------------------------
DROP TABLE IF EXISTS `e_weixin`;
CREATE TABLE `e_weixin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `openid` varchar(50) DEFAULT NULL COMMENT '微信号id',
  `name` varchar(100) DEFAULT NULL COMMENT '公众号名称',
  `pic_url` varchar(500) DEFAULT NULL COMMENT '图像地址',
  `attr01` varchar(100) DEFAULT NULL,
  `attr02` varchar(100) DEFAULT NULL,
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `last_time` date DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='微信公众号数据字典';

-- ----------------------------
-- Records of e_weixin
-- ----------------------------
