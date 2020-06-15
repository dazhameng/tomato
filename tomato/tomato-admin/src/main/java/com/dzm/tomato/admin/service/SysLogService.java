package com.dzm.tomato.admin.service;

import com.dzm.tomato.admin.model.SysLog;
import com.dzm.tomato.core.service.CrudService;

import java.util.List;

public interface SysLogService extends CrudService<SysLog> {
    public int delete(List<Long> ids);
}
