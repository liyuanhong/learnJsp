package com.jsp.serverlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.db.UserModel;

public class CheckLoginServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String username = arg0.getParameter("uname");
		String password = arg0.getParameter("upsd");
		
		UserModel userdb = new UserModel();
		
		String urlforward_sucess ="servletjsp/loginSucess.jsp";
		String urlforward_fail = "servletjsp/loginFail.jsp";
		boolean loginStatus = userdb.getLoginStatus(username, password);
		if(loginStatus) {
			//转发到登录成功页面
			arg0.getRequestDispatcher(urlforward_sucess).forward(arg0, arg1);
		}else {
			//转发到登录失败页面
			arg0.getRequestDispatcher(urlforward_fail).forward(arg0, arg1);
		}
	}
	
}
