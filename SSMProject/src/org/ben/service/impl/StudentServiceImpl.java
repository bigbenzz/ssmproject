package org.ben.service.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.ben.entity.Page;
import org.ben.entity.Params;
import org.ben.entity.Student;
import org.ben.entity.User;
import org.ben.mapper.StudentMapper;
import org.ben.service.StudentService;
import org.springframework.ui.Model;

public class StudentServiceImpl implements StudentService{
	private StudentMapper studentMapper;
	
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	@Override
	public Student queryStudentByNo(int stuNo) {
		return studentMapper.queryStudentByNo(stuNo);
	}

	@Override
	public void addStudent(Student student) {
			studentMapper.addStudent(student);
		
		
		
	}

	@Override
	public List<Student> queryAllStudent() {
		return studentMapper.queryAllStudent();
	}




	@Override
	public void Register(User user) {
		studentMapper.Register(user);
		
	}

	@Override
	public int loginCheck(User user) {
		if(studentMapper.loginCheck(user)>0) {
			return 1; 
		}
		return 0;
	}

	@Override
	public int checkRegiest(String uname) {
		if(studentMapper.checkRegiest(uname)>0) {
			return 0;//×¢²áÊ§°Ü
		}
		return 1;
	}


	@Override
	public int getINFCount() {
		
		return studentMapper.getINFCount();
	}

	@Override
	public List<Student> findBlogs(Params params) {
		List<Student> blog = studentMapper.findBlogs(params);
		return blog;
	}

	

	

	
}
