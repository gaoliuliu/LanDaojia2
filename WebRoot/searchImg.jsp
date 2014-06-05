<%@ page language="java" import="java.util.*,edu.fudan.util.*"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%> 
<html> 
	<head>
		<title>JSP for SearchImgForm form</title>
	</head>
	<body>
		上传成功！
		${transResult}<a href="<%=path %>/queryModule.jsp" >返回首页</a>
	</body>
</html>

