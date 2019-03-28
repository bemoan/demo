package com.xry.demo.filter;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 自定义Filter
 * 1.实现 Filter 接口，实现 Filter 方法
 * 2.添加@Configuration 注解，将自定义Filter加入过滤链
 */
@Configuration
public class WebConfiguration {
    @Bean
    public RemoteIpFilter remoteIpFilter(){
        return  new RemoteIpFilter();
    }
    @Bean
    public FilterRegistrationBean testFilterRegistration(){
       FilterRegistrationBean registration=new FilterRegistrationBean();
        registration.setFilter(new MyFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("MyFilter");
        registration.setOrder(1);
        return registration;
    }
    public  class  MyFilter implements Filter{
        @Override
        public void destroy() {

        }

        @Override
        public void init(FilterConfig filterConfig) throws ServletException {

        }

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            HttpServletRequest request = (HttpServletRequest) servletRequest;
            System.out.println("this is MyFilter,url :"+request.getRequestURI());
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}