package com.dzm.tomato.admin.service;

import java.util.List;

import com.dzm.tomato.admin.model.SysUser;

public interface SysUserService {
	/**
     * Custom method for test
     * @return
     */
	List<SysUser> findAll();
	
	/**
	 * Auto method for test
	 * @return
	 */
	SysUser selectByPrimaryKey(long id);
}
