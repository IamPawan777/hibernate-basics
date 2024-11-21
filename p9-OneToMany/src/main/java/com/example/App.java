package com.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.bean.Question;
import com.example.bean.Answer;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
    	Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
    	Transaction begin = session.beginTransaction();
    	
    	
    	Answer a1 = new Answer();
    	Answer a2 = new Answer();
    	Answer a3 = new Answer();
    	Answer a4 = new Answer();

    	a1.setAns_name("What is Java");
    	a1.setAns_poatedBy("Harry");
    	a2.setAns_name("What is Servlet");
    	a2.setAns_poatedBy("Sam");
    	a3.setAns_name("What is Java");
    	a3.setAns_poatedBy("Harry");
    	a4.setAns_name("What is Servlet");
    	a4.setAns_poatedBy("Sam");
    	
    	
    	

    	
    	List<Answer> list1 = new ArrayList<>();
    	list1.add(a1);
    	list1.add(a2);
    	List<Answer> list2 = new ArrayList<>();
    	list2.add(a3);
    	list2.add(a4);
    	
    	
    	Question q1 = new Question();
    	q1.setQ_name(" ");
    	q1.setAnswer(list1);
    	
    	
    	Question q2 = new Question();
    	q2.setQ_name("What is Servlet");
    	q2.setAnswer(list2);
    	
    	session.persist(q1);
    	session.persist(q2);
    	begin.commit();
    	session.close();
    	System.out.println("Inseted Successfully");    	
    	
    }
}
