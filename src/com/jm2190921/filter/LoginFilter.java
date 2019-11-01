package com.jm2190921.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = { "/login", "/login-to-profile" })
public class LoginFilter implements Filter {

	List<String> bloackedUsers = new ArrayList<>();

	public LoginFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(">> " + this.getClass().getSimpleName());
		String un = request.getParameter("username");
		if (un != null && bloackedUsers.contains(un)) {
			PrintWriter out = response.getWriter();
			out.print("You are blocked");
		} else {
			chain.doFilter(request, response);
		}
		System.out.println("<< " + this.getClass().getSimpleName());
	}

	public void init(FilterConfig fConfig) throws ServletException {
		bloackedUsers.add("warner");
		bloackedUsers.add("smith");
		bloackedUsers.add("shakib");
	}

}
