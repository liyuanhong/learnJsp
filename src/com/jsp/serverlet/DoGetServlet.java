package com.jsp.serverlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoGetServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("==========doget===========");
		String uname = req.getParameter("uname");
		String upsd = req.getParameter("upsd");
		
		System.out.println("uname:" + uname);
		System.out.println("upsd:" + upsd);
		
		PrintWriter out = resp.getWriter();
		out.print("==========doget===========\r\n");
		out.print("uname:" + uname + "\r\n");
		out.print("upsd:" + upsd + "\r\n");
		out.flush();
		out.close();
	}

}
