package com.dzm.tomato.admin.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dzm.tomato.admin.service.SysUserService;
import com.dzm.tomato.admin.dao.SysUserMapper;
import com.dzm.tomato.admin.model.SysUser;

@Service
public class SysUserServiceImpl implements SysUserService{
	
	@Autowired
	private SysUserMapper sysUserMapper;

	@Override
	public List<SysUser> findAll() {
//		return sysUserMapper.findAll();
		return sysUserMapper.select(c -> c);
	}

	@Override
	public SysUser selectByPrimaryKey(long id) {
		return  sysUserMapper.selectByPrimaryKey(id).get();
	}
	
}
