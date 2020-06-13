package com.dzm.tomato.admin.dao;

import static com.dzm.tomato.admin.dao.SysDictDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.dzm.tomato.admin.model.SysDict;
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
public interface SysDictMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.475166+09:00", comments="Source Table: sys_dict")
    BasicColumn[] selectList = BasicColumn.columnList(id, value, label, type, description, sort, remark, createBy, createTime, lastUpdateBy, lastUpdateTime, deptFlag);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.474256+09:00", comments="Source Table: sys_dict")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.474311+09:00", comments="Source Table: sys_dict")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.474363+09:00", comments="Source Table: sys_dict")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysDict> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.474413+09:00", comments="Source Table: sys_dict")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SysDict> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.474465+09:00", comments="Source Table: sys_dict")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysDictResult")
    Optional<SysDict> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.474552+09:00", comments="Source Table: sys_dict")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysDictResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="label", property="label", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.DECIMAL),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_update_by", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="dept_flag", property="deptFlag", jdbcType=JdbcType.TINYINT)
    })
    List<SysDict> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.474671+09:00", comments="Source Table: sys_dict")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.474721+09:00", comments="Source Table: sys_dict")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sysDict, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.474766+09:00", comments="Source Table: sys_dict")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sysDict, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.474812+09:00", comments="Source Table: sys_dict")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.474859+09:00", comments="Source Table: sys_dict")
    default int insert(SysDict record) {
        return MyBatis3Utils.insert(this::insert, record, sysDict, c ->
            c.map(id).toProperty("id")
            .map(value).toProperty("value")
            .map(label).toProperty("label")
            .map(type).toProperty("type")
            .map(description).toProperty("description")
            .map(sort).toProperty("sort")
            .map(remark).toProperty("remark")
            .map(createBy).toProperty("createBy")
            .map(createTime).toProperty("createTime")
            .map(lastUpdateBy).toProperty("lastUpdateBy")
            .map(lastUpdateTime).toProperty("lastUpdateTime")
            .map(deptFlag).toProperty("deptFlag")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.474939+09:00", comments="Source Table: sys_dict")
    default int insertMultiple(Collection<SysDict> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sysDict, c ->
            c.map(id).toProperty("id")
            .map(value).toProperty("value")
            .map(label).toProperty("label")
            .map(type).toProperty("type")
            .map(description).toProperty("description")
            .map(sort).toProperty("sort")
            .map(remark).toProperty("remark")
            .map(createBy).toProperty("createBy")
            .map(createTime).toProperty("createTime")
            .map(lastUpdateBy).toProperty("lastUpdateBy")
            .map(lastUpdateTime).toProperty("lastUpdateTime")
            .map(deptFlag).toProperty("deptFlag")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.475021+09:00", comments="Source Table: sys_dict")
    default int insertSelective(SysDict record) {
        return MyBatis3Utils.insert(this::insert, record, sysDict, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(value).toPropertyWhenPresent("value", record::getValue)
            .map(label).toPropertyWhenPresent("label", record::getLabel)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
            .map(sort).toPropertyWhenPresent("sort", record::getSort)
            .map(remark).toPropertyWhenPresent("remark", record::getRemark)
            .map(createBy).toPropertyWhenPresent("createBy", record::getCreateBy)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(lastUpdateBy).toPropertyWhenPresent("lastUpdateBy", record::getLastUpdateBy)
            .map(lastUpdateTime).toPropertyWhenPresent("lastUpdateTime", record::getLastUpdateTime)
            .map(deptFlag).toPropertyWhenPresent("deptFlag", record::getDeptFlag)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.475215+09:00", comments="Source Table: sys_dict")
    default Optional<SysDict> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sysDict, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.475271+09:00", comments="Source Table: sys_dict")
    default List<SysDict> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sysDict, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.47535+09:00", comments="Source Table: sys_dict")
    default List<SysDict> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sysDict, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.4754+09:00", comments="Source Table: sys_dict")
    default Optional<SysDict> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.475455+09:00", comments="Source Table: sys_dict")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sysDict, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.475505+09:00", comments="Source Table: sys_dict")
    static UpdateDSL<UpdateModel> updateAllColumns(SysDict record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(value).equalTo(record::getValue)
                .set(label).equalTo(record::getLabel)
                .set(type).equalTo(record::getType)
                .set(description).equalTo(record::getDescription)
                .set(sort).equalTo(record::getSort)
                .set(remark).equalTo(record::getRemark)
                .set(createBy).equalTo(record::getCreateBy)
                .set(createTime).equalTo(record::getCreateTime)
                .set(lastUpdateBy).equalTo(record::getLastUpdateBy)
                .set(lastUpdateTime).equalTo(record::getLastUpdateTime)
                .set(deptFlag).equalTo(record::getDeptFlag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.475614+09:00", comments="Source Table: sys_dict")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SysDict record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(value).equalToWhenPresent(record::getValue)
                .set(label).equalToWhenPresent(record::getLabel)
                .set(type).equalToWhenPresent(record::getType)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(sort).equalToWhenPresent(record::getSort)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(createBy).equalToWhenPresent(record::getCreateBy)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(lastUpdateBy).equalToWhenPresent(record::getLastUpdateBy)
                .set(lastUpdateTime).equalToWhenPresent(record::getLastUpdateTime)
                .set(deptFlag).equalToWhenPresent(record::getDeptFlag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.475732+09:00", comments="Source Table: sys_dict")
    default int updateByPrimaryKey(SysDict record) {
        return update(c ->
            c.set(value).equalTo(record::getValue)
            .set(label).equalTo(record::getLabel)
            .set(type).equalTo(record::getType)
            .set(description).equalTo(record::getDescription)
            .set(sort).equalTo(record::getSort)
            .set(remark).equalTo(record::getRemark)
            .set(createBy).equalTo(record::getCreateBy)
            .set(createTime).equalTo(record::getCreateTime)
            .set(lastUpdateBy).equalTo(record::getLastUpdateBy)
            .set(lastUpdateTime).equalTo(record::getLastUpdateTime)
            .set(deptFlag).equalTo(record::getDeptFlag)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.475838+09:00", comments="Source Table: sys_dict")
    default int updateByPrimaryKeySelective(SysDict record) {
        return update(c ->
            c.set(value).equalToWhenPresent(record::getValue)
            .set(label).equalToWhenPresent(record::getLabel)
            .set(type).equalToWhenPresent(record::getType)
            .set(description).equalToWhenPresent(record::getDescription)
            .set(sort).equalToWhenPresent(record::getSort)
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