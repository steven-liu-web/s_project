package com.maket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maket.service.IStudentService;
import com.maket.vo.ResponseEntity;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private IStudentService studentServiceImpl;
	
	@GetMapping("/getStuList")
	public ResponseEntity getStuList() {
		return studentServiceImpl.getStuList();
	}
}
