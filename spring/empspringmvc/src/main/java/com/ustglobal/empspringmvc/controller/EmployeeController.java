package com.ustglobal.empspringmvc.controller;

import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.empspringmvc.dto.EmployeeBean;
import com.ustglobal.empspringmvc.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired 
	private EmployeeService service;
	
	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor= new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class,editor);
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	@PostMapping("/login")
	public String login(int id,String password, HttpServletRequest request) {
		EmployeeBean bean=service.login(id, password);
		if(bean==null) {
			request.setAttribute("msg", "invalid Credentials");
		    return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}//end of login
	
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}

	@PostMapping("/register")
	public String register(EmployeeBean bean ,ModelMap map) {
	int check=	service.register(bean);
		if(check>0) {
			map.addAttribute("msg", "you are Registerd for this id:"+check);
			
		}else {
			map.addAttribute("msg","email is repeated");
			
		}
		return "login";
	}//end of register
	
     public String home(ModelMap map,@SessionAttribute(name="bean",required=false) EmployeeBean bean) {
    	 
             	 if(bean==null) {
             		 map.addAttribute("msg","Login first");
             		 return "login";
             	 }else {
             		 return "home";
             	 }
    	  }
     @PostMapping("/home")
	public String home() {
		return "home";
	}
     
     @GetMapping("/search") 
     public String search(@RequestParam("id") int id,ModelMap map) {
    	 EmployeeBean bean = service.searchEmployee(id);
    	 if(bean==null) {
    		 map.addAttribute("msg", "Data not found");
    	 }else {
    		 map.addAttribute("bean",bean);
    		}
    	 return "home";
     }
     @GetMapping("/logout")
     public String logout(HttpSession session) {
    	 session.invalidate();
    	 return "login";
     }
     @GetMapping("./delete")
     public String delete(HttpSession session) {
    	EmployeeBean bean =(EmployeeBean)session.getAttribute("bean");
    	try {
    		service.deleteEmployee(bean.getId());
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	 session.invalidate();
    	 return "login";
     }//end of delete
     
     @GetMapping("/changepassword")
     public String changepassword(HttpServletRequest request) {
    	 HttpSession session =request.getSession(false);
    	 if(session!=null) {
    	 return "changepassword";
    	 }else {
    		 return "login";
    	 }
     }//end of cp
     
     @PostMapping("/changepassword")
     public String changepassword(String password,String confirmpassword,
    		 @SessionAttribute(name="bean")EmployeeBean bean,ModelMap map) {
    	if(password.equals(confirmpassword)) {
    		service.changePassword(bean.getId(), password);
    		map.addAttribute("msg","password changed");
    	}else {
    		map.addAttribute("msg","password not matching");	
    	}
    	 return "home";
     }
     
     @GetMapping("/update")
 	public String update(HttpServletRequest request) {
    	 HttpSession session =request.getSession(false);
    	 if(session!=null) {
    	 return "update";
    	 }else {
    		 return "login";
    	 }
    	 
 	}
     @PostMapping("/update")
 	public String update( String name,String email,String password,
 			Date doj,String gender,
 			@SessionAttribute(name="bean")EmployeeBean bean ,
 			ModelMap map) {
 	            bean.setName(name);
 	            bean.setEmail(email);
 	            bean.setPassword(password);
 	            bean.setDoj(doj);
 	            bean.setGender(gender);
    	 
    	 
    	 boolean check=service.updateEmployee(bean);
 		if(check) {
 			map.addAttribute("msg", "details updated");
 			
 		}else {
 			map.addAttribute("msg","not repeated");
 			
 		}
 		return "login";
 	}//end of register
     
     
}//end of controller
