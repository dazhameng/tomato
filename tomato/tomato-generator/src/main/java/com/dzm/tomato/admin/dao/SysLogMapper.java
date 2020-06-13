package com.dzm.tomato.admin.dao;

import static com.dzm.tomato.admin.dao.SysLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.dzm.tomato.admin.model.SysLog;
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
public interface SysLogMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.480076+09:00", comments="Source Table: sys_log")
    BasicColumn[] selectList = BasicColumn.columnList(id, userName, operation, method, params, time, ip, remark, createBy, createTime, lastUpdateBy, lastUpdateTime, deptFlag);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.479107+09:00", comments="Source Table: sys_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.479157+09:00", comments="Source Table: sys_log")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.479202+09:00", comments="Source Table: sys_log")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysLog> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.479249+09:00", comments="Source Table: sys_log")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SysLog> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.479297+09:00", comments="Source Table: sys_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysLogResult")
    Optional<SysLog> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.479353+09:00", comments="Source Table: sys_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysLogResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="operation", property="operation", jdbcType=JdbcType.VARCHAR),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="params", property="params", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.BIGINT),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_update_by", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="dept_flag", property="deptFlag", jdbcType=JdbcType.TINYINT)
    })
    List<SysLog> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.479461+09:00", comments="Source Table: sys_log")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.479507+09:00", comments="Source Table: sys_log")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sysLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.47955+09:00", comments="Source Table: sys_log")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sysLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.479598+09:00", comments="Source Table: sys_log")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.479645+09:00", comments="Source Table: sys_log")
    default int insert(SysLog record) {
        return MyBatis3Utils.insert(this::insert, record, sysLog, c ->
            c.map(id).toProperty("id")
            .map(userName).toProperty("userName")
            .map(operation).toProperty("operation")
            .map(method).toProperty("method")
            .map(params).toProperty("params")
            .map(time).toProperty("time")
            .map(ip).toProperty("ip")
            .map(remark).toProperty("remark")
            .map(createBy).toProperty("createBy")
            .map(createTime).toProperty("createTime")
            .map(lastUpdateBy).toProperty("lastUpdateBy")
            .map(lastUpdateTime).toProperty("lastUpdateTime")
            .map(deptFlag).toProperty("deptFlag")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.479723+09:00", comments="Source Table: sys_log")
    default int insertMultiple(Collection<SysLog> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sysLog, c ->
            c.map(id).toProperty("id")
            .map(userName).toProperty("userName")
            .map(operation).toProperty("operation")
            .map(method).toProperty("method")
            .map(params).toProperty("params")
            .map(time).toProperty("time")
            .map(ip).toProperty("ip")
            .map(remark).toProperty("remark")
            .map(createBy).toProperty("createBy")
            .map(createTime).toProperty("createTime")
            .map(lastUpdateBy).toProperty("lastUpdateBy")
            .map(lastUpdateTime).toProperty("lastUpdateTime")
            .map(deptFlag).toProperty("deptFlag")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.479807+09:00", comments="Source Table: sys_log")
    default int insertSelective(SysLog record) {
        return MyBatis3Utils.insert(this::insert, record, sysLog, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(userName).toPropertyWhenPresent("userName", record::getUserName)
            .map(operation).toPropertyWhenPresent("operation", record::getOperation)
            .map(method).toPropertyWhenPresent("method", record::getMethod)
            .map(params).toPropertyWhenPresent("params", record::getParams)
            .map(time).toPropertyWhenPresent("time", record::getTime)
            .map(ip).toPropertyWhenPresent("ip", record::getIp)
            .map(remark).toPropertyWhenPresent("remark", record::getRemark)
            .map(createBy).toPropertyWhenPresent("createBy", record::getCreateBy)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(lastUpdateBy).toPropertyWhenPresent("lastUpdateBy", record::getLastUpdateBy)
            .map(lastUpdateTime).toPropertyWhenPresent("lastUpdateTime", record::getLastUpdateTime)
            .map(deptFlag).toPropertyWhenPresent("deptFlag", record::getDeptFlag)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.480127+09:00", comments="Source Table: sys_log")
    default Optional<SysLog> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sysLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.480179+09:00", comments="Source Table: sys_log")
    default List<SysLog> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sysLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.480226+09:00", comments="Source Table: sys_log")
    default List<SysLog> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sysLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.480276+09:00", comments="Source Table: sys_log")
    default Optional<SysLog> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.480327+09:00", comments="Source Table: sys_log")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sysLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.480373+09:00", comments="Source Table: sys_log")
    static UpdateDSL<UpdateModel> updateAllColumns(SysLog record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(userName).equalTo(record::getUserName)
                .set(operation).equalTo(record::getOperation)
                .set(method).equalTo(record::getMethod)
                .set(params).equalTo(record::getParams)
                .set(time).equalTo(record::getTime)
                .set(ip).equalTo(record::getIp)
                .set(remark).equalTo(record::getRemark)
                .set(createBy).equalTo(record::getCreateBy)
                .set(createTime).equalTo(record::getCreateTime)
                .set(lastUpdateBy).equalTo(record::getLastUpdateBy)
                .set(lastUpdateTime).equalTo(record::getLastUpdateTime)
                .set(deptFlag).equalTo(record::getDeptFlag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.480483+09:00", comments="Source Table: sys_log")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SysLog record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(userName).equalToWhenPresent(record::getUserName)
                .set(operation).equalToWhenPresent(record::getOperation)
                .set(method).equalToWhenPresent(record::getMethod)
                .set(params).equalToWhenPresent(record::getParams)
                .set(time).equalToWhenPresent(record::getTime)
                .set(ip).equalToWhenPresent(record::getIp)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(createBy).equalToWhenPresent(record::getCreateBy)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(lastUpdateBy).equalToWhenPresent(record::getLastUpdateBy)
                .set(lastUpdateTime).equalToWhenPresent(record::getLastUpdateTime)
                .set(deptFlag).equalToWhenPresent(record::getDeptFlag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.480609+09:00", comments="Source Table: sys_log")
    default int updateByPrimaryKey(SysLog record) {
        return update(c ->
            c.set(userName).equalTo(record::getUserName)
            .set(operation).equalTo(record::getOperation)
            .set(method).equalTo(record::getMethod)
            .set(params).equalTo(record::getParams)
            .set(time).equalTo(record::getTime)
            .set(ip).equalTo(record::getIp)
            .set(remark).equalTo(record::getRemark)
            .set(createBy).equalTo(record::getCreateBy)
            .set(createTime).equalTo(record::getCreateTime)
            .set(lastUpdateBy).equalTo(record::getLastUpdateBy)
            .set(lastUpdateTime).equalTo(record::getLastUpdateTime)
            .set(deptFlag).equalTo(record::getDeptFlag)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-14T02:28:10.480723+09:00", comments="Source Table: sys_log")
    default int updateByPrimaryKeySelective(SysLog record) {
        return update(c ->
            c.set(userName).equalToWhenPresent(record::getUserName)
            .set(operation).equalToWhenPresent(record::getOperation)
            .set(method).equalToWhenPresent(record::getMethod)
            .set(params).equalToWhenPresent(record::getParams)
            .set(time).equalToWhenPresent(record::getTime)
            .set(ip).equalToWhenPresent(record::getIp)
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