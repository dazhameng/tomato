package com.dzm.tomato.admin.service;

import com.dzm.tomato.admin.model.SysLoginLog;
import com.dzm.tomato.core.service.CrudService;

import java.util.List;

public interface SysLoginLogService extends CrudService<SysLoginLog> {
    public int delete(List<Long> ids);
}
