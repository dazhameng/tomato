package com.dzm.tomato.admin.model;

import java.util.Date;
import javax.annotation.Generated;

public class SysDict {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.999249+09:00", comments="Source field: sys_dict.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.999632+09:00", comments="Source field: sys_dict.value")
    private String value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.999831+09:00", comments="Source field: sys_dict.label")
    private String label;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.999949+09:00", comments="Source field: sys_dict.type")
    private String type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000062+09:00", comments="Source field: sys_dict.description")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000178+09:00", comments="Source field: sys_dict.sort")
    private Long sort;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000291+09:00", comments="Source field: sys_dict.remark")
    private String remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000393+09:00", comments="Source field: sys_dict.create_by")
    private String createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000505+09:00", comments="Source field: sys_dict.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000617+09:00", comments="Source field: sys_dict.last_update_by")
    private String lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000726+09:00", comments="Source field: sys_dict.last_update_time")
    private Date lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000871+09:00", comments="Source field: sys_dict.dept_flag")
    private Byte deptFlag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.999439+09:00", comments="Source field: sys_dict.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.999548+09:00", comments="Source field: sys_dict.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.999699+09:00", comments="Source field: sys_dict.value")
    public String getValue() {
        return value;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.999781+09:00", comments="Source field: sys_dict.value")
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.999872+09:00", comments="Source field: sys_dict.label")
    public String getLabel() {
        return label;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.999911+09:00", comments="Source field: sys_dict.label")
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:49.999984+09:00", comments="Source field: sys_dict.type")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000022+09:00", comments="Source field: sys_dict.type")
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000097+09:00", comments="Source field: sys_dict.description")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000134+09:00", comments="Source field: sys_dict.description")
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000215+09:00", comments="Source field: sys_dict.sort")
    public Long getSort() {
        return sort;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000257+09:00", comments="Source field: sys_dict.sort")
    public void setSort(Long sort) {
        this.sort = sort;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000325+09:00", comments="Source field: sys_dict.remark")
    public String getRemark() {
        return remark;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.00036+09:00", comments="Source field: sys_dict.remark")
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000428+09:00", comments="Source field: sys_dict.create_by")
    public String getCreateBy() {
        return createBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000468+09:00", comments="Source field: sys_dict.create_by")
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000542+09:00", comments="Source field: sys_dict.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000584+09:00", comments="Source field: sys_dict.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000658+09:00", comments="Source field: sys_dict.last_update_by")
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000694+09:00", comments="Source field: sys_dict.last_update_by")
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000766+09:00", comments="Source field: sys_dict.last_update_time")
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000814+09:00", comments="Source field: sys_dict.last_update_time")
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000907+09:00", comments="Source field: sys_dict.dept_flag")
    public Byte getDeptFlag() {
        return deptFlag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-12T10:39:50.000943+09:00", comments="Source field: sys_dict.dept_flag")
    public void setDeptFlag(Byte deptFlag) {
        this.deptFlag = deptFlag;
    }
}