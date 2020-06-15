package com.dzm.tomato.admin.serviceImpl;

import cn.hutool.db.Page;
import cn.hutool.db.PageResult;
import com.dzm.tomato.admin.dao.SysLoginLogDynamicSqlSupport;
import com.dzm.tomato.admin.dao.SysLoginLogMapper;
import com.dzm.tomato.admin.model.SysLoginLog;
import com.dzm.tomato.admin.service.SysLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isIn;

public class SysLoginLogServiceImpl implements SysLoginLogService {

    @Autowired
    private SysLoginLogMapper sysLoginLogMapper;

    @Override
    public int delete(List<Long> ids) {
        return sysLoginLogMapper.delete(c -> c.where(SysLoginLogDynamicSqlSupport.id, isIn(ids)));
    }

    @Override
    public int save(SysLoginLog record) {
        return sysLoginLogMapper.insert(record);
    }

    @Override
    public int delete(SysLoginLog record) {
        return sysLoginLogMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(long id) {
        return sysLoginLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SysLoginLog findById(long id) {
        return sysLoginLogMapper.selectByPrimaryKey(id).get();
    }

    @Override
    public PageResult<SysLoginLog> findPage(Page page) {
        int offset = (page.getPageNumber() - 1) * page.getPageSize();
        List<SysLoginLog> list = sysLoginLogMapper.select(c -> c.limit(page.getPageSize()).offset(offset));
        PageResult<SysLoginLog> pageResult = new PageResult<SysLoginLog>();
        pageResult.addAll(list);
        return pageResult;
    }
}
