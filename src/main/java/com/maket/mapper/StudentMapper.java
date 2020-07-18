package com.maket.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.maket.vo.Student;

@Mapper
public interface StudentMapper {
	public List<Student> getStuList();
}
