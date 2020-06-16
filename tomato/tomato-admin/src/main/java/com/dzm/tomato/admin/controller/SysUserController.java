package com.dzm.tomato.admin.controller;

import com.dzm.tomato.core.http.HttpResult;
import com.dzm.tomato.core.page.PageRequest;
import com.dzm.tomato.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dzm.tomato.admin.serviceImpl.SysUserServiceImpl;

@RestController
@RequestMapping("user")
public class SysUserController {
	
	@Autowired
	private SysUserServiceImpl sysUserServiceImpl;
	
	@GetMapping(value="/findAll")
	public Object findAll() {
		return sysUserServiceImpl.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Object findById(@PathVariable long id) {
		return sysUserServiceImpl.findById(id);
	}

	@GetMapping(value="page/{pageNumber}/{pageSize}")
	public Object findPage(@PathVariable int pageNumber, @PathVariable int pageSize){
		PageRequest pageRequest = new PageRequest(pageNumber, pageSize);
		PageResult pageResult = sysUserServiceImpl.findPage(pageRequest);
//		return HttpResult.ok(pageRequest);
		return pageResult;
	}
}
