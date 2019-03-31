package com.briup.app03.config;


import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.briup.app03.interceptor.MyIntercepter;


//拦截器
public class MySpringMVCConfiguration extends WebMvcConfigurationSupport{
	
	@Override
	public void addInterceptors(InterceptorRegistry registry){
		MyIntercepter myIntercepter=new MyIntercepter();
		registry.addInterceptor(myIntercepter).addPathPatterns("/**");
		super.addInterceptors(registry);
	}
}
