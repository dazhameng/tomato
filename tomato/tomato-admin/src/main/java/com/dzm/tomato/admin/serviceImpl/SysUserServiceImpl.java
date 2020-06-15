package com.dzm.tomato.admin.serviceImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cn.hutool.db.Page;
import cn.hutool.db.PageResult;
import com.dzm.tomato.admin.dao.*;
import com.dzm.tomato.admin.model.SysRole;
import com.dzm.tomato.admin.model.SysUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dzm.tomato.admin.service.SysUserService;
import com.dzm.tomato.admin.model.SysUser;
import org.springframework.transaction.annotation.Transactional;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.isIn;

@Service
public class SysUserServiceImpl implements SysUserService{
	
	@Autowired
	private SysUserMapper sysUserMapper;

	@Autowired
	private SysUserRoleMapper sysUserRoleMapper;

	@Override
	public List<SysUser> findAll() {
//		return sysUserMapper.findAll();
//		return sysUserMapper.select(c -> c);
//		RowBounds rowBounds = new RowBounds(1,5);
//		List<SysUser> list  = sysUserMapper.select(c ->
//				c.limit(2).offset(1));
		List<SysUser> list = sysUserMapper.selectMany(null);
		return list;
	}

	//	@Transactional
	@Override
	public int save(SysUser record) {
		Long id = record.getId();
		if(id == null || id == 0){
			sysUserMapper.insert(record);
		}else{
			sysUserMapper.updateByPrimaryKey(record);
		}
		return 1;
	}

	@Transactional
	@Override
	public int delete(SysUser record) {
		deleteSysUserRole(record.getId());
		return sysUserMapper.deleteByPrimaryKey(record.getId());
	}

	@Transactional
	@Override
	public int delete(long id) {
		deleteSysUserRole(id);
		return sysUserMapper.deleteByPrimaryKey(id);
	}

	private int deleteSysUserRole(long id){
		return sysUserRoleMapper.delete( c -> c.where(SysUserRoleDynamicSqlSupport.userId, isEqualTo(id)));
	}

	@Override
	public SysUser findById(long id) {
		return sysUserMapper.selectByPrimaryKey(id).get();
	}

	@Override
	public SysUser findByName(String name) {
		return sysUserMapper.selectOne( c -> c.where(SysUserDynamicSqlSupport.name, isEqualTo(name.trim()))).get();
	}

	@Override
	public Set<String> findPermissions(long id) {
//		List<SysUserRole> surList = sysUserRoleMapper.select( c -> c.where( SysUserRoleDynamicSqlSupport.userId, isEqualTo(id)));
//		Set<Long> roleIdList = new HashSet<Long>();
//		for(SysUserRole sur: surList){
//			roleIdList.add(sur.getRoleId());
//		}
//
//		List<SysRole> roleList = sysRoleMapper.select( c -> c.where(SysRoleDynamicSqlSupport.id, isIn(roleIdList)));
//		for(SysRole sysRole: roleList){
//			string tempPerm = sysRole
//		}
//
//		Set<String> result = new HashSet<String>();
		return null;
	}

	@Override
	public PageResult<SysUser> findPage(Page page) {
		int offset = (page.getPageNumber() - 1) * page.getPageSize();
		int limit = page.getPageSize();
		List<SysUser> list = sysUserMapper.select(c ->
				c.limit(limit).offset(offset));
		PageResult<SysUser> result = new PageResult<SysUser>();
		result.addAll(list);
		return result;
	}
}
