package com.dzm.tomato.admin.dao;

import com.dzm.tomato.admin.model.SysRoleMenu;
import org.apache.ibatis.annotations.*;
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

import javax.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static com.dzm.tomato.admin.dao.SysRoleMenuDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface SysRoleMenuMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.497115+09:00", comments="Source Table: sys_role_menu")
    BasicColumn[] selectList = BasicColumn.columnList(id, roleId, menuId, createBy, createTime, lastUpdateBy, lastUpdateTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.496225+09:00", comments="Source Table: sys_role_menu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.496265+09:00", comments="Source Table: sys_role_menu")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.496308+09:00", comments="Source Table: sys_role_menu")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysRoleMenu> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.496349+09:00", comments="Source Table: sys_role_menu")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SysRoleMenu> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.496412+09:00", comments="Source Table: sys_role_menu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysRoleMenuResult")
    Optional<SysRoleMenu> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.496462+09:00", comments="Source Table: sys_role_menu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysRoleMenuResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.BIGINT),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_update_by", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysRoleMenu> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.49655+09:00", comments="Source Table: sys_role_menu")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.496606+09:00", comments="Source Table: sys_role_menu")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sysRoleMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.496798+09:00", comments="Source Table: sys_role_menu")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sysRoleMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.496837+09:00", comments="Source Table: sys_role_menu")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.496873+09:00", comments="Source Table: sys_role_menu")
    default int insert(SysRoleMenu record) {
        return MyBatis3Utils.insert(this::insert, record, sysRoleMenu, c ->
            c.map(id).toProperty("id")
            .map(roleId).toProperty("roleId")
            .map(menuId).toProperty("menuId")
            .map(createBy).toProperty("createBy")
            .map(createTime).toProperty("createTime")
            .map(lastUpdateBy).toProperty("lastUpdateBy")
            .map(lastUpdateTime).toProperty("lastUpdateTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.496938+09:00", comments="Source Table: sys_role_menu")
    default int insertMultiple(Collection<SysRoleMenu> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sysRoleMenu, c ->
            c.map(id).toProperty("id")
            .map(roleId).toProperty("roleId")
            .map(menuId).toProperty("menuId")
            .map(createBy).toProperty("createBy")
            .map(createTime).toProperty("createTime")
            .map(lastUpdateBy).toProperty("lastUpdateBy")
            .map(lastUpdateTime).toProperty("lastUpdateTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.497005+09:00", comments="Source Table: sys_role_menu")
    default int insertSelective(SysRoleMenu record) {
        return MyBatis3Utils.insert(this::insert, record, sysRoleMenu, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(roleId).toPropertyWhenPresent("roleId", record::getRoleId)
            .map(menuId).toPropertyWhenPresent("menuId", record::getMenuId)
            .map(createBy).toPropertyWhenPresent("createBy", record::getCreateBy)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(lastUpdateBy).toPropertyWhenPresent("lastUpdateBy", record::getLastUpdateBy)
            .map(lastUpdateTime).toPropertyWhenPresent("lastUpdateTime", record::getLastUpdateTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.497153+09:00", comments="Source Table: sys_role_menu")
    default Optional<SysRoleMenu> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sysRoleMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.497191+09:00", comments="Source Table: sys_role_menu")
    default List<SysRoleMenu> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sysRoleMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.497229+09:00", comments="Source Table: sys_role_menu")
    default List<SysRoleMenu> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sysRoleMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.497266+09:00", comments="Source Table: sys_role_menu")
    default Optional<SysRoleMenu> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.497305+09:00", comments="Source Table: sys_role_menu")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sysRoleMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.497341+09:00", comments="Source Table: sys_role_menu")
    static UpdateDSL<UpdateModel> updateAllColumns(SysRoleMenu record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(roleId).equalTo(record::getRoleId)
                .set(menuId).equalTo(record::getMenuId)
                .set(createBy).equalTo(record::getCreateBy)
                .set(createTime).equalTo(record::getCreateTime)
                .set(lastUpdateBy).equalTo(record::getLastUpdateBy)
                .set(lastUpdateTime).equalTo(record::getLastUpdateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.497467+09:00", comments="Source Table: sys_role_menu")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SysRoleMenu record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(menuId).equalToWhenPresent(record::getMenuId)
                .set(createBy).equalToWhenPresent(record::getCreateBy)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(lastUpdateBy).equalToWhenPresent(record::getLastUpdateBy)
                .set(lastUpdateTime).equalToWhenPresent(record::getLastUpdateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.497549+09:00", comments="Source Table: sys_role_menu")
    default int updateByPrimaryKey(SysRoleMenu record) {
        return update(c ->
            c.set(roleId).equalTo(record::getRoleId)
            .set(menuId).equalTo(record::getMenuId)
            .set(createBy).equalTo(record::getCreateBy)
            .set(createTime).equalTo(record::getCreateTime)
            .set(lastUpdateBy).equalTo(record::getLastUpdateBy)
            .set(lastUpdateTime).equalTo(record::getLastUpdateTime)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.497634+09:00", comments="Source Table: sys_role_menu")
    default int updateByPrimaryKeySelective(SysRoleMenu record) {
        return update(c ->
            c.set(roleId).equalToWhenPresent(record::getRoleId)
            .set(menuId).equalToWhenPresent(record::getMenuId)
            .set(createBy).equalToWhenPresent(record::getCreateBy)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(lastUpdateBy).equalToWhenPresent(record::getLastUpdateBy)
            .set(lastUpdateTime).equalToWhenPresent(record::getLastUpdateTime)
            .where(id, isEqualTo(record::getId))
        );
    }
}