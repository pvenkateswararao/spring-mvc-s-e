package com.spring.mvc.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.spring.mvc.formater.CardNumberFormatter;
import com.spring.mvc.formater.CurrencyParser;
import com.spring.mvc.formater.PhoneNumberFormater;

@SuppressWarnings("deprecation")
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.spring.mvc")
public class ApplicationBeanConfig extends WebMvcConfigurerAdapter{
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		System.out.println("Web Config call formatter invoked");
		registry.addFormatter(new PhoneNumberFormater());
		registry.addFormatter(new CardNumberFormatter());
		registry.addFormatter(new CurrencyParser());
	}

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewRes = new InternalResourceViewResolver();
		viewRes.setPrefix("/WEB-INF/view/");
		viewRes.setSuffix(".jsp");
		return viewRes;
	}
	
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource rs = new ResourceBundleMessageSource();
		rs.setBasename("validatorMessages");
		return rs;
	}
	
	@Bean
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean local = new LocalValidatorFactoryBean();
		local.setValidationMessageSource(messageSource());
		return local;
	}

	@Override
	public Validator getValidator() {
		return validator();
	}
	
	
	

}
