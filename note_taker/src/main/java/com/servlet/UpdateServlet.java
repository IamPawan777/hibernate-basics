package com.servlet;

import java.io.IOException;
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

@WebServlet ("/UpdateSer")
public class UpdateServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			
			int noteId = Integer.parseInt(req.getParameter("noteId").trim());
			
			Session session = HibarnateUtility.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			
			Note note = (Note)session.get(Note.class, noteId);
			note.setTitle(title);
			note.setContent(content);
			note.setDate(new Date());
			
			tx.commit();
			session.close();
			
			resp.sendRedirect("all_notes.jsp");			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
