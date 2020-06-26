package com.dzm.tomato.admin.serviceImpl;

import com.dzm.tomato.admin.dao.SysLoginLogDynamicSqlSupport;
import com.dzm.tomato.admin.dao.SysLoginLogMapper;
import com.dzm.tomato.admin.model.SysLoginLog;
import com.dzm.tomato.admin.service.SysLoginLogService;
import com.dzm.tomato.core.page.PageRequest;
import com.dzm.tomato.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isIn;

@Service
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
    public int delete(Long id) {
        return sysLoginLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SysLoginLog findById(Long id) {
        return sysLoginLogMapper.selectByPrimaryKey(id).get();
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
//        int offset = (page.getPageNumber() - 1) * page.getPageSize();
//        List<SysLoginLog> list = sysLoginLogMapper.select(c -> c.limit(page.getPageSize()).offset(offset));
//        PageResult<SysLoginLog> pageResult = new PageResult<SysLoginLog>();
//        pageResult.addAll(list);
//        return pageResult;
        return null;
    }

    @Transactional
    @Override
    public int writeLoginLog(String userName, String ip) {
//        List<SysLoginLog> sysLoginLogs = sysLoginLogMapper.findByUserNameAndStatus(userName, SysLoginLog.STATUS_ONLINE);
//        for(SysLoginLog sysLoginLog:sysLoginLogs) {
//            sysLoginLog.setStatus(SysLoginLog.STATUS_LOGIN);
//            sysLoginLogMapper.updateByPrimaryKey(sysLoginLog);
//        }
        SysLoginLog record = new SysLoginLog();
        record.setUserName(userName);
        record.setIp(ip);
        record.setStatus(SysLoginLog.STATUS_LOGOUT);
        sysLoginLogMapper.insertSelective(record);
        record.setStatus(SysLoginLog.STATUS_ONLINE);
        sysLoginLogMapper.insertSelective(record);
        return 0;
    }
}
