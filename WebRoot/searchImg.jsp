<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for SearchImgForm form</title>
	</head>
	<body>
		<html:form action="/searchImg">
			filepath : <html:text property="filepath"/><html:errors property="filepath"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>

