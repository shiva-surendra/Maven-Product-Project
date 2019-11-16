<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Product</title>
</head>
<body>
<a href="Add_Product.jsp" id="Add Product" >Add Product</a>&nbsp;
<a href="Display_Product.jsp" id="Display Product">Display Product</a>

<form method="post" action="CreateProductServlet">
<h3>Enter product details</h3>
Product Id: <input name="id"> </input><br>
Product Name: <input name="name"> </input><br>
Product Desc: <input name="description"> </input><br>
Product Price: <input name="price"> </input><br>
<input type="submit" value="submit">
</form>

</body>
</html>