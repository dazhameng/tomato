package com.dzm.tomato.admin.dao;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;

public final class SysRoleDeptDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.49294+09:00", comments="Source Table: sys_role_dept")
    public static final SysRoleDept sysRoleDept = new SysRoleDept();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.493166+09:00", comments="Source field: sys_role_dept.id")
    public static final SqlColumn<Long> id = sysRoleDept.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.493215+09:00", comments="Source field: sys_role_dept.role_id")
    public static final SqlColumn<Long> roleId = sysRoleDept.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.49326+09:00", comments="Source field: sys_role_dept.dept_id")
    public static final SqlColumn<Long> deptId = sysRoleDept.deptId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.493305+09:00", comments="Source field: sys_role_dept.create_by")
    public static final SqlColumn<String> createBy = sysRoleDept.createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.49335+09:00", comments="Source field: sys_role_dept.create_time")
    public static final SqlColumn<Date> createTime = sysRoleDept.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.493393+09:00", comments="Source field: sys_role_dept.last_update_by")
    public static final SqlColumn<String> lastUpdateBy = sysRoleDept.lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.493435+09:00", comments="Source field: sys_role_dept.last_update_time")
    public static final SqlColumn<Date> lastUpdateTime = sysRoleDept.lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.493056+09:00", comments="Source Table: sys_role_dept")
    public static final class SysRoleDept extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> roleId = column("role_id", JDBCType.BIGINT);

        public final SqlColumn<Long> deptId = column("dept_id", JDBCType.BIGINT);

        public final SqlColumn<String> createBy = column("create_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> lastUpdateBy = column("last_update_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastUpdateTime = column("last_update_time", JDBCType.TIMESTAMP);

        public SysRoleDept() {
            super("sys_role_dept");
        }
    }
}