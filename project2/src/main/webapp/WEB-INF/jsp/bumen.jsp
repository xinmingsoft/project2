<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String basePath = request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=basePath %>/static/js/jquery2.1.4.js"></script>
<script type="text/javascript" src="<%=basePath %>/static/js/bumen/bumen.js"></script>
</head>
<body>
	<input id="add_show" type="button" value="添加"/>
	<h3>部门列表</h3>
	<table id="bumen_list_container" width="100%">
		<tr>
			<td>部门编号</td>
			<td>部门名称</td>
			<td>部门职务</td>
			<td colspan="2">操作</td>
		</tr>
	</table>
	
	<div id="add" style="display:none;">
		部门名称<input type="text" id="bmmc" /><br />
		部门职务<select id="bmzw"><option>请选择</option></select><br />
		<input id="add_bumen" type="button" value="确定"/>
	</div>
	
	<div id="edit" style="display:none;">
		部门名称<input type="text" id="bmmc" /><br />
		部门职务<select id="bmzw"><option>请选择</option></select><br />
		<input id="add_edit" type="button" value="确定"/>
	</div>
	
	<input id="multi_show" type="button" value="多表查询"/>
	<table id="multi_table">
		<tr>
			<td>部门编号</td>
			<td>部门名称</td>
			<td>部门职务</td>
			<td>职务名称</td>
		</tr>
	</table>
</body>
</html>