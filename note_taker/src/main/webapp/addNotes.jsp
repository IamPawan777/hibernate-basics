<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Add Notes</title>

<%@include file="css_js.jsp"%>
</head>

<body>

	<div class="container">
		<%@include file="navbar.jsp"%>

		<br>
		<h2>Please fill your note details !</h2>
		<br>
		
		<!-- from  -->
		<form action="SaveNote" method="post">
			<div class="mb-3">
				<label for="title" class="form-label">Note Title</label>
				 <input name="title" type="text" class="form-control" id="title"
					aria-describedby="emailHelp" placeholder="Enter here" required>
			</div>

			<div class="mb-3">
				<label for="content">Note Content</label> <br>
				<textarea name="content" id="content" class="form-control"
					placeholder="Enter your content here" style="height: 200px" required></textarea>
			</div>
			
			
			<div class="container text-center">			
				<button type="submit" class="btn btn-primary">Add Content</button>
			</div>
		</form>
	</div>

</body>
</html>