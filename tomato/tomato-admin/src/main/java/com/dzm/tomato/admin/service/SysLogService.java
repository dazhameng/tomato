package com.dzm.tomato.admin.service;

import com.dzm.tomato.admin.model.SysLog;
import com.dzm.tomato.core.service.CrudService;

import java.util.List;

public interface SysLogService extends CrudService<SysLog> {
    /**
     * delete
     * @param ids
     * @return
     */
    public int delete(List<Long> ids);
}
