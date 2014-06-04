<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script language="javascript" type="text/javascript">

function onSubmit()
{

var temp = document.getElementsByName("result1");
var result = "";
var i;
for(i=0;i<temp.length;i++){
result+=temp[i].id;
result+="@";
result+=temp[i].value;
result+="$";
}

document.getElementById("result").value = result;

document.getElementById("f").submit();
}
function OnclickLink()
    {
     alert("您点击了这个按钮");
    }

</script>



</head>



<body>
	<h1>查询结果</h1>


	<form id="f" action="getResult.do" method="post">
		<input type="hidden" id="result" name="result" value="jaj" /> 
		<input type="hidden" id="moduleId" name="moduleId" value="${moduleId}" />
		<table border=1>
			<tr>
				<th>input</th>
				<th>${moduleId}</th>
			</tr>
			<c:forEach var="book" items="${inputlist}">
				<tr>
					<td>${book.input}</td>
					<td><input type="text" id="${book.input}" name="result1">
					</td>
				</tr>
			</c:forEach>
		</table>
		<input type="button" value="Submit" onClick="javascript:onSubmit()" />
	</form>
</body>
</html>
