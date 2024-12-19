<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.query.QueryArgumentException"%>
<%@page import="java.util.List"%>
<%@page import="com.connection.HibarnateUtility"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.entity.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Notes</title>
<%@include file="css_js.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>
		<h2 class="text-uppercase">All Notes</h2>

		<div class="row">
			<div class="col-12">
				<%
				Session ses = HibarnateUtility.getSessionFactory().openSession();

				List<Note> list = ses.createQuery("from Note", Note.class).getResultList();

				for (Note note : list) {
				%>
				<div class="card mt-3">
					<img class="card-img-top m-4 mx-auto" style="max-width:100px;" src="img/pencil.png" alt="Card image cap">
					<div class="card-body px-4">
						<h5 class="card-title"><%= note.getTitle() %></h5>
						<p class="card-text"><%= note.getContent() %></p>
						
						<p class="text-primary"><b><%=note.getDate() %></b></p>
						
						<div class="container text-center ">
						<a href="DeleteSer?note_id=<%= note.getId() %>" class="btn btn-danger m-4">Delete</a>
						<a href="update.jsp?note_id=<%=note.getId() %>" class="btn btn-primary m-4">Update</a>
						
						
						
						</div>
					</div>
				</div>

				<%
				}	

				ses.close();
				%>
			</div>
		</div>


	</div>
</body>
</html>