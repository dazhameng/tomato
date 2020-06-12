package com.dzm.tomato.admin.dao;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;

public final class SysLogDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.00563+09:00", comments="Source Table: sys_log")
    public static final SysLog sysLog = new SysLog();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005821+09:00", comments="Source field: sys_log.id")
    public static final SqlColumn<Long> id = sysLog.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005876+09:00", comments="Source field: sys_log.user_name")
    public static final SqlColumn<String> userName = sysLog.userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005925+09:00", comments="Source field: sys_log.operation")
    public static final SqlColumn<String> operation = sysLog.operation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005973+09:00", comments="Source field: sys_log.method")
    public static final SqlColumn<String> method = sysLog.method;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.006024+09:00", comments="Source field: sys_log.params")
    public static final SqlColumn<String> params = sysLog.params;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.006073+09:00", comments="Source field: sys_log.time")
    public static final SqlColumn<Long> time = sysLog.time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.00612+09:00", comments="Source field: sys_log.ip")
    public static final SqlColumn<String> ip = sysLog.ip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.00617+09:00", comments="Source field: sys_log.remark")
    public static final SqlColumn<String> remark = sysLog.remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.006218+09:00", comments="Source field: sys_log.create_by")
    public static final SqlColumn<String> createBy = sysLog.createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.00627+09:00", comments="Source field: sys_log.create_time")
    public static final SqlColumn<Date> createTime = sysLog.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.00632+09:00", comments="Source field: sys_log.last_update_by")
    public static final SqlColumn<String> lastUpdateBy = sysLog.lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.00637+09:00", comments="Source field: sys_log.last_update_time")
    public static final SqlColumn<Date> lastUpdateTime = sysLog.lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.006421+09:00", comments="Source field: sys_log.dept_flag")
    public static final SqlColumn<Byte> deptFlag = sysLog.deptFlag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005712+09:00", comments="Source Table: sys_log")
    public static final class SysLog extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> userName = column("user_name", JDBCType.VARCHAR);

        public final SqlColumn<String> operation = column("operation", JDBCType.VARCHAR);

        public final SqlColumn<String> method = column("method", JDBCType.VARCHAR);

        public final SqlColumn<String> params = column("params", JDBCType.VARCHAR);

        public final SqlColumn<Long> time = column("time", JDBCType.BIGINT);

        public final SqlColumn<String> ip = column("ip", JDBCType.VARCHAR);

        public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

        public final SqlColumn<String> createBy = column("create_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> lastUpdateBy = column("last_update_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastUpdateTime = column("last_update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Byte> deptFlag = column("dept_flag", JDBCType.TINYINT);

        public SysLog() {
            super("sys_log");
        }
    }
}