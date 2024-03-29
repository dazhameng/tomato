package com.dzm.tomato.admin.model;

import java.util.Date;

public class SysUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.id
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.name
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.nick_name
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.avatar
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private String avatar;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.password
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.salt
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.email
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.mobile
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.status
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.dept_id
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private Long deptId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.remark
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.create_by
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private String createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.create_time
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.last_update_by
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private String lastUpdateBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.last_update_time
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.dept_flag
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private Byte deptFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.id
     *
     * @return the value of sys_user.id
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.id
     *
     * @param id the value for sys_user.id
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.name
     *
     * @return the value of sys_user.name
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.name
     *
     * @param name the value for sys_user.name
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.nick_name
     *
     * @return the value of sys_user.nick_name
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.nick_name
     *
     * @param nickName the value for sys_user.nick_name
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.avatar
     *
     * @return the value of sys_user.avatar
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.avatar
     *
     * @param avatar the value for sys_user.avatar
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.password
     *
     * @return the value of sys_user.password
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.password
     *
     * @param password the value for sys_user.password
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.salt
     *
     * @return the value of sys_user.salt
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.salt
     *
     * @param salt the value for sys_user.salt
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.email
     *
     * @return the value of sys_user.email
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.email
     *
     * @param email the value for sys_user.email
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.mobile
     *
     * @return the value of sys_user.mobile
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.mobile
     *
     * @param mobile the value for sys_user.mobile
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.status
     *
     * @return the value of sys_user.status
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.status
     *
     * @param status the value for sys_user.status
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.dept_id
     *
     * @return the value of sys_user.dept_id
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.dept_id
     *
     * @param deptId the value for sys_user.dept_id
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.remark
     *
     * @return the value of sys_user.remark
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.remark
     *
     * @param remark the value for sys_user.remark
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.create_by
     *
     * @return the value of sys_user.create_by
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.create_by
     *
     * @param createBy the value for sys_user.create_by
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.create_time
     *
     * @return the value of sys_user.create_time
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.create_time
     *
     * @param createTime the value for sys_user.create_time
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.last_update_by
     *
     * @return the value of sys_user.last_update_by
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.last_update_by
     *
     * @param lastUpdateBy the value for sys_user.last_update_by
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.last_update_time
     *
     * @return the value of sys_user.last_update_time
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.last_update_time
     *
     * @param lastUpdateTime the value for sys_user.last_update_time
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.dept_flag
     *
     * @return the value of sys_user.dept_flag
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public Byte getDeptFlag() {
        return deptFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.dept_flag
     *
     * @param deptFlag the value for sys_user.dept_flag
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setDeptFlag(Byte deptFlag) {
        this.deptFlag = deptFlag;
    }
}