package org.ben.handler;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.ben.entity.Student;
import org.ben.entity.User;
import org.ben.service.StudentService;
import org.ben.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value="SSMProject",path="SSMProject")
public class StudentHandler {
	@Autowired //Ĭ���ǰ����������Զ�װ��
	@Qualifier("studentService") //���������Զ�װ��
	private StudentService studentService;
	
	
	@RequestMapping("/testSSM")
	public String testSSM(@RequestParam("stuNo") Integer stuNo ,Map<String,Object> map,Model model) {
		Student student=studentService.queryStudentByNo(stuNo);
		map.put("student", student);
		if(student==null) {
			model.addAttribute("queryd", "�����ڴ���");
			return "answer/queryStudentByNo";
		}
		model.addAttribute("querys", "��ѯ�ɹ�");
		return "answer/querystusuccess";
	}
	
	@RequestMapping("addStudent")
	public String addStudnent(Student student,Model model) {
		if((studentService.queryStudentByNo(student.getStuNo()))==null) {
		studentService.addStudent(student);
		model.addAttribute("add1", "��ӳɹ�");
		return "answer/index2";
		}
		model.addAttribute("add2", "��ӵ�ѧ���Ѵ���");
		return "answer/addStudent";
	}
	
	//������ͼ������̨�Ķ������ݴ���ǰ̨///��Ȼǰ̨�Լ���Ҫ��������
	@RequestMapping("queryAllStudent")
	public ModelAndView queryAllStudent() {
		List<Student> student=studentService.queryAllStudent();
		ModelAndView mav=new ModelAndView("answer/querysuccess");
		//System.out.println(student);
		mav.addObject("student",student);
		return mav;
	}
	
	@RequestMapping("toLogin")
	public String toLogin() {
		return "index/login";
	}
	@RequestMapping(path="toQuery")
	public String toQuery() {
		return "answer/queryStudentByNo";
	}
	
	
	@RequestMapping("toRegiest")
	public String toRegiest() {
		return "needs/regiest";
	}
	@RequestMapping("toAdd")
	public String toAdd() {
		return "answer/addStudent";
	}
	
	@RequestMapping(value="/indexPage" )
	 public String test (HttpServletRequest request,Model model) {
		int sumcount = studentService.getINFCount();  //�õ��ܼ�¼��
		int page = 0; //��ѯ������������� 0�����һ����1�ڶ��� ��һҳ��Ȼʱ�ӵ�һ�����ݿ�ʼ
		int indexnum = 1;      //ҳ��
		int size = 3;         //ÿҳ��ʾ������
		//System.out.println(sumcount);
		//System.out.println(request.getParameter("page"));
		//�����jsp��������������
		if(request.getParameter("page") != null) {
			indexnum = Integer.parseInt(request.getParameter("page")); //ҳ��
			//����˵�ڶ�ҳ   ��ʼ�����ݵ�����Ӧ��Ϊ3   ���ǣ�2-1��*3
			page = (indexnum-1)*size;
		}
		// System.out.println(page);
		Params param=new Params(page,size);
		//���ݸ������ܲ��ᱻ����  ����Ҫ�������ж�һ��
		if(sumcount%size==0) {
			sumcount = sumcount/size;
		}else {
		sumcount=(int)(sumcount/size)+1;
		}
		List<Student> student = studentService.findBlogs(param);     //��ѯ�������û��б�,ʹ��list����
		model.addAttribute("student", student);    //modle�����ݴ����JSP
		model.addAttribute("sum", sumcount);
		model.addAttribute("indexnum", indexnum);
		return "answer/queryAllSuccess";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
