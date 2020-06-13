package com.dzm.tomato.admin.dao;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;

public final class SysLoginLogDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.482104+09:00", comments="Source Table: sys_login_log")
    public static final SysLoginLog sysLoginLog = new SysLoginLog();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.482266+09:00", comments="Source field: sys_login_log.id")
    public static final SqlColumn<Long> id = sysLoginLog.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.482325+09:00", comments="Source field: sys_login_log.user_name")
    public static final SqlColumn<String> userName = sysLoginLog.userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.482377+09:00", comments="Source field: sys_login_log.status")
    public static final SqlColumn<String> status = sysLoginLog.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.482426+09:00", comments="Source field: sys_login_log.ip")
    public static final SqlColumn<String> ip = sysLoginLog.ip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.482491+09:00", comments="Source field: sys_login_log.create_by")
    public static final SqlColumn<String> createBy = sysLoginLog.createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.48255+09:00", comments="Source field: sys_login_log.create_time")
    public static final SqlColumn<Date> createTime = sysLoginLog.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.482601+09:00", comments="Source field: sys_login_log.last_update_by")
    public static final SqlColumn<String> lastUpdateBy = sysLoginLog.lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.482659+09:00", comments="Source field: sys_login_log.last_update_time")
    public static final SqlColumn<Date> lastUpdateTime = sysLoginLog.lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.48219+09:00", comments="Source Table: sys_login_log")
    public static final class SysLoginLog extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> userName = column("user_name", JDBCType.VARCHAR);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<String> ip = column("ip", JDBCType.VARCHAR);

        public final SqlColumn<String> createBy = column("create_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> lastUpdateBy = column("last_update_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastUpdateTime = column("last_update_time", JDBCType.TIMESTAMP);

        public SysLoginLog() {
            super("sys_login_log");
        }
    }
}