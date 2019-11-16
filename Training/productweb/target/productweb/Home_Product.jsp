<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Home</title>
</head>
<body>
<%String status = (String)request.getAttribute("Status"); 
if(status != null) { %> <%=status%> <%}%>
<br>
<br>
<br>
<a href="Add_Product.jsp" id="Add Product" >Add Product</a>&nbsp;
<a href="Display_Product.jsp" id="Display Product">Display Product</a>
</body>
</html>