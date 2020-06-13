package com.dzm.tomato.admin.dao;

import com.dzm.tomato.admin.model.SysDept;
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

import static com.dzm.tomato.admin.dao.SysDeptDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface SysDeptMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.469843+09:00", comments="Source Table: sys_dept")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, parentId, orderNum, remark, createBy, createTime, lastUpdateBy, lastUpdateTime, deptFlag);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.468844+09:00", comments="Source Table: sys_dept")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.468914+09:00", comments="Source Table: sys_dept")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.468967+09:00", comments="Source Table: sys_dept")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysDept> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.469021+09:00", comments="Source Table: sys_dept")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SysDept> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.469082+09:00", comments="Source Table: sys_dept")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysDeptResult")
    Optional<SysDept> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.469152+09:00", comments="Source Table: sys_dept")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysDeptResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_num", property="orderNum", jdbcType=JdbcType.INTEGER),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_update_by", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="dept_flag", property="deptFlag", jdbcType=JdbcType.TINYINT)
    })
    List<SysDept> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.469276+09:00", comments="Source Table: sys_dept")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.469331+09:00", comments="Source Table: sys_dept")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sysDept, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.46938+09:00", comments="Source Table: sys_dept")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sysDept, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.469437+09:00", comments="Source Table: sys_dept")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.469493+09:00", comments="Source Table: sys_dept")
    default int insert(SysDept record) {
        return MyBatis3Utils.insert(this::insert, record, sysDept, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(parentId).toProperty("parentId")
            .map(orderNum).toProperty("orderNum")
            .map(remark).toProperty("remark")
            .map(createBy).toProperty("createBy")
            .map(createTime).toProperty("createTime")
            .map(lastUpdateBy).toProperty("lastUpdateBy")
            .map(lastUpdateTime).toProperty("lastUpdateTime")
            .map(deptFlag).toProperty("deptFlag")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.469587+09:00", comments="Source Table: sys_dept")
    default int insertMultiple(Collection<SysDept> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sysDept, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(parentId).toProperty("parentId")
            .map(orderNum).toProperty("orderNum")
            .map(remark).toProperty("remark")
            .map(createBy).toProperty("createBy")
            .map(createTime).toProperty("createTime")
            .map(lastUpdateBy).toProperty("lastUpdateBy")
            .map(lastUpdateTime).toProperty("lastUpdateTime")
            .map(deptFlag).toProperty("deptFlag")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.469674+09:00", comments="Source Table: sys_dept")
    default int insertSelective(SysDept record) {
        return MyBatis3Utils.insert(this::insert, record, sysDept, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(parentId).toPropertyWhenPresent("parentId", record::getParentId)
            .map(orderNum).toPropertyWhenPresent("orderNum", record::getOrderNum)
            .map(remark).toPropertyWhenPresent("remark", record::getRemark)
            .map(createBy).toPropertyWhenPresent("createBy", record::getCreateBy)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(lastUpdateBy).toPropertyWhenPresent("lastUpdateBy", record::getLastUpdateBy)
            .map(lastUpdateTime).toPropertyWhenPresent("lastUpdateTime", record::getLastUpdateTime)
            .map(deptFlag).toPropertyWhenPresent("deptFlag", record::getDeptFlag)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.469926+09:00", comments="Source Table: sys_dept")
    default Optional<SysDept> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sysDept, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.470165+09:00", comments="Source Table: sys_dept")
    default List<SysDept> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sysDept, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.47046+09:00", comments="Source Table: sys_dept")
    default List<SysDept> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sysDept, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.470619+09:00", comments="Source Table: sys_dept")
    default Optional<SysDept> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.470773+09:00", comments="Source Table: sys_dept")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sysDept, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.47084+09:00", comments="Source Table: sys_dept")
    static UpdateDSL<UpdateModel> updateAllColumns(SysDept record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(parentId).equalTo(record::getParentId)
                .set(orderNum).equalTo(record::getOrderNum)
                .set(remark).equalTo(record::getRemark)
                .set(createBy).equalTo(record::getCreateBy)
                .set(createTime).equalTo(record::getCreateTime)
                .set(lastUpdateBy).equalTo(record::getLastUpdateBy)
                .set(lastUpdateTime).equalTo(record::getLastUpdateTime)
                .set(deptFlag).equalTo(record::getDeptFlag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.470969+09:00", comments="Source Table: sys_dept")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SysDept record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(orderNum).equalToWhenPresent(record::getOrderNum)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(createBy).equalToWhenPresent(record::getCreateBy)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(lastUpdateBy).equalToWhenPresent(record::getLastUpdateBy)
                .set(lastUpdateTime).equalToWhenPresent(record::getLastUpdateTime)
                .set(deptFlag).equalToWhenPresent(record::getDeptFlag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.471097+09:00", comments="Source Table: sys_dept")
    default int updateByPrimaryKey(SysDept record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(parentId).equalTo(record::getParentId)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.471227+09:00", comments="Source Table: sys_dept")
    default int updateByPrimaryKeySelective(SysDept record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(parentId).equalToWhenPresent(record::getParentId)
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