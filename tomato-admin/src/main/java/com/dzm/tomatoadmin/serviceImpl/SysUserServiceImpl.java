package com.dzm.tomatoadmin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dzm.tomatoadmin.dao.SysUserMapper;
import com.dzm.tomatoadmin.model.SysUser;
import com.dzm.tomatoadmin.service.SysUserService;

public class SysUserServiceImpl implements SysUserService{
	
	@Autowired
	private SysUserMapper SysUserMapper;

	@Override
	public List<SysUser> findAll() {
		return SysUserMapper.findAll();
	}
	
}
