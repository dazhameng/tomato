package com.dzm.tomato.admin.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import com.dzm.tomato.admin.dao.*;
import com.dzm.tomato.admin.model.SysMenu;
import com.dzm.tomato.admin.model.SysRole;
import com.dzm.tomato.admin.model.SysUserRole;
import com.dzm.tomato.core.page.MybatisPageHelper;
import com.dzm.tomato.core.page.PageRequest;
import com.dzm.tomato.core.page.PageResult;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dzm.tomato.admin.service.SysUserService;
import com.dzm.tomato.admin.model.SysUser;
import org.springframework.transaction.annotation.Transactional;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Service
public class SysUserServiceImpl implements SysUserService{
	
	@Autowired
	private SysUserMapper sysUserMapper;

	@Autowired
	private SysUserRoleMapper sysUserRoleMapper;

	@Autowired
	private SysRoleMapper sysRoleMapper;

	@Override
	public List<SysUser> findAll() {
//		return sysUserMapper.findAll();
//		return sysUserMapper.select(SelectDSLCompleter.allRows());
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
	public int delete(Long id) {
		deleteSysUserRole(id);
		return sysUserMapper.deleteByPrimaryKey(id);
	}

	private int deleteSysUserRole(long id){
		return sysUserRoleMapper.delete( c -> c.where(SysUserRoleDynamicSqlSupport.userId, isEqualTo(id)));
	}

	@Override
	public SysUser findById(Long id) {
		return sysUserMapper.selectByPrimaryKey(id).get();
	}

	@Override
	public SysUser findByName(String name) {
		return sysUserMapper.selectOne( c -> c.where(SysUserDynamicSqlSupport.name, isEqualTo(name.trim()))).get();
	}

	@Override
	public Set<String> findPermissions(Long userId) {
		List<SysUserRole> sysUserRoles = sysUserRoleMapper.select(c -> c.where(SysUserRoleDynamicSqlSupport.userId, isEqualTo(userId)));
		List<SysRole> sysRoles = new ArrayList<SysRole>();
		for (SysUserRole sysUserRole: sysUserRoles){
			sysRoles.add(sysRoleMapper.selectByPrimaryKey(sysUserRole.getRoleId()).get());
		}
		List<SysMenu> sysMenus = new ArrayList<SysMenu>();
		// to do
		return null;
	}

	@Override
	public List<SysRole> findUserRoles(Long userId){
		List<SysUserRole> sysUserRoles = sysUserRoleMapper.select(c -> c.where(SysUserRoleDynamicSqlSupport.userId, isEqualTo(userId)));
		List<SysRole> sysRoles = new ArrayList<SysRole>();
		for (SysUserRole sysUserRole: sysUserRoles){
			sysRoles.add(sysRoleMapper.selectByPrimaryKey(sysUserRole.getRoleId()).get());
		}
		return sysRoles;
	}

	@Override
	public PageResult<SysUser> findPage(PageRequest pageRequest) {
//		int offset = (page.getPageNumber() - 1) * page.getPageSize();
//		int limit = page.getPageSize();
//		List<SysUser> list = sysUserMapper.select(c ->
//				c.limit(limit).offset(offset));
//		PageResult<SysUser> result = new PageResult<SysUser>();
//		result.addAll(list);
//		return result;

		return MybatisPageHelper.findPage(pageRequest, sysUserMapper, "select", SelectDSLCompleter.allRows());
	}
}
