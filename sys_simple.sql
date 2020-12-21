/*
 Navicat Premium Data Transfer

 Source Server         : MySQL8.0
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : test.com:3306
 Source Schema         : ls_test

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 18/12/2020 15:28:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_id_generator
-- ----------------------------
DROP TABLE IF EXISTS `sys_id_generator`;
CREATE TABLE `sys_id_generator`
(
    `id`       int                                                          NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `pk_name`  varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键名',
    `pk_value` bigint                                                       NOT NULL COMMENT '主键值',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_privilege
-- ----------------------------
DROP TABLE IF EXISTS `sys_privilege`;
CREATE TABLE `sys_privilege`
(
    `id`             bigint                                                        NOT NULL COMMENT 'ID',
    `privilege_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci  NULL DEFAULT NULL COMMENT '权限名',
    `privilege_url`  varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '权限URL',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '权限表'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`
(
    `id`          bigint                                                       NOT NULL COMMENT 'ID',
    `role_name`   varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '角色名',
    `enabled`     int                                                          NULL DEFAULT NULL COMMENT '有效标志',
    `create_by`   bigint                                                       NULL DEFAULT NULL COMMENT '创建人',
    `create_time` datetime(0)                                                  NULL DEFAULT NULL COMMENT '创建时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '角色表'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_role_privilege
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_privilege`;
CREATE TABLE `sys_role_privilege`
(
    `role_id`      bigint NULL DEFAULT NULL COMMENT '角色ID',
    `privilege_id` bigint NULL DEFAULT NULL COMMENT '权限ID'
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '角色权限关联表'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`
(
    `id`            bigint                                                       NOT NULL COMMENT 'ID',
    `user_name`     varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `user_password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `user_email`    varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱',
    `user_info`     text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci        NULL COMMENT '简介',
    `user_avatar`   blob                                                         NULL COMMENT '头像',
    `create_time`   datetime(0)                                                  NULL DEFAULT NULL COMMENT '创建时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '用户表'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role`
(
    `user_id` bigint NOT NULL COMMENT '用户ID',
    `role_id` bigint NULL DEFAULT NULL COMMENT '角色ID'
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '用户角色关联表'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_department
-- ----------------------------
DROP TABLE IF EXISTS `t_department`;
CREATE TABLE `t_department`
(
    `id`              bigint                                                       NOT NULL COMMENT 'ID',
    `department_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '部门名称',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_employee
-- ----------------------------
DROP TABLE IF EXISTS `t_employee`;
CREATE TABLE `t_employee`
(
    `id`            bigint                                                       NOT NULL COMMENT 'ID',
    `employee_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工姓名',
    `department_id` bigint                                                       NULL DEFAULT NULL COMMENT '部门ID',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
  ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;



INSERT INTO `sys_user`(`id`, `user_name`, `user_password`, `user_email`, `user_info`, `user_avatar`, `create_time`)
VALUES (1, '管理员', '123456', 'admin@ls.com', NULL, NULL, '2020-12-15 15:08:32');
INSERT INTO `sys_user`(`id`, `user_name`, `user_password`, `user_email`, `user_info`, `user_avatar`, `create_time`)
VALUES (1001, '離桜', '123', 'lostsakura@qq.com', NULL, NULL, '2020-12-15 15:10:26');


INSERT INTO `sys_role`(`id`, `role_name`, `enabled`, `create_by`, `create_time`)
VALUES (1, '超级管理员', 1, 1, '2020-12-15 15:11:21');
INSERT INTO `sys_role`(`id`, `role_name`, `enabled`, `create_by`, `create_time`)
VALUES (2, '测试用户', 1, 1, '2020-12-15 15:11:38');

INSERT INTO `sys_user_role`(`user_id`, `role_id`)
VALUES (1, 1);
INSERT INTO `sys_user_role`(`user_id`, `role_id`)
VALUES (1, 2);
INSERT INTO `sys_user_role`(`user_id`, `role_id`)
VALUES (1001, 2);


INSERT INTO `sys_privilege`(`id`, `privilege_name`, `privilege_url`)
VALUES (1, '用户管理', '/users');
INSERT INTO `sys_privilege`(`id`, `privilege_name`, `privilege_url`)
VALUES (2, '角色管理', '/roles');
INSERT INTO `sys_privilege`(`id`, `privilege_name`, `privilege_url`)
VALUES (3, '系统日志', '/logs');
INSERT INTO `sys_privilege`(`id`, `privilege_name`, `privilege_url`)
VALUES (4, '人员维护', '/persons');
INSERT INTO `sys_privilege`(`id`, `privilege_name`, `privilege_url`)
VALUES (5, '单位维护', '/companies');


INSERT INTO `sys_role_privilege`(`role_id`, `privilege_id`)
VALUES (1, 1);
INSERT INTO `sys_role_privilege`(`role_id`, `privilege_id`)
VALUES (1, 2);
INSERT INTO `sys_role_privilege`(`role_id`, `privilege_id`)
VALUES (1, 3);
INSERT INTO `sys_role_privilege`(`role_id`, `privilege_id`)
VALUES (2, 4);
INSERT INTO `sys_role_privilege`(`role_id`, `privilege_id`)
VALUES (2, 5);


INSERT INTO `t_department` VALUES (1, '开发部门');
INSERT INTO `t_department` VALUES (2, '后勤部门');
INSERT INTO `t_department` VALUES (3, '销售部门');


INSERT INTO `t_employee` VALUES (1, 'lidongxu', 1);
INSERT INTO `t_employee` VALUES (2, 'xiaoming', 2);
INSERT INTO `t_employee` VALUES (3, 'xiaoliang', 3);