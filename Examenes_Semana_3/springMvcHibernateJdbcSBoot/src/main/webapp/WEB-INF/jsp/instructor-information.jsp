<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<title>List Customers</title>

<!-- reference our style sheet -->

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager Remasterizado</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">
			<div class="tarjeta" >
				<div class="titulo"><p>${instructor.instructorName}</p></div>
				<div class="cuerpo">
					<img src="" alt="muestra">
					<p>${instructor.descripcion}</p>
				</div>
				<div class="pie">
				
					<p>
						<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
					</p>
				</div>
			</div>



			
			



		</div>

	</div>


</body>

</html>









