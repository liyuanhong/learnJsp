package com.jsp.serverlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("init");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String uname = arg0.getParameter("uname");
		String upsd = arg0.getParameter("upsd");
		
		System.out.println("uname:" + uname);
		System.out.println("upsd:" + upsd);
		
		PrintWriter out = arg1.getWriter();
		out.print("uname:" + uname + "\r\n");
		out.print("upsd:" + upsd + "\r\n");
		out.flush();
		out.close();
	}

}
