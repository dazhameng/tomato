package com.dzm.tomato.admin.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysConfigDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.990094+09:00", comments="Source Table: sys_config")
    public static final SysConfig sysConfig = new SysConfig();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.99051+09:00", comments="Source field: sys_config.id")
    public static final SqlColumn<Long> id = sysConfig.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.991084+09:00", comments="Source field: sys_config.value")
    public static final SqlColumn<String> value = sysConfig.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.991605+09:00", comments="Source field: sys_config.label")
    public static final SqlColumn<String> label = sysConfig.label;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.991733+09:00", comments="Source field: sys_config.type")
    public static final SqlColumn<String> type = sysConfig.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.991802+09:00", comments="Source field: sys_config.description")
    public static final SqlColumn<String> description = sysConfig.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.991866+09:00", comments="Source field: sys_config.sort")
    public static final SqlColumn<Long> sort = sysConfig.sort;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.991927+09:00", comments="Source field: sys_config.remark")
    public static final SqlColumn<String> remark = sysConfig.remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.991992+09:00", comments="Source field: sys_config.create_by")
    public static final SqlColumn<String> createBy = sysConfig.createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.992058+09:00", comments="Source field: sys_config.create_time")
    public static final SqlColumn<Date> createTime = sysConfig.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.992131+09:00", comments="Source field: sys_config.last_update_by")
    public static final SqlColumn<String> lastUpdateBy = sysConfig.lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.992199+09:00", comments="Source field: sys_config.last_update_time")
    public static final SqlColumn<Date> lastUpdateTime = sysConfig.lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.992335+09:00", comments="Source field: sys_config.dept_flag")
    public static final SqlColumn<Byte> deptFlag = sysConfig.deptFlag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.990363+09:00", comments="Source Table: sys_config")
    public static final class SysConfig extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public final SqlColumn<String> label = column("label", JDBCType.VARCHAR);

        public final SqlColumn<String> type = column("type", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<Long> sort = column("sort", JDBCType.DECIMAL);

        public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

        public final SqlColumn<String> createBy = column("create_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> lastUpdateBy = column("last_update_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastUpdateTime = column("last_update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Byte> deptFlag = column("dept_flag", JDBCType.TINYINT);

        public SysConfig() {
            super("sys_config");
        }
    }
}