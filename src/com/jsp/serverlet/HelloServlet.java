package com.jsp.serverlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("======init=======");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("======init with parameters======");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		//super.service(arg0, arg1);
		System.out.println("======service======");
		PrintWriter pw = arg1.getWriter();
		pw.println("hello world !");
		pw.flush();
		pw.close();
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("======destroy======");
	}

	
	
}
