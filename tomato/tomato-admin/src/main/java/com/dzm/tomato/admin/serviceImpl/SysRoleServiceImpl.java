package com.dzm.tomato.admin.serviceImpl;

import com.dzm.tomato.admin.dao.SysMenuMapper;
import com.dzm.tomato.admin.dao.SysRoleMapper;
import com.dzm.tomato.admin.dao.SysRoleMenuDynamicSqlSupport;
import com.dzm.tomato.admin.dao.SysRoleMenuMapper;
import com.dzm.tomato.admin.model.SysMenu;
import com.dzm.tomato.admin.model.SysRole;
import com.dzm.tomato.admin.model.SysRoleMenu;
import com.dzm.tomato.admin.service.SysRoleService;
import com.dzm.tomato.core.page.MybatisPageHelper;
import com.dzm.tomato.core.page.PageRequest;
import com.dzm.tomato.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public List<SysMenu> findRoleMenus(Long id) {
        List<SysMenu> sysMenuList = new ArrayList<>();
        List<SysRoleMenu> sysRoleMenuList = sysRoleMenuMapper.select(c -> c.where(SysRoleMenuDynamicSqlSupport.roleId, isEqualTo(id)));
        for (SysRoleMenu sysRoleMenu : sysRoleMenuList){
            sysMenuList.add(sysMenuMapper.selectByPrimaryKey(sysRoleMenu.getMenuId()).get());
        }
        return sysMenuList;
    }

    @Override
    public int save(SysRole record) {
        return sysRoleMapper.insert(record);
    }

    @Override
    public int delete(SysRole record) {
        return sysRoleMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(Long id) {
        return sysRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SysRole findById(Long id) {
        return sysRoleMapper.selectByPrimaryKey(id).get();
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, sysRoleMapper);
    }
}
