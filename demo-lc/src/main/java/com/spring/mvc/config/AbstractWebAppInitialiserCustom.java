package com.spring.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AbstractWebAppInitialiserCustom extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{ApplicationBeanConfig.class};
		
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		System.out.println("My Abstract class working");
		return new Class<?>[]{ApplicationBeanConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		String arr[] = {"/home/*"};
		return arr;
	}

}
