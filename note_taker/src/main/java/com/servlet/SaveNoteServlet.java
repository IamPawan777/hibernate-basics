package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connection.HibarnateUtility;
import com.entity.Note;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet ("/SaveNote")
public class SaveNoteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String title = request.getParameter("title");
			String content = request.getParameter("content");

			Note note = new Note(title, content, new Date());

			Session ses = HibarnateUtility.getSessionFactory().openSession();
			Transaction tx = ses.beginTransaction();
			ses.persist(note);
			tx.commit();
			ses.close();
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h1 style='text-align:center'>Note is added successfully</h1>");
			out.println("<h1 style='text-align:center'><a href='all_notes.jsp' style='text-decoration: none;'>View All Notes...</a></h1>");

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
