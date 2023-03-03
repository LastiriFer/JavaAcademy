<!DOCTYPE html>
<html>

<head>
	<title>Add Student</title>

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
		<h3>Add Student</h3>
		
		<form action="StudentControllerServlet" method="GET">
		
			<input type="hidden" name="command" value="ADD" />
			<div>
				<div style="display:flex">
					<label>Nombre:</label>
					<input type="text" name="firstName" />
				
				</div>
				<br>
				<div style="display:flex">
					<label>Apellido:</label>
					<input type="text" name="lastName" />
				</div>
				<br>
				<div style="display:flex">
					<label>Email:</label>
					<input type="text" name="email" />
				</div>
				<br>
				<div style="display:flex">
					<label>Edad:</label>
					<input type="text" name="edad" />
				</div>
				<br>
			</div>
			<br>
			<p>Selecciona los cursos</p>
			<br>
			<div style="display:flex">
				<div style="display:flex;  ">
					<input style="width: 250px; height: 32px;"  type="checkbox" id="Java" name="java" value="Java">
					<label for="Java"> Curso Java</label><br>
				</div>
				<div style="display:flex;">
					<input style="width: 250px; height: 32px;" type="checkbox" id="JavaS" name="javas" value="JavaScript">
					<label for="JavaS"> Curso JavaScript</label><br>
				</div>
			</div>
			<div style="display:flex ">
				<div style="display:flex;">
					<input style="width: 250px; height: 32px;" type="checkbox" id="PHP" name="php" value="PHP">
					<label for="Java"> Curso PHP</label><br>
				</div>
				<div style="display:flex;">
					<input style="width: 250px; height: 32px;" type="checkbox" id="r" name="r" value="R">
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











