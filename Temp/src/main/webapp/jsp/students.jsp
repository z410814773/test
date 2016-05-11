<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>My JSP 'students.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
	<table width="600">
		<tr>
			<td>学号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>生日</td>
			<td>操作</td>
		</tr>
	    <c:forEach items="${slist}" var="student">
	    	<tr>
		   		<td>${student.stuid}</td>
				<td>${student.sname}</td>
				<td>
					${student.sex}
				</td>
				<td><fmt:formatDate value="${student.birthday}" pattern="yyyy-MM-dd"/></td>
				<td>操作</td>
			</tr>
	    </c:forEach>
    </table>
  </body>
</html>

















