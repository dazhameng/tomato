package com.dzm.tomato.admin.serviceImpl;

import com.dzm.tomato.admin.dao.SysMenuMapper;
import com.dzm.tomato.admin.model.SysMenu;
import com.dzm.tomato.admin.service.SysMenuService;
import com.dzm.tomato.core.page.MybatisPageHelper;
import com.dzm.tomato.core.page.PageRequest;
import com.dzm.tomato.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public int save(SysMenu record) {
        return sysMenuMapper.insert(record);
    }

    @Override
    public int delete(SysMenu record) {
        return sysMenuMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(Long id) {
        return sysMenuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SysMenu findById(Long id) {
        return sysMenuMapper.selectByPrimaryKey(id).get();
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, sysMenuMapper);
    }
}
