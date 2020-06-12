package com.dzm.tomato.admin.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysUserRoleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.02829+09:00", comments="Source Table: sys_user_role")
    public static final SysUserRole sysUserRole = new SysUserRole();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.028398+09:00", comments="Source field: sys_user_role.id")
    public static final SqlColumn<Long> id = sysUserRole.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.028434+09:00", comments="Source field: sys_user_role.user_id")
    public static final SqlColumn<Long> userId = sysUserRole.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.028469+09:00", comments="Source field: sys_user_role.role_id")
    public static final SqlColumn<Long> roleId = sysUserRole.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.028501+09:00", comments="Source field: sys_user_role.create_by")
    public static final SqlColumn<String> createBy = sysUserRole.createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.028536+09:00", comments="Source field: sys_user_role.create_time")
    public static final SqlColumn<Date> createTime = sysUserRole.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.028567+09:00", comments="Source field: sys_user_role.last_update_by")
    public static final SqlColumn<String> lastUpdateBy = sysUserRole.lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.0286+09:00", comments="Source field: sys_user_role.last_update_time")
    public static final SqlColumn<Date> lastUpdateTime = sysUserRole.lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.02835+09:00", comments="Source Table: sys_user_role")
    public static final class SysUserRole extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> userId = column("user_id", JDBCType.BIGINT);

        public final SqlColumn<Long> roleId = column("role_id", JDBCType.BIGINT);

        public final SqlColumn<String> createBy = column("create_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> lastUpdateBy = column("last_update_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastUpdateTime = column("last_update_time", JDBCType.TIMESTAMP);

        public SysUserRole() {
            super("sys_user_role");
        }
    }
}