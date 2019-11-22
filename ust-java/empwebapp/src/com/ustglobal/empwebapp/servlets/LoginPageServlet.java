package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out= resp.getWriter();
		
		String id ="";
		Cookie[] cookies = req.getCookies();
		if(cookies!=null) {
		for(Cookie cookie :cookies) {
			if(cookie.getName().equals("alwaysRemember")) {
				id=cookie.getValue();
			}
		}
		}
		
		out.println("<html>");
		out.println("<form action='./login' method ='post'>");
		out.println("<table>");
		out.println("<tr>");
		out.println(" <td>id : </td>");
		out.println(" <td><input name ='id' type='number' value ='"+id+"'></td>");
		out.println(" </tr>");
		out.println(" <tr> ");
		out.println(" <td>Password :</td>");
		out.println(" <td><input name ='password' type='password'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><input type ='checkbox' name ='rememberme' value='checked'>Remember me</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><input type ='submit' value ='login'> </td>");
		out.println("</tr>");
		out.println(" </table>");
		out.println("  </form>");
		out.println(" <a href='register.html' style ='float:center'>Register</a>");
		
		out.println("</html>");
		
	}//end of doGet
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
	
}//end of claass
