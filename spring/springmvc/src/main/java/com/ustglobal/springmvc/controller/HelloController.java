package com.ustglobal.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.management.AttributeValueExp;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ustglobal.springmvc.beans.Employee;

@Controller
public class HelloController {
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}
	
	
	@RequestMapping(path="/hello")
  public String hello( @RequestParam("name") String name,
		                @RequestParam("id") int id,
		                ModelMap map) {
	  map.addAttribute("msg","Hi babe");
	  map.addAttribute("name" ,name);
	  map.addAttribute("id",id);
	  
	  return "index";
  }
	
	@RequestMapping(path="/hi/{name}/{id}")
	  public String hi(@PathVariable("name") String name,
			           @PathVariable("id") String id,
			          HttpServletRequest request) {
		  request.setAttribute("msg","Hi acchu");
		  request.setAttribute("name",name);
		  request.setAttribute("id",id);
		  
		  return "index";
	  }
	
	@RequestMapping(path="/form")
	public String formPage() {
		return "form";
	}
	
	@RequestMapping(path="/form" ,method=RequestMethod.POST)
	public String form(Employee emp,
			            ModelMap map) {
		
		map.addAttribute("id",emp.getId());
		map.addAttribute("name",emp.getName());
		map.addAttribute("password",emp.getName());
		map.addAttribute("gender",emp.getGender());
		map.addAttribute("doj",emp.getDoj());
	
		return "formoutput";
	}

	@RequestMapping(path="/create-cookie")
	public String createCookie(ModelMap map,HttpServletResponse response) {
		Cookie cookie = new Cookie("name","Ashwini");
		response.addCookie(cookie);
		return "createcookie";

		
	}
	@RequestMapping(path="/read-cookie")
	public String readCookie(@CookieValue(name="name",required=false) String name,ModelMap map) {
		map.addAttribute("name", name);
		return "readcookie";
	}
	@RequestMapping(path="/redirect")
	public String redirect() {
		return "redirect:./hi/Kavi/1";
	}

	@RequestMapping(path="/forward")
	public String forward() {
		return "forward:./hi/Kavi/1";
	}
	
}
