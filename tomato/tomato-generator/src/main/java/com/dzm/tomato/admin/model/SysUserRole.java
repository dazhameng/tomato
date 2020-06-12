package com.dzm.tomato.admin.model;

import java.util.Date;
import javax.annotation.Generated;

public class SysUserRole {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.027785+09:00", comments="Source field: sys_user_role.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.027852+09:00", comments="Source field: sys_user_role.user_id")
    private Long userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.027901+09:00", comments="Source field: sys_user_role.role_id")
    private Long roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.027947+09:00", comments="Source field: sys_user_role.create_by")
    private String createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.027993+09:00", comments="Source field: sys_user_role.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.028041+09:00", comments="Source field: sys_user_role.last_update_by")
    private String lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.028094+09:00", comments="Source field: sys_user_role.last_update_time")
    private Date lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.02781+09:00", comments="Source field: sys_user_role.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.027834+09:00", comments="Source field: sys_user_role.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.027867+09:00", comments="Source field: sys_user_role.user_id")
    public Long getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.027885+09:00", comments="Source field: sys_user_role.user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.027915+09:00", comments="Source field: sys_user_role.role_id")
    public Long getRoleId() {
        return roleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.027932+09:00", comments="Source field: sys_user_role.role_id")
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.027961+09:00", comments="Source field: sys_user_role.create_by")
    public String getCreateBy() {
        return createBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.027978+09:00", comments="Source field: sys_user_role.create_by")
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.02801+09:00", comments="Source field: sys_user_role.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.028027+09:00", comments="Source field: sys_user_role.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.02806+09:00", comments="Source field: sys_user_role.last_update_by")
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.028079+09:00", comments="Source field: sys_user_role.last_update_by")
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.02811+09:00", comments="Source field: sys_user_role.last_update_time")
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.028127+09:00", comments="Source field: sys_user_role.last_update_time")
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}