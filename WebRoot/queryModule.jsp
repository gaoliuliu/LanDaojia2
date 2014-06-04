<%@ page language="java" import="java.util.*,edu.fudan.util.*"
	pageEncoding="utf-8"%>

<jsp:useBean id="gi" class="edu.fudan.util.GetBGImg" scope="session" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String result = gi.getBingImg();
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>懒到家</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


<style type="text/css">
body {
	background-color: black;
	background-image: url(<%=result%>);
	background-repeat: no-repeat;
	background-position: center;
}

#form {
	position: absolute;
	top: 250px;
	left: 250px;
}

#input {
	height: 30px;
	width: 300px;
	font-size: 120%;
	vertical-align: middle;
}

#submit {
	height: 30px;
	width: 30px;
	vertical-align: middle;
}

#logo {
	position: absolute;
	left: 50px;
}

#uploadform {
	position: absolute;
	top: 250px;
	left: 250px;
	z-index: 8;
	display: none;
	height: 30px;
	width: 300px;
	vertical-align: middle;
	
}

.file {
	height: 30px;
	width: 350px;
	vertical-align: middle;
}

#sttb {
	position: absolute;
	right: 37px;
	top: 10px;
	_top: 10px;
	display: block;
	width: 22px;
	outline: 0;
	height: 17px;
	line-height: 10em;
	z-index: 1;
	overflow: hidden;
	background: url(camera.png)
		no-repeat -25px 0;
}
</style>
<script src="jquery-1.11.1.min.js">
</script>
<script type="text/javascript">
function stopPropagation(e) {
      if (e.stopPropagation) 
              e.stopPropagation();
      else 
          e.cancelBubble = true;
}


$(document).ready(function(){
  $("p").click(function(){
    $(this).hide();
  });
   $("a#sttb").click(function(e){
    $("div#uploadform").show();
    $("div#form").hide();
     stopPropagation(e);
  });
     $("div#uploadform").click(function(e){
    $("div#uploadform").show();
    $("div#form").hide();
     stopPropagation(e);
  });
   $("body").click(function(e){
    $("div#uploadform").hide();
    $("div#form").show();
   
  });
  
});

function uploadfile()
{
   
   
}

</script>
</head>
<body>
	<img id="logo" src="logo_min.png">
	<div id="form">
		<form action="queryModule.do" method="post">
			<input id="input" type="text" name="queryId" /> <input id="submit"
				type="image" src="sousuo.jpg" value="" onClick="submit();" />


		</form>
		<a class="sttb" id="sttb" title="上传图片，搜索相关信息">stu</a>

	</div>
	<div id="uploadform">
		<form action="searchImg.do" method="post" encType="multipart/form-data">
			<input class="file" type="file" name="filepath" id="stfile" size="1">
			<input id="uploadtijiao" type="submit" value="查图片"
				onClick="uploadfile();" />
		</form>
	</div>
</body>
</html>

