package com.filter.configuration;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.filter.servletfilter.ServletFilter;

@Configuration
public class FIlterConfiguration {
	@Bean
	public FilterRegistrationBean<ServletFilter> filterRgistrationBean() {
		FilterRegistrationBean<ServletFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new ServletFilter());
		registrationBean.addUrlPatterns("/get/all");
		return registrationBean;
	}
}
