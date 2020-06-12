package com.dzm.tomato.admin.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysRoleMenuDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.022127+09:00", comments="Source Table: sys_role_menu")
    public static final SysRoleMenu sysRoleMenu = new SysRoleMenu();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.022287+09:00", comments="Source field: sys_role_menu.id")
    public static final SqlColumn<Long> id = sysRoleMenu.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.022333+09:00", comments="Source field: sys_role_menu.role_id")
    public static final SqlColumn<Long> roleId = sysRoleMenu.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.022373+09:00", comments="Source field: sys_role_menu.menu_id")
    public static final SqlColumn<Long> menuId = sysRoleMenu.menuId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.022409+09:00", comments="Source field: sys_role_menu.create_by")
    public static final SqlColumn<String> createBy = sysRoleMenu.createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.022448+09:00", comments="Source field: sys_role_menu.create_time")
    public static final SqlColumn<Date> createTime = sysRoleMenu.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.022492+09:00", comments="Source field: sys_role_menu.last_update_by")
    public static final SqlColumn<String> lastUpdateBy = sysRoleMenu.lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.022529+09:00", comments="Source field: sys_role_menu.last_update_time")
    public static final SqlColumn<Date> lastUpdateTime = sysRoleMenu.lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.022229+09:00", comments="Source Table: sys_role_menu")
    public static final class SysRoleMenu extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> roleId = column("role_id", JDBCType.BIGINT);

        public final SqlColumn<Long> menuId = column("menu_id", JDBCType.BIGINT);

        public final SqlColumn<String> createBy = column("create_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> lastUpdateBy = column("last_update_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastUpdateTime = column("last_update_time", JDBCType.TIMESTAMP);

        public SysRoleMenu() {
            super("sys_role_menu");
        }
    }
}