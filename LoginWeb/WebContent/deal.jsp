<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%
request.setCharacterEncoding("GB18030");
String username=request.getParameter("username");
String pwd=request.getParameter("pwd");
if("caimeng".equals(username) && "admin907".equals(pwd)){
	response.sendRedirect("cindex.jsp");
	out.print("<script language='javascript'>alert('��¼�ɹ���');window.location.href='index.jsp';</script>");
}else{
	response.sendRedirect("error.jsp");
}
%>
