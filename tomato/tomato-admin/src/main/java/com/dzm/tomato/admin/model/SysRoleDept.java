package com.dzm.tomato.admin.model;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.Date;

public class SysRoleDept implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492148+09:00", comments="Source field: sys_role_dept.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492238+09:00", comments="Source field: sys_role_dept.role_id")
    private Long roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492367+09:00", comments="Source field: sys_role_dept.dept_id")
    private Long deptId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492439+09:00", comments="Source field: sys_role_dept.create_by")
    private String createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492514+09:00", comments="Source field: sys_role_dept.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492588+09:00", comments="Source field: sys_role_dept.last_update_by")
    private String lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492661+09:00", comments="Source field: sys_role_dept.last_update_time")
    private Date lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492739+09:00", comments="Source Table: sys_role_dept")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492183+09:00", comments="Source field: sys_role_dept.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492213+09:00", comments="Source field: sys_role_dept.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492304+09:00", comments="Source field: sys_role_dept.role_id")
    public Long getRoleId() {
        return roleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492339+09:00", comments="Source field: sys_role_dept.role_id")
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492389+09:00", comments="Source field: sys_role_dept.dept_id")
    public Long getDeptId() {
        return deptId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492415+09:00", comments="Source field: sys_role_dept.dept_id")
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492462+09:00", comments="Source field: sys_role_dept.create_by")
    public String getCreateBy() {
        return createBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.49249+09:00", comments="Source field: sys_role_dept.create_by")
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.49254+09:00", comments="Source field: sys_role_dept.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492565+09:00", comments="Source field: sys_role_dept.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492612+09:00", comments="Source field: sys_role_dept.last_update_by")
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492638+09:00", comments="Source field: sys_role_dept.last_update_by")
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.492686+09:00", comments="Source field: sys_role_dept.last_update_time")
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.49271+09:00", comments="Source field: sys_role_dept.last_update_time")
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}