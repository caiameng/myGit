package com.lyq.bean;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class CharactorEncoding
 */
@WebFilter("/CharactorEncoding")
public class CharactorEncoding implements Filter {

    /**
     * Default constructor. 
     */
    public CharactorEncoding() {
        // TODO Auto-generated constructor stub
    }
    public String toString(String str){
    	String text="";
    	if(str !=null&&!"".equals(str)){
    		try{
    			text =new String(str.getBytes("ISO-8859-1"),"UTF-8");
    		}catch(UnsupportedEncodingException e){
    			e.printStackTrace();
    		}
    	}
    	return text;
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
