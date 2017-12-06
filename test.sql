/*
MySQL Data Transfer
Source Host: localhost
Source Database: test
Target Host: localhost
Target Database: test
Date: 2017/12/6 12:37:34
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for tb_business
-- ----------------------------
DROP TABLE IF EXISTS `tb_business`;
CREATE TABLE `tb_business` (
  `id` int(11) NOT NULL auto_increment,
  `detail` varchar(255) default NULL,
  `price` int(11) default NULL,
  `bdate` date default NULL,
  `createby` varchar(255) default NULL,
  `type` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1001 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_employee
-- ----------------------------
DROP TABLE IF EXISTS `tb_employee`;
CREATE TABLE `tb_employee` (
  `id` int(11) NOT NULL auto_increment,
  `num` varchar(255) default NULL,
  `name` varchar(255) default NULL,
  `gender` varchar(255) default NULL,
  `phonenum` varchar(255) default NULL,
  `cardnum` varchar(255) default NULL,
  `department` varchar(255) default NULL,
  `level` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_evaluate
-- ----------------------------
DROP TABLE IF EXISTS `tb_evaluate`;
CREATE TABLE `tb_evaluate` (
  `id` int(11) NOT NULL auto_increment,
  `cusname` varchar(255) default NULL,
  `detail` varchar(255) default NULL,
  `type` varchar(255) default NULL,
  `sdate` date default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_notice
-- ----------------------------
DROP TABLE IF EXISTS `tb_notice`;
CREATE TABLE `tb_notice` (
  `noticeid` int(11) NOT NULL auto_increment,
  `title` varchar(255) default NULL,
  `days` int(11) default NULL,
  `detail` varchar(255) default NULL,
  `status` int(11) default NULL,
  `createby` varchar(255) default NULL,
  `createdate` date default NULL,
  PRIMARY KEY  (`noticeid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_room_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_room_info`;
CREATE TABLE `tb_room_info` (
  `roomId` int(11) NOT NULL auto_increment,
  `roomnum` varchar(255) default NULL COMMENT '房间号',
  `type` int(1) default NULL COMMENT '间房类型：1标间2大床房3双人间4豪华套间',
  `price` int(50) default NULL COMMENT '房价价位，必须整数',
  `status` int(1) default NULL COMMENT '间房状态：1正常2已坏3维修中',
  `description` varchar(255) default NULL COMMENT '涉及房间描述',
  PRIMARY KEY  (`roomId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL auto_increment,
  `userName` varchar(16) character set latin1 default NULL,
  `password` varchar(50) character set latin1 default NULL,
  `gender` int(11) default NULL,
  `type` int(1) default NULL,
  PRIMARY KEY  (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=1000002 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `tb_business` VALUES ('997', '我也不知道写啥', '10000', '2017-12-02', 'H3301', '正常营业');
INSERT INTO `tb_business` VALUES ('998', '很烦啊', '10000', '2017-12-03', 'H4565', '折扣营业');
INSERT INTO `tb_business` VALUES ('999', '真的很烦啊', '10000', '2017-11-15', 'S1154', '正常营业');
INSERT INTO `tb_business` VALUES ('1000', '入住两晚', '1000', '2017-12-02', 'B3325', '正常营业');
INSERT INTO `tb_employee` VALUES ('1', 'H2315', '张三feng', '男', 'asdfasdf', '123456199410026548', '后勤部', '部门经理');
INSERT INTO `tb_employee` VALUES ('2', 'H3306', '李四', '男', '15399596485', '486591199410026581', '后勤部', '普通员工');
INSERT INTO `tb_employee` VALUES ('3', 'H4233', '王五', '女', '15384659718', '159753199410026548', '后勤部', '高级员工');
INSERT INTO `tb_employee` VALUES ('4', 'S6548', '张三', '男', '15848481515', '481598199518251748', '后勤部', '部门经理');
INSERT INTO `tb_employee` VALUES ('5', 'S7485', '李四', '男', '18544231948', '485196199410068475', '后勤部', '普通员工');
INSERT INTO `tb_employee` VALUES ('6', 'B9874', '张三', '男', '18577415262', '878456194852156989', '后勤部', '部门经理');
INSERT INTO `tb_employee` VALUES ('7', 'B8875', '李四', '女', '18654987524', '485962314758958556', '后勤部', '普通员工');
INSERT INTO `tb_evaluate` VALUES ('1000', '张三', '屋内整洁，采光好', '好评', '2017-12-02');
INSERT INTO `tb_evaluate` VALUES ('1001', '李四', '采光不好  隔音不好', '差评', '2017-12-02');
INSERT INTO `tb_evaluate` VALUES ('1002', '张伟', '采光好  但是隔音不好', '中评', '2017-12-02');
INSERT INTO `tb_evaluate` VALUES ('1003', '韩梅梅', '反正是好评了', '好评', '2017-11-01');
INSERT INTO `tb_notice` VALUES ('1', '阿斯顿发就', '1', '啊手动阀手动阀', '1', 'admin', '2017-12-03');
INSERT INTO `tb_room_info` VALUES ('1', 'B1308', '3', '5000', '2', '基本设施齐全，标间,asdfasdfasdf');
INSERT INTO `tb_room_info` VALUES ('2', 'B2307', '2', '500', '1', '基本设施齐全，大床房,asdfsdf');
INSERT INTO `tb_room_info` VALUES ('3', 'B3306', '1', '3000', '1', '采光好，无噪音，豪华套间asdfasdfsadfsad');
INSERT INTO `tb_room_info` VALUES ('4', 'H1001', '3', '200', '1', '基本设施齐全，标间上帝发誓法师的');
INSERT INTO `tb_room_info` VALUES ('5', 'H2001', '2', '200', '1', '基本设施齐全，大床房健康可怜见立刻');
INSERT INTO `tb_room_info` VALUES ('6', 'H3001', '1', '2000', '1', '采光好，屋内设施齐全，豪华套间');
INSERT INTO `tb_room_info` VALUES ('7', 'H3002', '1', '2000', '1', '采光好，屋内设施齐全，豪华套间');
INSERT INTO `tb_room_info` VALUES ('8', 'S4213', '3', '500', '1', '基本设施齐全');
INSERT INTO `tb_room_info` VALUES ('9', 'S5111', '2', '500', '1', '基本设施齐全');
INSERT INTO `tb_room_info` VALUES ('10', 'S6645', '1', '3000', '1', '采光好，无噪音，豪华套间');
INSERT INTO `user` VALUES ('2', '1234567', '12399', '0', '1');
INSERT INTO `user` VALUES ('4', 'ooooooo', 'ooooooo', '0', '1');
INSERT INTO `user` VALUES ('5', 'ttttttt', 'ttttaaaa', '0', '1');
INSERT INTO `user` VALUES ('6', '1111111', '169685076028101752465647377301869637770', '1', '1');
INSERT INTO `user` VALUES ('7', '2222222', '2222555', '1', '1');
INSERT INTO `user` VALUES ('10', 'ttttuuuu', 'ttywwww', '1', '1');
INSERT INTO `user` VALUES ('16', '887743534534', '88776655', '1', '1');
INSERT INTO `user` VALUES ('28', 'admin', '44047210810420107506624974438055026627', '1', '2');
INSERT INTO `user` VALUES ('1000001', '22', 'ff', '0', '2');
