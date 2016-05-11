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
<title>项目列表</title>
<script type="text/javascript">
	function changePage(pagenum){
		document.getElementById("pagenum").value = pagenum;
		document.searchForm.submit();
	}

</script>
</head>

<body>
<form name="searchForm" method="post" action="/Temp/projects.action">
<input type="hidden" name="pagenum" id="pagenum"/>
<table width="800" >
  <tr>
    <td width="240">
    	项目ID:<input type="text" name="projid" id="projid" value="${svo.projid}">
    </td>
    <td width="260">
    	项目名称:<input type="text" name="pname" id="pname" value="${svo.pname}">
    </td>
  </tr>
  <tr>
    <td colspan="2">
    	研发时间:<input type="date" name="beginDate" id="beginDate" value="<fmt:formatDate value="${svo.beginDate}" pattern="yyyy-MM-dd"/>">
    	-
    	<input type="date" name="endDate" id="endDate" value="<fmt:formatDate value="${svo.endDate}" pattern="yyyy-MM-dd"/>">
    </td>
    <td>
    	<input type="submit" value="查询"/>
    </td>
  </tr>
</table>
</form>
<hr>
<table width="100%" border="1" cellpadding="1" cellspacing="1">
	<tr>
    	<td>项目ID</td>
        <td>项目名称</td>
        <td>开始日期</td>
        <td>结束日期</td>
        <td>状态</td>
        <td>所属部门</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${plist}" var="p">
    	<tr>
	    	<td>${p.projid }</td>
	        <td>${p.pname }</td>
	        <td>
	        	<fmt:formatDate value="${p.beginDate}" pattern="yyyy-MM-dd"/>
	        </td>
	        <td>
	        	<fmt:formatDate value="${p.endDate}" pattern="yyyy-MM-dd"/>
	        </td>
	        <td>
	        	${p.iflag}
	        </td>
	        <td>${p.dept.dname }</td>
	        <td>
	        	<a href="#">详细</a>
	        	<a href="/Temp/entryUpdateProject.action?projid=${p.projid}">修改</a>
	        	<c:choose>
	        		<c:when test="${p.iflag == 0}">
	        			<a href="/Temp/updateProjectFlag.action?projid=${p.projid}&iflag=1">删除</a>
	        		</c:when>
	        		<c:otherwise>
	        			<a href="/Temp/updateProjectFlag.action?projid=${p.projid}&iflag=0">恢复</a>
	        		</c:otherwise>
	        	</c:choose>
	        </td>
	    </tr>
    </c:forEach>
</table>
<hr/>
<div style="text-align:center">
	<a href="javascript:changePage(1)">&lt;&lt;</a>
	<a href="javascript:changePage(${svo.pagenum - 1})">&lt;</a>
	${svo.pagenum}
	<a href="javascript:changePage(${svo.pagenum + 1})">&gt;</a>
	<a href="javascript:changePage(${svo.maxpage})">&gt;&gt;</a>
	&nbsp;
	共 ${svo.totalCount} 条记录
</div>	
</body>
</html>
