CREATE TABLE `sys_user`(
    `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT '编号',
    `name` VARCHAR (50) NOT NULL COMMENT '用户名',
    `nick_name` VARCHAR (150) DEFAULT NULL COMMENT '昵称',
    `avatar` VARCHAR (150) DEFAULT NULL COMMENT '头像', 
    `password` VARCHAR (100) DEFAULT NULL COMMENT '密码',
    `salt` VARCHAR (40) DEFAULT NULL COMMENT '密码加密盐',
    `email` VARCHAR (100) DEFAULT NULL COMMENT '邮箱',
    `mobile` VARCHAR (100) DEFAULT NULL COMMENT '手机号',
    `status` TINYINT (4) DEFAULT NULL COMMENT '状态 0：禁用 1：正常',
    `dept_id` BIGINT (20) DEFAULT NULL COMMENT '机构ID',
    `remark` VARCHAR (200) DEFAULT NULL COMMENT '备注',
    `create_by` VARCHAR (50) DEFAULT NULL COMMENT '创建人',
    `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
    `last_update_by` VARCHAR (50) DEFAULT NULL COMMENT '更新人',
    `last_update_time` DATETIME DEFAULT NULL COMMENT '更新时间',
    `dept_flag` TINYINT (4) DEFAULT '0' COMMENT '是否删除   -1：已经删除    0：正常',
    PRIMARY KEY (`id`),
    UNIQUE KEY (`name`)
) ENGINE=InnoDB AUTO_INCREMENT = 32 DEFAULT CHARSET=utf8 COMMENT = '用户表';

