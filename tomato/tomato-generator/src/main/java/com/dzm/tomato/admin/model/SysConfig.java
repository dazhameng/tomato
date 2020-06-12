package com.dzm.tomato.admin.model;

import java.util.Date;
import javax.annotation.Generated;

public class SysConfig {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.988186+09:00", comments="Source field: sys_config.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.988385+09:00", comments="Source field: sys_config.value")
    private String value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.988526+09:00", comments="Source field: sys_config.label")
    private String label;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.988654+09:00", comments="Source field: sys_config.type")
    private String type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.988787+09:00", comments="Source field: sys_config.description")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.988917+09:00", comments="Source field: sys_config.sort")
    private Long sort;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.989052+09:00", comments="Source field: sys_config.remark")
    private String remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.98918+09:00", comments="Source field: sys_config.create_by")
    private String createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.989307+09:00", comments="Source field: sys_config.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.989459+09:00", comments="Source field: sys_config.last_update_by")
    private String lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.989589+09:00", comments="Source field: sys_config.last_update_time")
    private Date lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.989721+09:00", comments="Source field: sys_config.dept_flag")
    private Byte deptFlag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.988288+09:00", comments="Source field: sys_config.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.988338+09:00", comments="Source field: sys_config.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.98843+09:00", comments="Source field: sys_config.value")
    public String getValue() {
        return value;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.98848+09:00", comments="Source field: sys_config.value")
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.988568+09:00", comments="Source field: sys_config.label")
    public String getLabel() {
        return label;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.988613+09:00", comments="Source field: sys_config.label")
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.988699+09:00", comments="Source field: sys_config.type")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.988746+09:00", comments="Source field: sys_config.type")
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.988829+09:00", comments="Source field: sys_config.description")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.988875+09:00", comments="Source field: sys_config.description")
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.98896+09:00", comments="Source field: sys_config.sort")
    public Long getSort() {
        return sort;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.989008+09:00", comments="Source field: sys_config.sort")
    public void setSort(Long sort) {
        this.sort = sort;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.989095+09:00", comments="Source field: sys_config.remark")
    public String getRemark() {
        return remark;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.989139+09:00", comments="Source field: sys_config.remark")
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.989222+09:00", comments="Source field: sys_config.create_by")
    public String getCreateBy() {
        return createBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.989267+09:00", comments="Source field: sys_config.create_by")
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.989352+09:00", comments="Source field: sys_config.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.989398+09:00", comments="Source field: sys_config.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.989503+09:00", comments="Source field: sys_config.last_update_by")
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.989548+09:00", comments="Source field: sys_config.last_update_by")
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.989634+09:00", comments="Source field: sys_config.last_update_time")
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.98968+09:00", comments="Source field: sys_config.last_update_time")
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.989763+09:00", comments="Source field: sys_config.dept_flag")
    public Byte getDeptFlag() {
        return deptFlag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.989817+09:00", comments="Source field: sys_config.dept_flag")
    public void setDeptFlag(Byte deptFlag) {
        this.deptFlag = deptFlag;
    }
}