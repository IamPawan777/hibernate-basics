<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.query.QueryArgumentException"%>
<%@page import="java.util.List"%>
<%@page import="com.connection.HibarnateUtility"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.entity.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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
        <h2>All Notes: </h2>

        <div class="row">
            <div class="col-12">
                <%
                Session ses = HibarnateUtility.getSessionFactory().openSession();

                List<Note> list = ses.createQuery("from Note", Note.class).getResultList();

                SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
                SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");

                for (Note note : list) {
                    Date fullDate = note.getDate();
                    String formattedDate = dateFormatter.format(fullDate);
                    String formattedTime = timeFormatter.format(fullDate);
                %>
                <div class="card mt-3 pt-3">
                    <img class="card-img-top m-4 mx-auto" style="max-width:150px;" src="img/pencil.png" alt="Card image cap">
                    <div class="card-body px-4">
                        <h3 class="card-title"><%= note.getTitle() %></h3>
                        <p class="card-text"><%= note.getContent() %></p>
                        
                        <p class="text-success"><b> Date: <%= formattedDate %></b></p>
                        <p class="text-success"><b> Time: <%= formattedTime %></b></p>
                        
                        <div class="container text-center ">
                        <a href="DeleteSer?note_id=<%= note.getId() %>" class="btn btn-danger mx-4">Delete</a>
                        <a href="update.jsp?note_id=<%=note.getId() %>" class="btn btn-primary mx-4">Update</a>
                        
                        
                        
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
