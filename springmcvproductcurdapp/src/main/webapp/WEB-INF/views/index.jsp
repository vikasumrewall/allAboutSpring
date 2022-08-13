<html>
<head>
<%@ include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">This is home page</h1>


<table class="table">
  <thead class="thead-light">
    <tr>
      <th scope="col">#</th>
      <th scope="col">Name</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
        <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
     <c:forEach items="${productLst}" var="p">
    <tr>
      <th scope="col">${p.id}</th>
      <th scope="col">${p.name}</th>
      <th scope="col">${p.description}</th>
      <th scope="col">${p.price}</th>
      <td >
      <a  href="delete/${p.id}"><i class="fas fa-backspace text-danger"></i> </a>
         <a  href="update-product/${p.id}"><i class="fas fa-pen-nib text-primary"></i> </a>
      </td>
    </tr>
    </c:forEach>
  </tbody>
</table>
<div class="text-center">

<div class="container text-center">
  <a href="add-product">Add Product</a>
  </div>
  
</div>

			</div>
		</div>
	</div>
</body>
</html>
