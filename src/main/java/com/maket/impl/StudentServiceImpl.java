package com.maket.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maket.mapper.StudentMapper;
import com.maket.service.IStudentService;
import com.maket.vo.ResponseEntity;
import com.maket.vo.Student;
@Service("studentServiceImpl")
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public ResponseEntity getStuList() {
		List<Student> stuList = studentMapper.getStuList();
		return ResponseEntity.ok(stuList);
	}

}
