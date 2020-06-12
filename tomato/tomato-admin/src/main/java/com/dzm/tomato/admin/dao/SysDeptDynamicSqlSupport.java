package com.dzm.tomato.admin.dao;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;

public final class SysDeptDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.996164+09:00", comments="Source Table: sys_dept")
    public static final SysDept sysDept = new SysDept();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.996373+09:00", comments="Source field: sys_dept.id")
    public static final SqlColumn<Long> id = sysDept.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.996429+09:00", comments="Source field: sys_dept.name")
    public static final SqlColumn<String> name = sysDept.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.996483+09:00", comments="Source field: sys_dept.parent_id")
    public static final SqlColumn<Long> parentId = sysDept.parentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.996536+09:00", comments="Source field: sys_dept.order_num")
    public static final SqlColumn<Integer> orderNum = sysDept.orderNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.996587+09:00", comments="Source field: sys_dept.remark")
    public static final SqlColumn<String> remark = sysDept.remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.996669+09:00", comments="Source field: sys_dept.create_by")
    public static final SqlColumn<String> createBy = sysDept.createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.996729+09:00", comments="Source field: sys_dept.create_time")
    public static final SqlColumn<Date> createTime = sysDept.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.996781+09:00", comments="Source field: sys_dept.last_update_by")
    public static final SqlColumn<String> lastUpdateBy = sysDept.lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.996834+09:00", comments="Source field: sys_dept.last_update_time")
    public static final SqlColumn<Date> lastUpdateTime = sysDept.lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.996888+09:00", comments="Source field: sys_dept.dept_flag")
    public static final SqlColumn<Byte> deptFlag = sysDept.deptFlag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.996282+09:00", comments="Source Table: sys_dept")
    public static final class SysDept extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentId = column("parent_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> orderNum = column("order_num", JDBCType.INTEGER);

        public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

        public final SqlColumn<String> createBy = column("create_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> lastUpdateBy = column("last_update_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastUpdateTime = column("last_update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Byte> deptFlag = column("dept_flag", JDBCType.TINYINT);

        public SysDept() {
            super("sys_dept");
        }
    }
}