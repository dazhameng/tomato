package com.dzm.tomato.admin.service;

import com.dzm.tomato.admin.model.SysDept;
import com.dzm.tomato.core.service.CrudService;

import java.util.List;

public interface SysDeptService extends CrudService<SysDept> {
    /**
     * findTree
     * @return
     */
    public List<SysDept> findTree();

    /**
     * findParent
     * @param id
     * @return
     */
    public SysDept findParent(Long id);

    /**
     * findChilds
     * @param id
     * @return
     */
    public List<SysDept> findChilds(Long id);
}
