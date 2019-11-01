package com.jm2190921.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/date")
public class DateFilter implements Filter {

	public DateFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(">> " + this.getClass().getSimpleName());
		chain.doFilter(request, response);
		
		request.setAttribute("date", new Date());
		
		
		PrintWriter out = response.getWriter();
		out.print(request.getAttribute("date"));
		System.out.println("<< " + this.getClass().getSimpleName());
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
