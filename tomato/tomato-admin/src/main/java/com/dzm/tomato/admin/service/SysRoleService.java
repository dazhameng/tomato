package com.dzm.tomato.admin.service;

import com.dzm.tomato.admin.model.SysMenu;
import com.dzm.tomato.admin.model.SysRole;
import com.dzm.tomato.core.service.CrudService;

import java.util.List;

public interface SysRoleService extends CrudService<SysRole> {

    /**
     * findRoleMenus
     * @param id
     * @return
     */
    public List<SysMenu> findRoleMenus(Long id);
}
