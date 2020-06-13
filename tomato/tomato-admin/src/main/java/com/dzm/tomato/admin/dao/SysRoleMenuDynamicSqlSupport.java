package com.dzm.tomato.admin.dao;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;

public final class SysRoleMenuDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.495804+09:00", comments="Source Table: sys_role_menu")
    public static final SysRoleMenu sysRoleMenu = new SysRoleMenu();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.495935+09:00", comments="Source field: sys_role_menu.id")
    public static final SqlColumn<Long> id = sysRoleMenu.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.495981+09:00", comments="Source field: sys_role_menu.role_id")
    public static final SqlColumn<Long> roleId = sysRoleMenu.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.496022+09:00", comments="Source field: sys_role_menu.menu_id")
    public static final SqlColumn<Long> menuId = sysRoleMenu.menuId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.496062+09:00", comments="Source field: sys_role_menu.create_by")
    public static final SqlColumn<String> createBy = sysRoleMenu.createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.496105+09:00", comments="Source field: sys_role_menu.create_time")
    public static final SqlColumn<Date> createTime = sysRoleMenu.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.496145+09:00", comments="Source field: sys_role_menu.last_update_by")
    public static final SqlColumn<String> lastUpdateBy = sysRoleMenu.lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.496185+09:00", comments="Source field: sys_role_menu.last_update_time")
    public static final SqlColumn<Date> lastUpdateTime = sysRoleMenu.lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.495873+09:00", comments="Source Table: sys_role_menu")
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