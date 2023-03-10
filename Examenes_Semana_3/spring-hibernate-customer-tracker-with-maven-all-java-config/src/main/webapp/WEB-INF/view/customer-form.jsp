<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Customer</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager Remasterizado</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Customer</h3>
	
		<form:form action="saveCustomer" modelAttribute="customer" method="POST">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />
			<div>
				<div style="display:flex">
					<label>Nombre:</label>
		    		<form:input path="firstName" />
				</div>
				<br>
				<div style="display:flex">
					<label>Apellido:</label>
					<form:input path="lastName" />
				</div>
				<br>
				
				<div style="display:flex">
					<label>Correo:</label>
					<form:input path="email" />
				</div>
				<br>
				<div style="display:flex">
					<label>Capacitaciones programadas:</label>
					<form:input path="capacitaciones" />
				</div>
				<br>
			
			
			
				<h3>Instrutores:</h3>
					<div style="display:flex;  ">
						<form:radiobutton  path="instructor" style="width: 50px; height: 15px; margin-right: 0px; " name="Juan" value="Juan" />
						<label style="display: contents; width: 50px;  margin-leftt: 0px;" for="juan">Juan Jim</label><br>
						
					</div>	
					<div style="display:flex;  ">
						
						<form:radiobutton  path="instructor" style="width: 50px; height: 15px; margin-right: 0px;"   name="Ana" value="Ana"/>
						<label style="display: contents; width: 50px;  margin-left: 0px;" for="ana">Ana del Castillo</label><br>
					</div>
						
					<label></label>
					<input type="submit" value="Save" class="save" />
			
			</div>
			
						
						
			
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
		</p>
	
	</div>

</body>

</html>










