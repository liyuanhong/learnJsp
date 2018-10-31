package com.jsp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterTwo implements Filter {

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("=======init filte two=======");
	}
	
	@Override
	public void destroy() {
		System.out.println("=======destroy filter two=======");

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		arg2.doFilter(arg0, arg1);
		System.out.println("=======do filte two=======");

	}

}
