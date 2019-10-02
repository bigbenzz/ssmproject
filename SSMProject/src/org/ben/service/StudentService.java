package org.ben.service;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.ben.entity.Params;
import org.ben.entity.Student;
import org.ben.entity.User;
import org.springframework.ui.Model;

public interface StudentService {
	 Student queryStudentByNo(int stuNo);
	 void addStudent(Student student);
	 List<Student> queryAllStudent();
	 int loginCheck(User user);
	 void Register(User user);
	 int checkRegiest(String uname);
	 int getINFCount();
	 List<Student> findBlogs(Params param);
	 
	 
	 
	 
	// void selectINFPage(HttpServletRequest request,Model model) throws Exception;
}

