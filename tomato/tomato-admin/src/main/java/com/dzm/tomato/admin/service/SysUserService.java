package com.dzm.tomato.admin.service;

import java.util.List;
import java.util.Set;

import com.dzm.tomato.admin.model.SysUser;
import com.dzm.tomato.core.service.CrudService;

public interface SysUserService extends CrudService<SysUser> {
	/**
     * Custom method for test
     */
	List<SysUser> findAll();

	/**
	 * findByName
	 * @param name
	 */
	SysUser findByName(String name);

	/**
	 * findPermissions
	 * @param id
	 */
	Set<String> findPermissions(long id);
}
