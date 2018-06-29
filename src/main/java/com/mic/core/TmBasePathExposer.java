/**
 * chenPeng
 * com.cp.core
 * TmBasePathExposer.java
 * 创建人:chenpeng
 * 时间：2017年12月10日-下午8:16:54 
 * 2017陈鹏-版权所有
 */
package com.mic.core;


import javax.servlet.ServletContext;

import org.springframework.web.context.ServletContextAware;

/**
 * 拿服务器的根目录
 * TmBasePathExposer
 * 创建人:chenPeng
 * 时间：2017年12月10日-下午8:16:54 
 * @version 1.0.0
 * 
 */
public class TmBasePathExposer implements ServletContextAware{
	private ServletContext servletContext;
	private String basePath;
	public void init(){
		getServletContext().setAttribute("basePath",
				getServletContext().getContextPath());
	}
	public ServletContext getServletContext() {
		return servletContext;
	}
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}
	public String getBasePath() {
		return basePath;
	}
}
