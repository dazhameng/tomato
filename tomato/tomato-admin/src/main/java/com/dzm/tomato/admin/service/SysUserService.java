package com.dzm.tomato.admin.service;

import java.util.List;
import java.util.Set;

import com.dzm.tomato.admin.model.SysRole;
import com.dzm.tomato.admin.model.SysUser;
import com.dzm.tomato.core.service.CrudService;

public interface SysUserService extends CrudService<SysUser> {
	/**
     * Custom method for test
	 * @param
	 * @return
     */
	List<SysUser> findAll();

	/**
	 * findByName
	 * @param name
	 * @return
	 */
	SysUser findByName(String name);

	/**
	 * findPermissions
	 * @param id
	 * @return
	 */
	Set<String> findPermissions(Long userId);

	/**
	 * findUserRoles
	 * @param userId
	 * @return
	 */
	List<SysRole> findUserRoles(Long userId);
}
