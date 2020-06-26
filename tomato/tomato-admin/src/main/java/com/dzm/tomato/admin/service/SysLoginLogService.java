package com.dzm.tomato.admin.service;

import com.dzm.tomato.admin.model.SysLoginLog;
import com.dzm.tomato.core.service.CrudService;

import java.util.List;

public interface SysLoginLogService extends CrudService<SysLoginLog> {
    /**
     * delete
     * @param ids
     * @return
     */
    public int delete(List<Long> ids);

    /**
     * 记录登录日志
     * @param userName
     * @param ip
     * @return
     */
    int writeLoginLog(String userName, String ip);
}
