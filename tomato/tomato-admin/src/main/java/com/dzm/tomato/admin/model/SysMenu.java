package com.dzm.tomato.admin.model;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.Date;

public class SysMenu implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.484614+09:00", comments="Source field: sys_menu.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.484729+09:00", comments="Source field: sys_menu.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.48483+09:00", comments="Source field: sys_menu.parent_id")
    private Long parentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.484923+09:00", comments="Source field: sys_menu.url")
    private String url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485025+09:00", comments="Source field: sys_menu.perms")
    private String perms;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485109+09:00", comments="Source field: sys_menu.type")
    private Integer type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485192+09:00", comments="Source field: sys_menu.icon")
    private String icon;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485282+09:00", comments="Source field: sys_menu.order_num")
    private Integer orderNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485365+09:00", comments="Source field: sys_menu.remark")
    private String remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.48547+09:00", comments="Source field: sys_menu.create_by")
    private String createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485551+09:00", comments="Source field: sys_menu.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485639+09:00", comments="Source field: sys_menu.last_update_by")
    private String lastUpdateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485722+09:00", comments="Source field: sys_menu.last_update_time")
    private Date lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.48581+09:00", comments="Source field: sys_menu.dept_flag")
    private Byte deptFlag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485896+09:00", comments="Source Table: sys_menu")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.484662+09:00", comments="Source field: sys_menu.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.484698+09:00", comments="Source field: sys_menu.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.484768+09:00", comments="Source field: sys_menu.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.484802+09:00", comments="Source field: sys_menu.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.484859+09:00", comments="Source field: sys_menu.parent_id")
    public Long getParentId() {
        return parentId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.484888+09:00", comments="Source field: sys_menu.parent_id")
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.484968+09:00", comments="Source field: sys_menu.url")
    public String getUrl() {
        return url;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485+09:00", comments="Source field: sys_menu.url")
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485052+09:00", comments="Source field: sys_menu.perms")
    public String getPerms() {
        return perms;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485083+09:00", comments="Source field: sys_menu.perms")
    public void setPerms(String perms) {
        this.perms = perms == null ? null : perms.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485137+09:00", comments="Source field: sys_menu.type")
    public Integer getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485166+09:00", comments="Source field: sys_menu.type")
    public void setType(Integer type) {
        this.type = type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485217+09:00", comments="Source field: sys_menu.icon")
    public String getIcon() {
        return icon;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485246+09:00", comments="Source field: sys_menu.icon")
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.48531+09:00", comments="Source field: sys_menu.order_num")
    public Integer getOrderNum() {
        return orderNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485339+09:00", comments="Source field: sys_menu.order_num")
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485402+09:00", comments="Source field: sys_menu.remark")
    public String getRemark() {
        return remark;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485443+09:00", comments="Source field: sys_menu.remark")
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485499+09:00", comments="Source field: sys_menu.create_by")
    public String getCreateBy() {
        return createBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485528+09:00", comments="Source field: sys_menu.create_by")
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485587+09:00", comments="Source field: sys_menu.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485614+09:00", comments="Source field: sys_menu.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485665+09:00", comments="Source field: sys_menu.last_update_by")
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485696+09:00", comments="Source field: sys_menu.last_update_by")
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485751+09:00", comments="Source field: sys_menu.last_update_time")
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485779+09:00", comments="Source field: sys_menu.last_update_time")
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485837+09:00", comments="Source field: sys_menu.dept_flag")
    public Byte getDeptFlag() {
        return deptFlag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.485865+09:00", comments="Source field: sys_menu.dept_flag")
    public void setDeptFlag(Byte deptFlag) {
        this.deptFlag = deptFlag;
    }
}