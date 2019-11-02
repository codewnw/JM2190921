package com.jm2190921.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextLifecylceListener implements ServletContextListener {

	public MyServletContextLifecylceListener() {
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Application is going down...");
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Application is coming up...");
	}

}
