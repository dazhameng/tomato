package com.dzm.tomato.admin.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysRoleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.016392+09:00", comments="Source Table: sys_role")
    public static final SysRole sysRole = new SysRole();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.016534+09:00", comments="Source field: sys_role.id")
    public static final SqlColumn<Long> id = sysRole.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.016581+09:00", comments="Source field: sys_role.name")
    public static final SqlColumn<String> name = sysRole.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.016623+09:00", comments="Source field: sys_role.remark")
    public static final SqlColumn<String> remark = sysRole.remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.016664+09:00", comments="Source field: sys_role.create_by")
    public static final SqlColumn<String> createBy = sysRole.createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.01671+09:00", comments="Source field: sys_role.create_time")
    public static final SqlColumn<Date> createTime = sysRole.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.016759+09:00", comments="Source field: sys_role.last_update_by")
    public static final SqlColumn<String> lastUpdateBy = sysRole.lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.016813+09:00", comments="Source field: sys_role.last_update_time")
    public static final SqlColumn<Date> lastUpdateTime = sysRole.lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.016858+09:00", comments="Source field: sys_role.dept_flag")
    public static final SqlColumn<Byte> deptFlag = sysRole.deptFlag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.016465+09:00", comments="Source Table: sys_role")
    public static final class SysRole extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

        public final SqlColumn<String> createBy = column("create_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> lastUpdateBy = column("last_update_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastUpdateTime = column("last_update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Byte> deptFlag = column("dept_flag", JDBCType.TINYINT);

        public SysRole() {
            super("sys_role");
        }
    }
}