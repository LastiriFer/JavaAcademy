<!DOCTYPE html>
<html>

<head>
	<title>Update Student</title>

	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-student-style.css">	
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>FooBar University</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Update Student</h3>
		
		<form action="StudentControllerServlet" method="GET">
		
			<input type="hidden" name="command" value="UPDATE" />

			<input type="hidden" name="studentId" value="${THE_STUDENT.id}" />
			<div>
				<div style="display:flex">
					<label>Nombre:</label>
					<input type="text" name="firstName" value="${THE_STUDENT.nombre}" />
				</div>
				<br>
				<div style="display:flex">
				
					<label>Apellido:</label>
					<input type="text" name="lastName" value="${THE_STUDENT.apellido}" />
				</div>
				<br>
				<div style="display:flex">
					<label>Email:</label>
					<input type="text" name="email"  value="${THE_STUDENT.email}" />
				</div>
				<br>
				<div style="display:flex">
					<label>Edad:</label>
					<input type="text" name="edad"  value="${THE_STUDENT.edad}" />
				</div>
			</div>
			<br>
			<p>Selecciona los cursos</p>
			<br>
			<div style="display:flex">
				<div style="display:flex;  ">
					<input style="width: 250px; height: 32px;"  type="checkbox" id="Java" name="java" value="Java" <% if (request.getAttribute("COURSES").toString().contains("Java")) { %> checked="checked"  <% } %>  >
					<label for="Java"> Curso Java</label><br>
				</div>
				<div style="display:flex;">
					<input style="width: 250px; height: 32px;" type="checkbox" id="JavaS" name="javas" value="JavaScript" <% if (request.getAttribute("COURSES").toString().contains("JavaScript")) { %> checked="checked"  <% } %>>
					<label for="JavaS"> Curso JavaScript</label><br>
				</div>
			</div>
			<div style="display:flex ">
				<div style="display:flex;">
					<input style="width: 250px; height: 32px;" type="checkbox" id="PHP" name="php" value="PHP" <% if (request.getAttribute("COURSES").toString().contains("PHP")) { %> checked="checked"  <% } %>>
					<label for="Java"> Curso PHP</label><br>
				</div>
				<div style="display:flex;">
					<input style="width: 250px; height: 32px;" type="checkbox" id="r" name="r" value="R" <% if (request.getAttribute("COURSES").toString().contains("R")) { %> checked="checked"  <% } %>>
					<label for="r"> Curso R</label><br>
				</div>
				
			</div>
			
			
			
			
			
			
			
			
			<label></label>
			<input type="submit" value="Save" class="save" />
					
		</form>
		
		<div style="clear: both;"></div>
		
		<p>
			<a href="StudentControllerServlet">Back to List</a>
		</p>
	</div>
</body>

</html>











