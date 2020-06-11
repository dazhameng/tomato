package com.dzm.tomato.admin.dao;

import com.dzm.tomato.admin.model.SysDept;
import com.dzm.tomato.admin.model.SysDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int countByExample(SysDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int deleteByExample(SysDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int insert(SysDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int insertSelective(SysDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    List<SysDept> selectByExample(SysDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    SysDept selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int updateByExampleSelective(@Param("record") SysDept record, @Param("example") SysDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int updateByExample(@Param("record") SysDept record, @Param("example") SysDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int updateByPrimaryKeySelective(SysDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int updateByPrimaryKey(SysDept record);
}