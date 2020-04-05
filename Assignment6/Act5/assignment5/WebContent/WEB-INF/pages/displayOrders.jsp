<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
function displayUser(){
	var x = 0;
	var y = 0;
	var table = document.getElementVyId("orders");
	for(var order of orders){
		var row = table.insertRow(-1);
		row.setAttribute("align","center");
		var cell1 = row.insertCell();
		var cell2 = row.insertCell();
		var cell3 = row.insertCell();
		var cell4 = row.insertCell();
		row.id = x;
		cell1.id = x + "_" + y++;
		cell2.id = x + "_" + y++;
		cell3.id = x + "_" + y++;
		cell4.id = x + "_" + y++;
		cell1.innerHTML = order.orderNoo;
		cell2.innerHTML = order.productName;
		cell3.innerHTML = order.price;
		cell4.innerHTML = order.quantity;
		row.style.backgroundColor = x&1?"#FFFFFFF":"#F0F0F0";
		
		++x;
		y=0;
		
	
	}
		
		
	
	
	
};



function getOrders(){
	$.ajax(){
		type:"GET",
		url:"/assignment6/service1/orders",
		dataType:"json",
		succes: function(data){
			displayOrders(data);
		},
		error:function (xhr,ajaxOption,thrownError){
			alert(xhr.status);
			alert(thrownError);
		}
		
		
	}
	
	
};

$document).ready(getOrders);



</script>
</head>
<body>
<table width=50%, border=1, id=users>
<thead width=25%>
<tr>
	<th>Order Number</th>
	<th>Product Name</th>
	<th>Price</th>
	<th>Quantity</th>
</tr>

</thead>
<tbody>


</tbody>




</table>
</body>
</html>