package com.dzm.tomato.admin.dao;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;

public final class SysUserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.499854+09:00", comments="Source Table: sys_user")
    public static final SysUser sysUser = new SysUser();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.500018+09:00", comments="Source field: sys_user.id")
    public static final SqlColumn<Long> id = sysUser.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.500065+09:00", comments="Source field: sys_user.name")
    public static final SqlColumn<String> name = sysUser.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.500112+09:00", comments="Source field: sys_user.nick_name")
    public static final SqlColumn<String> nickName = sysUser.nickName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.500151+09:00", comments="Source field: sys_user.avatar")
    public static final SqlColumn<String> avatar = sysUser.avatar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.500192+09:00", comments="Source field: sys_user.password")
    public static final SqlColumn<String> password = sysUser.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.500237+09:00", comments="Source field: sys_user.salt")
    public static final SqlColumn<String> salt = sysUser.salt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.500276+09:00", comments="Source field: sys_user.email")
    public static final SqlColumn<String> email = sysUser.email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.500312+09:00", comments="Source field: sys_user.mobile")
    public static final SqlColumn<String> mobile = sysUser.mobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.500351+09:00", comments="Source field: sys_user.status")
    public static final SqlColumn<Byte> status = sysUser.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.50039+09:00", comments="Source field: sys_user.dept_id")
    public static final SqlColumn<Long> deptId = sysUser.deptId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.500426+09:00", comments="Source field: sys_user.remark")
    public static final SqlColumn<String> remark = sysUser.remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.500466+09:00", comments="Source field: sys_user.create_by")
    public static final SqlColumn<String> createBy = sysUser.createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.500512+09:00", comments="Source field: sys_user.create_time")
    public static final SqlColumn<Date> createTime = sysUser.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.500552+09:00", comments="Source field: sys_user.last_update_by")
    public static final SqlColumn<String> lastUpdateBy = sysUser.lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.500594+09:00", comments="Source field: sys_user.last_update_time")
    public static final SqlColumn<Date> lastUpdateTime = sysUser.lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.500637+09:00", comments="Source field: sys_user.dept_flag")
    public static final SqlColumn<Byte> deptFlag = sysUser.deptFlag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.499948+09:00", comments="Source Table: sys_user")
    public static final class SysUser extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> nickName = column("nick_name", JDBCType.VARCHAR);

        public final SqlColumn<String> avatar = column("avatar", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> salt = column("salt", JDBCType.VARCHAR);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<String> mobile = column("mobile", JDBCType.VARCHAR);

        public final SqlColumn<Byte> status = column("status", JDBCType.TINYINT);

        public final SqlColumn<Long> deptId = column("dept_id", JDBCType.BIGINT);

        public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

        public final SqlColumn<String> createBy = column("create_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> lastUpdateBy = column("last_update_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastUpdateTime = column("last_update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Byte> deptFlag = column("dept_flag", JDBCType.TINYINT);

        public SysUser() {
            super("sys_user");
        }
    }
}