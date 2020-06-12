package com.dzm.tomato.admin.model;

import java.util.Date;
import javax.annotation.Generated;

public class SysLog {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004032+09:00", comments="Source field: sys_log.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004155+09:00", comments="Source field: sys_log.user_name")
    private String userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004263+09:00", comments="Source field: sys_log.operation")
    private String operation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004427+09:00", comments="Source field: sys_log.method")
    private String method;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004527+09:00", comments="Source field: sys_log.params")
    private String params;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004628+09:00", comments="Source field: sys_log.time")
    private Long time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.00473+09:00", comments="Source field: sys_log.ip")
    private String ip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004834+09:00", comments="Source field: sys_log.remark")
    private String remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004935+09:00", comments="Source field: sys_log.create_by")
    private String createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005032+09:00", comments="Source field: sys_log.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005132+09:00", comments="Source field: sys_log.last_update_by")
    private String lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005229+09:00", comments="Source field: sys_log.last_update_time")
    private Date lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005331+09:00", comments="Source field: sys_log.dept_flag")
    private Byte deptFlag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.00408+09:00", comments="Source field: sys_log.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004119+09:00", comments="Source field: sys_log.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.00419+09:00", comments="Source field: sys_log.user_name")
    public String getUserName() {
        return userName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004229+09:00", comments="Source field: sys_log.user_name")
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004311+09:00", comments="Source field: sys_log.operation")
    public String getOperation() {
        return operation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004393+09:00", comments="Source field: sys_log.operation")
    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.00446+09:00", comments="Source field: sys_log.method")
    public String getMethod() {
        return method;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004496+09:00", comments="Source field: sys_log.method")
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004559+09:00", comments="Source field: sys_log.params")
    public String getParams() {
        return params;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004596+09:00", comments="Source field: sys_log.params")
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004664+09:00", comments="Source field: sys_log.time")
    public Long getTime() {
        return time;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004699+09:00", comments="Source field: sys_log.time")
    public void setTime(Long time) {
        this.time = time;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004763+09:00", comments="Source field: sys_log.ip")
    public String getIp() {
        return ip;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004802+09:00", comments="Source field: sys_log.ip")
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004867+09:00", comments="Source field: sys_log.remark")
    public String getRemark() {
        return remark;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004903+09:00", comments="Source field: sys_log.remark")
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.004967+09:00", comments="Source field: sys_log.create_by")
    public String getCreateBy() {
        return createBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005001+09:00", comments="Source field: sys_log.create_by")
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005067+09:00", comments="Source field: sys_log.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005101+09:00", comments="Source field: sys_log.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005164+09:00", comments="Source field: sys_log.last_update_by")
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005198+09:00", comments="Source field: sys_log.last_update_by")
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005264+09:00", comments="Source field: sys_log.last_update_time")
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005298+09:00", comments="Source field: sys_log.last_update_time")
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005384+09:00", comments="Source field: sys_log.dept_flag")
    public Byte getDeptFlag() {
        return deptFlag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.005424+09:00", comments="Source field: sys_log.dept_flag")
    public void setDeptFlag(Byte deptFlag) {
        this.deptFlag = deptFlag;
    }
}