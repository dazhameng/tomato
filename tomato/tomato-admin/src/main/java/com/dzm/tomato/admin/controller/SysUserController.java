package com.dzm.tomato.admin.controller;

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
	
	@GetMapping(value="/findById/{id}")
	public Object findByID(@PathVariable long id) {
		return sysUserServiceImpl.findById(id);
	}
}
