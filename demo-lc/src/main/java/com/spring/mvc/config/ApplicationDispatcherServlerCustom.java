/**
 * 
 */
package com.spring.mvc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author Sai
 *
 */
//implements  WebApplicationInitializer
public class ApplicationDispatcherServlerCustom  {

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();
		//webAppContext.setConfigLocation("classpath:front-controller-servlet.xml");
		webAppContext.register(ApplicationBeanConfig.class);
		DispatcherServlet myDispatcherServlet = new DispatcherServlet(webAppContext);
		System.out.println("Servlet class invokes");
		ServletRegistration.Dynamic dy = servletContext.addServlet("myDispatcherServlet", myDispatcherServlet);
		dy.addMapping("/home.com/*");
		dy.setLoadOnStartup(1);
	}

}
