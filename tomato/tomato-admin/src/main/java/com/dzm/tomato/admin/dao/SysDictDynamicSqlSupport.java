package com.dzm.tomato.admin.dao;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;

public final class SysDictDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.473372+09:00", comments="Source Table: sys_dict")
    public static final SysDict sysDict = new SysDict();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.47357+09:00", comments="Source field: sys_dict.id")
    public static final SqlColumn<Long> id = sysDict.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.473631+09:00", comments="Source field: sys_dict.value")
    public static final SqlColumn<String> value = sysDict.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.473687+09:00", comments="Source field: sys_dict.label")
    public static final SqlColumn<String> label = sysDict.label;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.473743+09:00", comments="Source field: sys_dict.type")
    public static final SqlColumn<String> type = sysDict.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.473804+09:00", comments="Source field: sys_dict.description")
    public static final SqlColumn<String> description = sysDict.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.473862+09:00", comments="Source field: sys_dict.sort")
    public static final SqlColumn<Long> sort = sysDict.sort;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.473916+09:00", comments="Source field: sys_dict.remark")
    public static final SqlColumn<String> remark = sysDict.remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.473971+09:00", comments="Source field: sys_dict.create_by")
    public static final SqlColumn<String> createBy = sysDict.createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.474029+09:00", comments="Source field: sys_dict.create_time")
    public static final SqlColumn<Date> createTime = sysDict.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.474084+09:00", comments="Source field: sys_dict.last_update_by")
    public static final SqlColumn<String> lastUpdateBy = sysDict.lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.474143+09:00", comments="Source field: sys_dict.last_update_time")
    public static final SqlColumn<Date> lastUpdateTime = sysDict.lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.474197+09:00", comments="Source field: sys_dict.dept_flag")
    public static final SqlColumn<Byte> deptFlag = sysDict.deptFlag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.473469+09:00", comments="Source Table: sys_dict")
    public static final class SysDict extends SqlTable {
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

        public SysDict() {
            super("sys_dict");
        }
    }
}