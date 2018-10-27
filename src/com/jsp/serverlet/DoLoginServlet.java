package com.jsp.serverlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoLoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String uname = arg0.getParameter("uname");
		String upsd = arg0.getParameter("upsd");
		System.out.println(uname);
		System.out.println(upsd);
		
		String url_sucess = "/j2eeTest/servletjsp/loginSucess.jsp";
		String url_fail = "/j2eeTest/servletjsp/loginFail.jsp";
		if(uname.equals("admin") || upsd.equals("admin")) {
			//重定向
			arg1.sendRedirect(url_sucess);
			System.out.println("sucesss");
		}else {
			//重定向
			arg1.sendRedirect(url_fail);
			System.out.println("fail");
		}
	}

}
