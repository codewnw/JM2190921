package com.jm2190921.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyRequestAttributeListener implements ServletRequestAttributeListener {

	public MyRequestAttributeListener() {
	}

	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("REMOVED: " + srae.getName() + " " + srae.getValue());
	}

	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("ADDED: " + srae.getName() + " " + srae.getValue());
	}

	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println("REPLACED: " + srae.getName() + " " + srae.getValue());
	}

}
