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

		String url_sucess = arg0.getContextPath() + "/servletjsp/loginSucess.jsp";
		String url_fail = arg0.getContextPath() + "/servletjsp/loginFail.jsp";
		String urlforward_sucess ="servletjsp/loginSucess.jsp";
		String urlforward_fail = "servletjsp/loginFail.jsp";
		if(uname.equals("admin") || upsd.equals("admin")) {
			//重定向
			//arg1.sendRedirect(url_sucess);
			arg0.getRequestDispatcher(urlforward_sucess).forward(arg0, arg1);
		}else {
			//重定向
			//arg1.sendRedirect(url_fail);
			arg0.getRequestDispatcher(urlforward_fail).forward(arg0, arg1);
		}
	}

}
