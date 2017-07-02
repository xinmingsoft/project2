$(function(){
	getData();
	
	
	$("#add_show").click(function(){
		$("#add").show("slow");
		$.ajax({
			type : "GET",
			url :"/zhiwu/searchAllZhiwu",
			dataType:"JSON",  
			data: {},
			success : function(data) {
				console.log(data);
				$("#bmzw>option:gt(0)").remove();
				$.each(data,function(index,item){
					$("#bmzw").append("<option value='"+item.zhiwuid+"'>"+item.zhiwumc+"</option>");
				});
				
			},
			error:function(XMLHttpRequest, textStatus, errorThrown){
				alert("查询失败，请联系管理员");
			}
		});
	});
	
	
	$("#add_bumen").click(function(){
		var a = $("#bmmc").val();
		var b = $("#bmzw").val();
		//console.log(a+"----"+b);
		var c = {  
				bumenmc: a,
				bumenzw: b  
				}; 
		//console.log(c);
		$.ajax({
			type : "POST",
			url :"/bumen/addBumen",
			dataType:"JSON",  
			contentType: "application/json;charset=utf-8",
			data: JSON.stringify(c),
			success : function(data) {
				if(data == "1")
				{
					getData();
					$("#bmmc").val("");
					$("#bmzw").val("");
					$("#add").hide("slow");
				}
				else
					alert("添加失败");
				return false;
			},
			error:function(XMLHttpRequest, textStatus, errorThrown){
				alert("查询失败，请联系管理员");
			}
		});
	});
	
	
	$("#multi_show").click(function(){
		$.ajax({
			type : "POST",
			url :"/bumen/getData",
			dataType:"JSON",
			data: {},
			success : function(data) {
				$("#multi_table tr:gt(0)").remove();
				
				//console.log(data);
				$.each(data,function(index,item){
					var tr = $("<tr></tr>");
					tr.append("<td>"+item.id+"</td>");
					tr.append("<td>"+item.bumenmc+"</td>");
					tr.append("<td>"+item.bumenzw+"</td>");
					tr.append("<td>"+item.zhiwumc+"</td>");
					$("#multi_table").append(tr);
				});
				return false;
			},
			error:function(XMLHttpRequest, textStatus, errorThrown){
				alert("查询失败，请联系管理员");
			}
		});
	});
});

function getData()
{
	$.ajax({
		type : "GET",
		url :"/bumen/searchAllBumen",
		dataType:"JSON",  
		data: {},
		success : function(data) {
			//console.log(data);
			$("#bumen_list_container tr:gt(0)").remove();
			$.each(data,function(index,item){
				var tr = $("<tr></tr>");
				tr.append("<td>"+item.id+"</td>");
				tr.append("<td>"+item.bumenmc+"</td>");
				tr.append("<td>"+item.bumenzw+"</td>");
				tr.append("<td><a href='#' onclick='edit("+item.id+");'>修改</a></td>");
				tr.append("<td><a href='#' onclick='del("+item.id+")'>删除</a></td>");
				$("#bumen_list_container").append(tr);
			});
		},
		error:function(XMLHttpRequest, textStatus, errorThrown){
			alert("查询失败，请联系管理员");
		}
	});
}

function edit(id){
	alert(id);
}

function del(id){
	alert(id);
}
