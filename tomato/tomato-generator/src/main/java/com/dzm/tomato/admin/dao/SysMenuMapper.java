package com.dzm.tomato.admin.dao;

import static com.dzm.tomato.admin.dao.SysMenuDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.dzm.tomato.admin.model.SysMenu;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface SysMenuMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.487789+09:00", comments="Source Table: sys_menu")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, parentId, url, perms, type, icon, orderNum, remark, createBy, createTime, lastUpdateBy, lastUpdateTime, deptFlag);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.487004+09:00", comments="Source Table: sys_menu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.487045+09:00", comments="Source Table: sys_menu")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.48709+09:00", comments="Source Table: sys_menu")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysMenu> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.487131+09:00", comments="Source Table: sys_menu")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SysMenu> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.487173+09:00", comments="Source Table: sys_menu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysMenuResult")
    Optional<SysMenu> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.48722+09:00", comments="Source Table: sys_menu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysMenuResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.BIGINT),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="perms", property="perms", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_num", property="orderNum", jdbcType=JdbcType.INTEGER),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_update_by", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="dept_flag", property="deptFlag", jdbcType=JdbcType.TINYINT)
    })
    List<SysMenu> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.487327+09:00", comments="Source Table: sys_menu")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.487367+09:00", comments="Source Table: sys_menu")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sysMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.487403+09:00", comments="Source Table: sys_menu")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sysMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.487439+09:00", comments="Source Table: sys_menu")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.487481+09:00", comments="Source Table: sys_menu")
    default int insert(SysMenu record) {
        return MyBatis3Utils.insert(this::insert, record, sysMenu, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(parentId).toProperty("parentId")
            .map(url).toProperty("url")
            .map(perms).toProperty("perms")
            .map(type).toProperty("type")
            .map(icon).toProperty("icon")
            .map(orderNum).toProperty("orderNum")
            .map(remark).toProperty("remark")
            .map(createBy).toProperty("createBy")
            .map(createTime).toProperty("createTime")
            .map(lastUpdateBy).toProperty("lastUpdateBy")
            .map(lastUpdateTime).toProperty("lastUpdateTime")
            .map(deptFlag).toProperty("deptFlag")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.487554+09:00", comments="Source Table: sys_menu")
    default int insertMultiple(Collection<SysMenu> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sysMenu, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(parentId).toProperty("parentId")
            .map(url).toProperty("url")
            .map(perms).toProperty("perms")
            .map(type).toProperty("type")
            .map(icon).toProperty("icon")
            .map(orderNum).toProperty("orderNum")
            .map(remark).toProperty("remark")
            .map(createBy).toProperty("createBy")
            .map(createTime).toProperty("createTime")
            .map(lastUpdateBy).toProperty("lastUpdateBy")
            .map(lastUpdateTime).toProperty("lastUpdateTime")
            .map(deptFlag).toProperty("deptFlag")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.487627+09:00", comments="Source Table: sys_menu")
    default int insertSelective(SysMenu record) {
        return MyBatis3Utils.insert(this::insert, record, sysMenu, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(parentId).toPropertyWhenPresent("parentId", record::getParentId)
            .map(url).toPropertyWhenPresent("url", record::getUrl)
            .map(perms).toPropertyWhenPresent("perms", record::getPerms)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(icon).toPropertyWhenPresent("icon", record::getIcon)
            .map(orderNum).toPropertyWhenPresent("orderNum", record::getOrderNum)
            .map(remark).toPropertyWhenPresent("remark", record::getRemark)
            .map(createBy).toPropertyWhenPresent("createBy", record::getCreateBy)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(lastUpdateBy).toPropertyWhenPresent("lastUpdateBy", record::getLastUpdateBy)
            .map(lastUpdateTime).toPropertyWhenPresent("lastUpdateTime", record::getLastUpdateTime)
            .map(deptFlag).toPropertyWhenPresent("deptFlag", record::getDeptFlag)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.48783+09:00", comments="Source Table: sys_menu")
    default Optional<SysMenu> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sysMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.48787+09:00", comments="Source Table: sys_menu")
    default List<SysMenu> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sysMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.487911+09:00", comments="Source Table: sys_menu")
    default List<SysMenu> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sysMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.487951+09:00", comments="Source Table: sys_menu")
    default Optional<SysMenu> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.487993+09:00", comments="Source Table: sys_menu")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sysMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.488031+09:00", comments="Source Table: sys_menu")
    static UpdateDSL<UpdateModel> updateAllColumns(SysMenu record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(parentId).equalTo(record::getParentId)
                .set(url).equalTo(record::getUrl)
                .set(perms).equalTo(record::getPerms)
                .set(type).equalTo(record::getType)
                .set(icon).equalTo(record::getIcon)
                .set(orderNum).equalTo(record::getOrderNum)
                .set(remark).equalTo(record::getRemark)
                .set(createBy).equalTo(record::getCreateBy)
                .set(createTime).equalTo(record::getCreateTime)
                .set(lastUpdateBy).equalTo(record::getLastUpdateBy)
                .set(lastUpdateTime).equalTo(record::getLastUpdateTime)
                .set(deptFlag).equalTo(record::getDeptFlag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.488149+09:00", comments="Source Table: sys_menu")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SysMenu record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(perms).equalToWhenPresent(record::getPerms)
                .set(type).equalToWhenPresent(record::getType)
                .set(icon).equalToWhenPresent(record::getIcon)
                .set(orderNum).equalToWhenPresent(record::getOrderNum)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(createBy).equalToWhenPresent(record::getCreateBy)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(lastUpdateBy).equalToWhenPresent(record::getLastUpdateBy)
                .set(lastUpdateTime).equalToWhenPresent(record::getLastUpdateTime)
                .set(deptFlag).equalToWhenPresent(record::getDeptFlag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.488279+09:00", comments="Source Table: sys_menu")
    default int updateByPrimaryKey(SysMenu record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(parentId).equalTo(record::getParentId)
            .set(url).equalTo(record::getUrl)
            .set(perms).equalTo(record::getPerms)
            .set(type).equalTo(record::getType)
            .set(icon).equalTo(record::getIcon)
            .set(orderNum).equalTo(record::getOrderNum)
            .set(remark).equalTo(record::getRemark)
            .set(createBy).equalTo(record::getCreateBy)
            .set(createTime).equalTo(record::getCreateTime)
            .set(lastUpdateBy).equalTo(record::getLastUpdateBy)
            .set(lastUpdateTime).equalTo(record::getLastUpdateTime)
            .set(deptFlag).equalTo(record::getDeptFlag)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.488382+09:00", comments="Source Table: sys_menu")
    default int updateByPrimaryKeySelective(SysMenu record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(parentId).equalToWhenPresent(record::getParentId)
            .set(url).equalToWhenPresent(record::getUrl)
            .set(perms).equalToWhenPresent(record::getPerms)
            .set(type).equalToWhenPresent(record::getType)
            .set(icon).equalToWhenPresent(record::getIcon)
            .set(orderNum).equalToWhenPresent(record::getOrderNum)
            .set(remark).equalToWhenPresent(record::getRemark)
            .set(createBy).equalToWhenPresent(record::getCreateBy)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(lastUpdateBy).equalToWhenPresent(record::getLastUpdateBy)
            .set(lastUpdateTime).equalToWhenPresent(record::getLastUpdateTime)
            .set(deptFlag).equalToWhenPresent(record::getDeptFlag)
            .where(id, isEqualTo(record::getId))
        );
    }
}