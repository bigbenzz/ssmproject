package org.ben.handler;

import javax.servlet.http.HttpServletRequest;

import org.ben.entity.User;
import org.ben.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="UserProject",path="UserProject")
public class UserHandler {
	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;  
	
	
	@RequestMapping(path="Login")
	public String Login(@RequestParam("uname") String uname,@RequestParam("upwd") String upwd,Model model) {
		User user=new User();
		user.setUname(uname);
		user.setUpwd(upwd);
		int an=studentService.loginCheck(user);
		if(an==1) {
			//model.addAttribute("INF", "��½�ɹ�");
			return "answer/index";
		}else 
			model.addAttribute("INF","�û�������������");	
			//model.addAttribute("an", an);
			return "index/login";		
	}
	@RequestMapping(path="Regiest")
	public String Regiest(@RequestParam("uname") String uname,@RequestParam("upwd") String upwd,Model model) {
		User user=new User();
		user.setUname(uname);
		user.setUpwd(upwd);
		if(studentService.checkRegiest(uname)==1&&uname!=""&&upwd!=null) {
		studentService.Register(user);
		model.addAttribute("INFP1", "ע��ɹ���");
		return "index/login";
		}else if(uname==""||upwd==""||user==null) {
			model.addAttribute("INFP2", "�û��������벻��Ϊ��");
			return "needs/regiest";
		}
		model.addAttribute("INFP3", "���û����ѱ�ʹ�û���Ϣ����Ϊ��");
		return "needs/regiest";
	}
	
	
		
	
}
