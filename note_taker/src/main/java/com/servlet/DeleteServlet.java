package com.servlet;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connection.HibarnateUtility;
import com.entity.Note;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet ("/DeleteSer")
public class DeleteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int noteId = Integer.parseInt(req.getParameter("note_id").trim());
			
			Session session = HibarnateUtility.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			
			Note note = (Note)session.get(Note.class, noteId);
			session.remove(note);
					
			tx.commit();
			session.close();
			
			resp.sendRedirect("all_notes.jsp");
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}
	
}
