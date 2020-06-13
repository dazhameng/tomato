package com.dzm.tomato.admin.model;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.Date;

public class SysConfig implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.460778+09:00", comments="Source field: sys_config.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.460993+09:00", comments="Source field: sys_config.value")
    private String value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.461153+09:00", comments="Source field: sys_config.label")
    private String label;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.461297+09:00", comments="Source field: sys_config.type")
    private String type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.46144+09:00", comments="Source field: sys_config.description")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.461584+09:00", comments="Source field: sys_config.sort")
    private Long sort;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.461726+09:00", comments="Source field: sys_config.remark")
    private String remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.46188+09:00", comments="Source field: sys_config.create_by")
    private String createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.462021+09:00", comments="Source field: sys_config.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.462177+09:00", comments="Source field: sys_config.last_update_by")
    private String lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.462312+09:00", comments="Source field: sys_config.last_update_time")
    private Date lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.462447+09:00", comments="Source field: sys_config.dept_flag")
    private Byte deptFlag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.462601+09:00", comments="Source Table: sys_config")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.460876+09:00", comments="Source field: sys_config.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.460936+09:00", comments="Source field: sys_config.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.461049+09:00", comments="Source field: sys_config.value")
    public String getValue() {
        return value;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.461104+09:00", comments="Source field: sys_config.value")
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.4612+09:00", comments="Source field: sys_config.label")
    public String getLabel() {
        return label;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.46125+09:00", comments="Source field: sys_config.label")
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.461345+09:00", comments="Source field: sys_config.type")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.461394+09:00", comments="Source field: sys_config.type")
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.461489+09:00", comments="Source field: sys_config.description")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.461538+09:00", comments="Source field: sys_config.description")
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.46163+09:00", comments="Source field: sys_config.sort")
    public Long getSort() {
        return sort;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.461683+09:00", comments="Source field: sys_config.sort")
    public void setSort(Long sort) {
        this.sort = sort;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.461773+09:00", comments="Source field: sys_config.remark")
    public String getRemark() {
        return remark;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.461822+09:00", comments="Source field: sys_config.remark")
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.461925+09:00", comments="Source field: sys_config.create_by")
    public String getCreateBy() {
        return createBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.461972+09:00", comments="Source field: sys_config.create_by")
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.462069+09:00", comments="Source field: sys_config.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.462122+09:00", comments="Source field: sys_config.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.462226+09:00", comments="Source field: sys_config.last_update_by")
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.462272+09:00", comments="Source field: sys_config.last_update_by")
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.462365+09:00", comments="Source field: sys_config.last_update_time")
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.462408+09:00", comments="Source field: sys_config.last_update_time")
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.462487+09:00", comments="Source field: sys_config.dept_flag")
    public Byte getDeptFlag() {
        return deptFlag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.462531+09:00", comments="Source field: sys_config.dept_flag")
    public void setDeptFlag(Byte deptFlag) {
        this.deptFlag = deptFlag;
    }
}