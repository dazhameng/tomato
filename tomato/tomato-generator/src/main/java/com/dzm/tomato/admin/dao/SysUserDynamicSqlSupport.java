package com.dzm.tomato.admin.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysUserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.025822+09:00", comments="Source Table: sys_user")
    public static final SysUser sysUser = new SysUser();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.025953+09:00", comments="Source field: sys_user.id")
    public static final SqlColumn<Long> id = sysUser.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.025991+09:00", comments="Source field: sys_user.name")
    public static final SqlColumn<String> name = sysUser.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.026028+09:00", comments="Source field: sys_user.nick_name")
    public static final SqlColumn<String> nickName = sysUser.nickName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.026066+09:00", comments="Source field: sys_user.avatar")
    public static final SqlColumn<String> avatar = sysUser.avatar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.026098+09:00", comments="Source field: sys_user.password")
    public static final SqlColumn<String> password = sysUser.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.026132+09:00", comments="Source field: sys_user.salt")
    public static final SqlColumn<String> salt = sysUser.salt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.026167+09:00", comments="Source field: sys_user.email")
    public static final SqlColumn<String> email = sysUser.email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.026205+09:00", comments="Source field: sys_user.mobile")
    public static final SqlColumn<String> mobile = sysUser.mobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.026237+09:00", comments="Source field: sys_user.status")
    public static final SqlColumn<Byte> status = sysUser.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.026268+09:00", comments="Source field: sys_user.dept_id")
    public static final SqlColumn<Long> deptId = sysUser.deptId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.026299+09:00", comments="Source field: sys_user.remark")
    public static final SqlColumn<String> remark = sysUser.remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.026331+09:00", comments="Source field: sys_user.create_by")
    public static final SqlColumn<String> createBy = sysUser.createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.026366+09:00", comments="Source field: sys_user.create_time")
    public static final SqlColumn<Date> createTime = sysUser.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.026397+09:00", comments="Source field: sys_user.last_update_by")
    public static final SqlColumn<String> lastUpdateBy = sysUser.lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.026432+09:00", comments="Source field: sys_user.last_update_time")
    public static final SqlColumn<Date> lastUpdateTime = sysUser.lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.026464+09:00", comments="Source field: sys_user.dept_flag")
    public static final SqlColumn<Byte> deptFlag = sysUser.deptFlag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.025893+09:00", comments="Source Table: sys_user")
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