<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String basePath = request.getContextPath();%>
<!DOCTYPE html> 
<html> 
<head> 
  <meta charset="UTF-8"> 
  <title>Title</title> 
  <script type="text/javascript" src="<%=basePath %>/static/js/jquery2.1.4.js"></script>
</head> 
<body> 
  
<form method="post" enctype="multipart/form-data" action="/update/update2">
		Upload File: <input type="file" name="file">
		<br /><br />
		Description: <input type="text" name="desc"/>
		<br/><br/><input type="submit" value="Upload"> 
	</form>
</html> 