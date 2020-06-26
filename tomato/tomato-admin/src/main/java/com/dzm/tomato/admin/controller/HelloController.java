package com.dzm.tomato.admin.controller;

import cn.hutool.core.util.StrUtil;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value="/hello")
	public String hello() {
		return "Hello Tomato";
	}

	@GetMapping(value="/hello/{name}")
	public String helloName(@PathVariable String name){
		String template = "Hello {}!";
		return StrUtil.format(template, name);
	}

	@GetMapping(value="/test")
	@PreAuthorize("hasAuthority('sys:test:view')")
	public String test(){
		return "test";
	}

}
