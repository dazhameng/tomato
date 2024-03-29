package com.dzm.tomato.admin.service;

import com.dzm.tomato.admin.model.SysDict;
import com.dzm.tomato.core.service.CrudService;

import java.util.List;

public interface SysDictService extends CrudService<SysDict> {
    /**
     * delete
     * @param ids
     * @return
     */
    public int delete(List<Long> ids);
}
