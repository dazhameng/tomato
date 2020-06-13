package com.dzm.tomato.admin.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysLogDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.478138+09:00", comments="Source Table: sys_log")
    public static final SysLog sysLog = new SysLog();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.478366+09:00", comments="Source field: sys_log.id")
    public static final SqlColumn<Long> id = sysLog.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.478436+09:00", comments="Source field: sys_log.user_name")
    public static final SqlColumn<String> userName = sysLog.userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.478496+09:00", comments="Source field: sys_log.operation")
    public static final SqlColumn<String> operation = sysLog.operation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.478549+09:00", comments="Source field: sys_log.method")
    public static final SqlColumn<String> method = sysLog.method;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.4786+09:00", comments="Source field: sys_log.params")
    public static final SqlColumn<String> params = sysLog.params;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.478652+09:00", comments="Source field: sys_log.time")
    public static final SqlColumn<Long> time = sysLog.time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.478703+09:00", comments="Source field: sys_log.ip")
    public static final SqlColumn<String> ip = sysLog.ip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.478755+09:00", comments="Source field: sys_log.remark")
    public static final SqlColumn<String> remark = sysLog.remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.478821+09:00", comments="Source field: sys_log.create_by")
    public static final SqlColumn<String> createBy = sysLog.createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.47888+09:00", comments="Source field: sys_log.create_time")
    public static final SqlColumn<Date> createTime = sysLog.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.47893+09:00", comments="Source field: sys_log.last_update_by")
    public static final SqlColumn<String> lastUpdateBy = sysLog.lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.478983+09:00", comments="Source field: sys_log.last_update_time")
    public static final SqlColumn<Date> lastUpdateTime = sysLog.lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.479035+09:00", comments="Source field: sys_log.dept_flag")
    public static final SqlColumn<Byte> deptFlag = sysLog.deptFlag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.478232+09:00", comments="Source Table: sys_log")
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