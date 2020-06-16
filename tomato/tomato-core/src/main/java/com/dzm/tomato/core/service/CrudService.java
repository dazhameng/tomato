package com.dzm.tomato.core.service;

import cn.hutool.db.Page;
import cn.hutool.db.PageResult;

public interface CrudService<T> {

    /**
     * Save
     * @param record
     */
    int save(T record);

    /**
     * Delete
     * @param record
     */
    int delete(T record);

    /**
     * Delete
     * @param id
     */
    int delete(Long id);

    /**
     * findById
     * @param id
     */
    T findById(Long id);

    /**
     * findPage
     * @param page
     */
    PageResult<T> findPage(Page page);
}
