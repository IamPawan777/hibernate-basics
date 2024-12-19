<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.connection.*, org.hibernate.*, com.entity.*, com.servlet.* " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Content</title>
<%@include file="css_js.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>

		<h1>Update the page</h1>
		<br>
		
		<%
		int noteId = Integer.parseInt(request.getParameter("note_id").trim());		
		
		Session s = HibarnateUtility.getSessionFactory().openSession();	
		Note note = (Note)s.get(Note.class, noteId);
		
		%>

		<form action="UpdateSer" method="post">
		
		<input value="<%= note.getId() %>" name="noteId" type="hidden"/>
			<div class="mb-3">
				<label for="title" class="form-label">Note Title</label> 
				<input name="title" type="text" class="form-control" id="title"
					aria-describedby="emailHelp" placeholder="Enter here" required value="<%= note.getTitle() %>" />
			</div>

			<div class="mb-3">
				<label for="content">Note Content</label> <br>
				<textarea name="content" id="content" class="form-control"
					placeholder="Enter your content here" style="height: 200px" 
					required> <%= note.getContent() %> </textarea>
			</div>


			<div class="container text-center">
				<button type="submit" class="btn btn-success">Update Your Note</button>
			</div>
		</form>
	</div>
</body>
</html>