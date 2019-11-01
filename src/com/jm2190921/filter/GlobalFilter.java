package com.jm2190921.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class GlobalFilter implements Filter {

	public GlobalFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(this.getClass().getSimpleName() + " pre-processing");
		chain.doFilter(request, response);
		System.out.println(this.getClass().getSimpleName() + " post-processing");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
