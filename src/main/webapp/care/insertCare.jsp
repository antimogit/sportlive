<%@ page import="it.contrader.dto.*"%>
<%@ page import="java.util.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert new care</title>
<link rel="stylesheet" type="text/css" href="/JspApp/css/style.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css"
	integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
<style>
/*contenitore in cima dove c'è scritto "Login"*/
.pre_contenitore {
	width: 320px;
	margin: auto;
	height: 50px;
	border: 1px solid black;
	border-radius: 40px 40px 40px 40px;
	background-color: rgba(0, 0, 0, 0.9);
	box-shadow: 20px 30px 20px #000000;
	padding: 20px;
}

.pre_contenitore p {
	color: white;
	text-align: center;
	font-size: 1.9em;
	font-family: arial;
	line-height: 2px;
}
</style>
</head>
<body>
	<div class="pre_contenitore">

		<p>New Care</p>

	</div>

	<br>
	<br>
	<form method="POST" action="DoctorServlet?richiesta=insert">

		
		Patient name: <input type="text" size="40" maxlength="40" name="patname" />
		<br>
		<br>
		Patient SSC: <input type="text" size="40" maxlength="40" name="patcf" />
		<br>
		<br>
		Patient age: <input type="text" size="40" maxlength="40" name="patage" />
		<br>
		<br>
		Patology: <input type="text" size="40" maxlength="40" name="patology" />
		<br>
		<br>
		Care name: <input type="text" size="40" maxlength="40" name="carename" />
		<br>
		<br>
		Quantity: <input type="text" size="40" maxlength="40" name="quantity" />
		<br>
		<br>
		Notes: <input type="text" size="40" maxlength="40" name="notes" />
		<input type="SUBMIT" value="Add">
		<br>
		<br>
		<a href="DoctorServlet?richiesta=CareManager"><i class="fas fa-arrow-alt-circle-left fa-lg"> Back</i></a>

	</form>
</body>
</html>