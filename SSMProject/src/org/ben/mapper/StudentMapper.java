package org.ben.mapper;

import java.util.HashMap;
import java.util.List;
import org.ben.entity.Params;
import org.apache.ibatis.annotations.Param;
import org.ben.entity.Page;
import org.ben.entity.Student;
import org.ben.entity.User;

public interface StudentMapper {
	Student queryStudentByNo(int stuNo);
	public void addStudent(Student student);
	List<Student> queryAllStudent();
	int loginCheck(User user);
	void Register(User user);
	int checkRegiest(String uname);
	int getINFCount();
	//List<Student> selectINFPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize) throws Exception;
	List<Student> findBlogs(Params param);
	
	
	
	
	
	
	
}