CREATE TABLE `sys_role` (
    `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT '编号',
    `name` VARCHAR (100) DEFAULT NULL COMMENT '角色名称',
    `remark` VARCHAR (200) DEFAULT NULL COMMENT '备注',
    `create_by` VARCHAR (50) DEFAULT NULL COMMENT '创建人',
    `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
    `last_update_by` VARCHAR (50) DEFAULT NULL COMMENT '更新人',
    `last_update_time` DATETIME DEFAULT NULL COMMENT '更新时间',
    `dept_flag` TINYINT (4) DEFAULT '0' COMMENT '是否删除   -1：已经删除    0：正常',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT = 8 DEFAULT CHARSET=utf8 COMMENT = '角色表';

CREATE TABLE `sys_dept` (
    `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT '编号',
    `name` VARCHAR (100) DEFAULT NULL COMMENT '机构名称',
    `parent_id` BIGINT (20) DEFAULT NULL COMMENT '上级机构ID，最高级为0',
    `order_num` INT (11) DEFAULT NULL COMMENT '排序',
    `remark` VARCHAR (200) DEFAULT NULL COMMENT '备注',
    `create_by` VARCHAR (50) DEFAULT NULL COMMENT '创建人',
    `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
    `last_update_by` VARCHAR (50) DEFAULT NULL COMMENT '更新人',
    `last_update_time` DATETIME DEFAULT NULL COMMENT '更新时间',
    `dept_flag` TINYINT (4) DEFAULT '0' COMMENT '是否删除   -1：已经删除    0：正常',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT = 32 DEFAULT CHARSET=utf8 COMMENT = '机构表';

CREATE TABLE `sys_menu` (
    `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT '编号',
    `name` VARCHAR (100) DEFAULT NULL COMMENT '菜单名称',
    `parent_id` BIGINT (20) DEFAULT NULL COMMENT '上级彩带ID，最高级为0',
    `url` VARCHAR (200) DEFAULT NULL COMMENT '菜单URL，类型：1普通页面（如用户管理，/sys/user）2嵌套完整外部页面连接，以Http(s)开头的连接 3嵌套服务器页面，使用iframe：前缀+目标URL（如SQL监控， iframe:/druid/login.html, iframe: 前缀会替换为服务器地址）',
    `perms` VARCHAR (500) DEFAULT NULL COMMENT '授权（多个逗号分隔，如：sys:user:add,sys:user:edit）',
    `type` int(11) DEFAULT NULL COMMENT '类型   0：目录 1：菜单 2：按钮',
    `icon` VARCHAR (50) DEFAULT NULL COMMENT '菜单图标',
    `order_num` INT (11) DEFAULT NULL COMMENT '排序',
    `remark` VARCHAR (200) DEFAULT NULL COMMENT '备注',
    `create_by` VARCHAR (50) DEFAULT NULL COMMENT '创建人',
    `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
    `last_update_by` VARCHAR (50) DEFAULT NULL COMMENT '更新人',
    `last_update_time` DATETIME DEFAULT NULL COMMENT '更新时间',
    `dept_flag` TINYINT (4) DEFAULT '0' COMMENT '是否删除   -1：已经删除    0：正常',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT = 40 DEFAULT CHARSET=utf8 COMMENT = '菜单表';


CREATE TABLE `sys_user_role`(
    `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT '编号',
    `user_id` BIGINT (20) DEFAULT NULL COMMENT '用户ID',
    `role_id` BIGINT (20) DEFAULT NULL COMMENT '角色ID',
    `create_by` VARCHAR (50) DEFAULT NULL COMMENT '创建人',
    `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
    `last_update_by` VARCHAR (50) DEFAULT NULL COMMENT '更新人',
    `last_update_time` DATETIME DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT = 68 DEFAULT CHARSET=utf8 COMMENT = '用户角色';

CREATE TABLE `sys_role_menu`(
    `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT '编号',
    `role_id` BIGINT (20) DEFAULT NULL COMMENT '角色ID',
    `menu_id` BIGINT (20) DEFAULT NULL COMMENT '菜单ID',
    `create_by` VARCHAR (50) DEFAULT NULL COMMENT '创建人',
    `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
    `last_update_by` VARCHAR (50) DEFAULT NULL COMMENT '更新人',
    `last_update_time` DATETIME DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT = 256 DEFAULT CHARSET=utf8 COMMENT = '角色菜单';

CREATE TABLE `sys_role_dept`(
    `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT '编号',
    `role_id` BIGINT (20) DEFAULT NULL COMMENT '角色ID',
    `dept_id` BIGINT (20) DEFAULT NULL COMMENT '机构ID',
    `create_by` VARCHAR (50) DEFAULT NULL COMMENT '创建人',
    `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
    `last_update_by` VARCHAR (50) DEFAULT NULL COMMENT '更新人',
    `last_update_time` DATETIME DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT = 4 DEFAULT CHARSET=utf8 COMMENT = '角色机构';


CREATE TABLE `sys_dict` (
    `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT '编号',
    `value` VARCHAR (100) NOT NULL COMMENT '数据值',
    `label` VARCHAR (100) NOT NULL COMMENT '标签',
    `type` VARCHAR (100) NOT NULL COMMENT '类型',
    `description` VARCHAR (100) NOT NULL COMMENT '描述',
    `sort` DECIMAL (10, 0) NOT NULL COMMENT '排序',
    `remark` VARCHAR (200) DEFAULT NULL COMMENT '备注',
    `create_by` VARCHAR (50) DEFAULT NULL COMMENT '创建人',
    `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
    `last_update_by` VARCHAR (50) DEFAULT NULL COMMENT '更新人',
    `last_update_time` DATETIME DEFAULT NULL COMMENT '更新时间',
    `dept_flag` TINYINT (4) DEFAULT '0' COMMENT '是否删除   -1：已经删除    0：正常',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT = 4 DEFAULT CHARSET=utf8 COMMENT = '字典表';

CREATE TABLE `sys_config` (
    `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT '编号',
    `value` VARCHAR (100) NOT NULL COMMENT '数据值',
    `label` VARCHAR (100) NOT NULL COMMENT '标签',
    `type` VARCHAR (100) NOT NULL COMMENT '类型',
    `description` VARCHAR (100) NOT NULL COMMENT '描述',
    `sort` DECIMAL (10, 0) NOT NULL COMMENT '排序',
    `remark` VARCHAR (200) DEFAULT NULL COMMENT '备注',
    `create_by` VARCHAR (50) DEFAULT NULL COMMENT '创建人',
    `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
    `last_update_by` VARCHAR (50) DEFAULT NULL COMMENT '更新人',
    `last_update_time` DATETIME DEFAULT NULL COMMENT '更新时间',
    `dept_flag` TINYINT (4) DEFAULT '0' COMMENT '是否删除   -1：已经删除    0：正常',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT = 4 DEFAULT CHARSET=utf8 COMMENT = '系统配置表';

CREATE TABLE `sys_log` (
    `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT '编号',
    `user_name` VARCHAR (50) DEFAULT NULL COMMENT '用户名',
    `operation` VARCHAR (50) DEFAULT NULL COMMENT '操作',
    `method` VARCHAR (200) DEFAULT NULL COMMENT '请求方法',
    `params` VARCHAR (5000) DEFAULT NULL COMMENT '请求参数',
    `time` BIGINT (20) NOT NULL COMMENT '执行时间',
    `ip` VARCHAR (64) DEFAULT NULL COMMENT 'ip地址',
    `remark` VARCHAR (200) DEFAULT NULL COMMENT '备注',
    `create_by` VARCHAR (50) DEFAULT NULL COMMENT '创建人',
    `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
    `last_update_by` VARCHAR (50) DEFAULT NULL COMMENT '更新人',
    `last_update_time` DATETIME DEFAULT NULL COMMENT '更新时间',
    `dept_flag` TINYINT (4) DEFAULT '0' COMMENT '是否删除   -1：已经删除    0：正常',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT = 64 DEFAULT CHARSET=utf8 COMMENT = '系统日志表';

CREATE TABLE `sys_login_log` (
    `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT '编号',
    `user_name` VARCHAR (50) DEFAULT NULL COMMENT '用户名',
    `status` VARCHAR (50) DEFAULT NULL COMMENT '登录状态',
    `ip` VARCHAR (64) DEFAULT NULL COMMENT 'IP地址',
    `create_by` VARCHAR (50) DEFAULT NULL COMMENT '创建人',
    `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
    `last_update_by` VARCHAR (50) DEFAULT NULL COMMENT '更新人',
    `last_update_time` DATETIME DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT = 4 DEFAULT CHARSET=utf8 COMMENT = '系统登录日志';
