package com.dzm.tomato.admin.dao;

import com.dzm.tomato.admin.model.SysRoleMenu;
import com.dzm.tomato.admin.model.SysRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int countByExample(SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int deleteByExample(SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int insert(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int insertSelective(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    List<SysRoleMenu> selectByExample(SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    SysRoleMenu selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int updateByExampleSelective(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int updateByExample(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int updateByPrimaryKeySelective(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int updateByPrimaryKey(SysRoleMenu record);
}