package com.dzm.tomato.admin.model;

import java.util.Date;

public class SysUserRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.id
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.user_id
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.role_id
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private Long roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.create_by
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private String createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.create_time
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.last_update_by
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private String lastUpdateBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.last_update_time
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.id
     *
     * @return the value of sys_user_role.id
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.id
     *
     * @param id the value for sys_user_role.id
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.user_id
     *
     * @return the value of sys_user_role.user_id
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.user_id
     *
     * @param userId the value for sys_user_role.user_id
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.role_id
     *
     * @return the value of sys_user_role.role_id
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.role_id
     *
     * @param roleId the value for sys_user_role.role_id
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.create_by
     *
     * @return the value of sys_user_role.create_by
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.create_by
     *
     * @param createBy the value for sys_user_role.create_by
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.create_time
     *
     * @return the value of sys_user_role.create_time
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.create_time
     *
     * @param createTime the value for sys_user_role.create_time
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.last_update_by
     *
     * @return the value of sys_user_role.last_update_by
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.last_update_by
     *
     * @param lastUpdateBy the value for sys_user_role.last_update_by
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.last_update_time
     *
     * @return the value of sys_user_role.last_update_time
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.last_update_time
     *
     * @param lastUpdateTime the value for sys_user_role.last_update_time
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}