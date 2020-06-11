package com.dzm.tomato.admin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dzm.tomato.admin.service.SysUserService;
import com.dzm.tomato.admin.dao.SysUserMapper;
import com.dzm.tomato.admin.model.SysUser;

@Service
public class SysUserServiceImpl implements SysUserService{
	
	@Autowired
	private SysUserMapper SysUserMapper;

	@Override
	public List<SysUser> findAll() {
		return SysUserMapper.findAll();
	}

	@Override
	public SysUser selectByPrimaryKey(long id) {
		return SysUserMapper.selectByPrimaryKey(id);
	}
	
}
