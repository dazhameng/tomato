package com.dzm.tomato.admin.serviceImpl;

import com.dzm.tomato.admin.dao.SysLogDynamicSqlSupport;
import com.dzm.tomato.admin.dao.SysLogMapper;
import com.dzm.tomato.admin.model.SysLog;
import com.dzm.tomato.admin.service.SysLogService;
import com.dzm.tomato.core.page.PageRequest;
import com.dzm.tomato.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static org.mybatis.dynamic.sql.SqlBuilder.isIn;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;

@Service
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public int delete(List<Long> ids) {
        return sysLogMapper.delete( c -> c.where(SysLogDynamicSqlSupport.id, isIn(ids)));
    }

    @Override
    public int save(SysLog record) {
        return sysLogMapper.insert(record);
    }

    @Override
    public int delete(SysLog record) {
        return sysLogMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(Long id) {
        return sysLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SysLog findById(Long id) {
        return sysLogMapper.selectOne(c -> c.where(SysLogDynamicSqlSupport.id, isEqualTo(id))).get();
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
//        int offset = (page.getPageNumber() - 1) * page.getPageSize();
//        List<SysLog> list = sysLogMapper.select(c -> c.limit(page.getPageSize()).offset(offset));
//        PageResult<SysLog> pageResult = new PageResult<SysLog>();
//        pageResult.addAll(list);
//        return pageResult;
        return null;
    }
}
