package com.dzm.tomatoadmin.model;

import java.util.Date;

public class SysLoginLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_login_log.id
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_login_log.user_name
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_login_log.status
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_login_log.ip
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_login_log.create_by
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    private String createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_login_log.create_time
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_login_log.last_update_by
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    private String lastUpdateBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_login_log.last_update_time
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_login_log.id
     *
     * @return the value of sys_login_log.id
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_login_log.id
     *
     * @param id the value for sys_login_log.id
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_login_log.user_name
     *
     * @return the value of sys_login_log.user_name
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_login_log.user_name
     *
     * @param userName the value for sys_login_log.user_name
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_login_log.status
     *
     * @return the value of sys_login_log.status
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_login_log.status
     *
     * @param status the value for sys_login_log.status
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_login_log.ip
     *
     * @return the value of sys_login_log.ip
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_login_log.ip
     *
     * @param ip the value for sys_login_log.ip
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_login_log.create_by
     *
     * @return the value of sys_login_log.create_by
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_login_log.create_by
     *
     * @param createBy the value for sys_login_log.create_by
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_login_log.create_time
     *
     * @return the value of sys_login_log.create_time
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_login_log.create_time
     *
     * @param createTime the value for sys_login_log.create_time
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_login_log.last_update_by
     *
     * @return the value of sys_login_log.last_update_by
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_login_log.last_update_by
     *
     * @param lastUpdateBy the value for sys_login_log.last_update_by
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_login_log.last_update_time
     *
     * @return the value of sys_login_log.last_update_time
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_login_log.last_update_time
     *
     * @param lastUpdateTime the value for sys_login_log.last_update_time
     *
     * @mbggenerated Mon Jun 08 20:39:48 JST 2020
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}