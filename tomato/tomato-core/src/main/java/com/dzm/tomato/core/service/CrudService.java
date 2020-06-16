package com.dzm.tomato.core.service;

import com.dzm.tomato.core.page.PageRequest;
import com.dzm.tomato.core.page.PageResult;

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
     * @param pageRequest
     */
    PageResult<T> findPage(PageRequest pageRequest);
}
