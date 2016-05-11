<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">    
<title>修改项目信息</title>
<script type="text/javascript" src="/Temp/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript">
	$().ready(function(){
		//获得选中项的部门ID
		var deptid = $("#dpid").val();
		//让下拉列表选中
		$("#dept").val(deptid);
		$("#a").click(function(){
			alert($("#dept").val())
		})

	});
</script>
</head>

<body>
<input type="hidden" id="dpid" value="${project.dept.deptid}"/>
<form action="#" method="post">
	<input name="projid" type="hidden" value="${project.projid}">
	<table width="544" border="1" cellspacing="1" cellpadding="1">
	  <tr>
	    <td width="186">项目名称</td>
	    <td width="345">
	    <input name="pname" type="text" id="pname" value="${project.pname}"></td>
	  </tr>
	  <tr>
	    <td>开始时间</td>
	    <td>
	    <input name="beginDate" type="text" id="beginDate" value="<fmt:formatDate value="${project.beginDate}" pattern="yyyy-MM-dd"/>"></td>
	  </tr>
	  <tr>
	    <td>结束时间</td>
	    <td>
	    <input name="endDate" type="text" id="endDate" value="<fmt:formatDate value="${project.endDate}" pattern="yyyy-MM-dd"/>"></td>
	  </tr>
	  <tr>
	    <td>所属部门</td>
	    <td>
	      	<select name="dept" id="dept">
		        <option value="-1">=请选择=</option>
		      	<c:forEach items="${dlist}" var="d">
		      		<option value="${d.deptid}">${d.dname}</option>
		      	</c:forEach>
		    </select> 
		</td>
	  </tr>
	  <tr>
	    <td colspan="2" align="center">
	    	<input type="submit" value="修改"/>
	    	<input type="button" value="返回" id="a"/>
	    </td>
	  </tr>
	</table>
</form>
<p>使用Jquery完成页面脚本</p>
</body>
</html>