package com.dzm.tomato.admin.dao;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;

public final class SysMenuDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.012945+09:00", comments="Source Table: sys_menu")
    public static final SysMenu sysMenu = new SysMenu();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.013091+09:00", comments="Source field: sys_menu.id")
    public static final SqlColumn<Long> id = sysMenu.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.013142+09:00", comments="Source field: sys_menu.name")
    public static final SqlColumn<String> name = sysMenu.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.013187+09:00", comments="Source field: sys_menu.parent_id")
    public static final SqlColumn<Long> parentId = sysMenu.parentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.01323+09:00", comments="Source field: sys_menu.url")
    public static final SqlColumn<String> url = sysMenu.url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.013272+09:00", comments="Source field: sys_menu.perms")
    public static final SqlColumn<String> perms = sysMenu.perms;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.013315+09:00", comments="Source field: sys_menu.type")
    public static final SqlColumn<Integer> type = sysMenu.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.013357+09:00", comments="Source field: sys_menu.icon")
    public static final SqlColumn<String> icon = sysMenu.icon;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.013398+09:00", comments="Source field: sys_menu.order_num")
    public static final SqlColumn<Integer> orderNum = sysMenu.orderNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.013438+09:00", comments="Source field: sys_menu.remark")
    public static final SqlColumn<String> remark = sysMenu.remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.013479+09:00", comments="Source field: sys_menu.create_by")
    public static final SqlColumn<String> createBy = sysMenu.createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.013532+09:00", comments="Source field: sys_menu.create_time")
    public static final SqlColumn<Date> createTime = sysMenu.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.013574+09:00", comments="Source field: sys_menu.last_update_by")
    public static final SqlColumn<String> lastUpdateBy = sysMenu.lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.013617+09:00", comments="Source field: sys_menu.last_update_time")
    public static final SqlColumn<Date> lastUpdateTime = sysMenu.lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.01366+09:00", comments="Source field: sys_menu.dept_flag")
    public static final SqlColumn<Byte> deptFlag = sysMenu.deptFlag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.013022+09:00", comments="Source Table: sys_menu")
    public static final class SysMenu extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentId = column("parent_id", JDBCType.BIGINT);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<String> perms = column("perms", JDBCType.VARCHAR);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public final SqlColumn<String> icon = column("icon", JDBCType.VARCHAR);

        public final SqlColumn<Integer> orderNum = column("order_num", JDBCType.INTEGER);

        public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

        public final SqlColumn<String> createBy = column("create_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> lastUpdateBy = column("last_update_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastUpdateTime = column("last_update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Byte> deptFlag = column("dept_flag", JDBCType.TINYINT);

        public SysMenu() {
            super("sys_menu");
        }
    }
}