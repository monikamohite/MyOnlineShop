<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="row">
	<div class="col-md-offset-2 col-md-8">
	<div class="panel panel-primary">
	
	<div class="panel-heading">
	<h4>Product Management</h4>
	</div>
	<div class="panel-body">
	
<form class="form-horizontal" enctype="multipart/form-data" method="post">
<div class="form-group">
<label class="control-label col-md-4" for="name">Enter Product Name</label>
<div class="col-md-8">
<input type="text" name="name" id="name" placeholder="product Name" class="form-control"/>
</div>
</div>


<div class="form-group">
<label class="control-label col-md-4" for="brand">Enter Brand Name</label>
<div class="col-md-8">
<input type="text" name="brand" id="brand" placeholder="Brand Name" class="form-control"/>
</div>
</div>

<div class="form-group"> 
<label class="control-label col-md-4" for="description">Enter Description</label>
<div col-md-8>
<input type="text" name="description" id="description" placeholder="description" class="form-control">
</div>
</div>

<div class="form-group">
<label class="control-label col-md-4" for="unitPrice">Enter Unit Price</label>
<div class="col-md-8">
<input type="text" name="unitPrice" id="unitPrice" placeholder="Enter Unit Price" class="form-controller"/>
</div>
</div>

<div class="form-group">
	<label class="control-label col-md-4" for="quantity">Enter Quantity</label>
	<div class="col-md-8">
	<input type="text" path="quantity" id="quantity" placeholder="Enter Quantity" class="form-control"/>
	<em class="help-block">Please enter Quantity !</em>
	</div>
</div>

<div class="form-group">
<label class="control-label col-md-4" for="CategoryId">Select Category</labe>
<div class="col-md-8">
<select class="form-control" id="categoryId" name="categoryId">
<option value="1">category one</option>
<option value="2">category two</option>
</select>
</div>
</div>

<!-- file Element -->
<div class="form-group">
<div class="col-md-offset-4 col-md-8">
<input type="submit" name="submit" id="submit" class="btn btn-primary" />
</div>
</div>
</form>
	</div>
	</div>
	</div>
	</div>
</div>

</body>
</html>