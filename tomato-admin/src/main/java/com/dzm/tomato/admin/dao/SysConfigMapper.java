package com.dzm.tomato.admin.dao;

import com.dzm.tomato.admin.model.SysConfig;
import com.dzm.tomato.admin.model.SysConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int countByExample(SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int deleteByExample(SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int insert(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int insertSelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    List<SysConfig> selectByExample(SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    SysConfig selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int updateByExampleSelective(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int updateByExample(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int updateByPrimaryKeySelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Thu Jun 11 10:51:15 JST 2020
     */
    int updateByPrimaryKey(SysConfig record);
}