package com.filter.servletfilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ServletFilter implements Filter {
	private final Logger logger = LoggerFactory.getLogger(ServletFilter.class);

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String key = req.getParameter("key");
		logger.info(key);
		if(key == null) {
			res.sendRedirect("/keyError");
			chain.doFilter(request, response);
		} else if(!key.equals("ABCD123")) {
			res.sendRedirect("/error");
			chain.doFilter(request, response);
		} else {
			chain.doFilter(request, response);
		}
	}

}
