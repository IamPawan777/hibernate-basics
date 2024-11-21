package com.example;

import java.io.IOException;

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
 
//   // insert data......but one by one not together
    	
//    	Question q = new Question();
////    	q.setQ_name("What is Hibernate ?");
////    	q.setQ_name("what is Servlet ?");
//    	q.setQ_name("What is JAVA ?");
//
//    	Answer a = new Answer();
////    	a.setA_name("Hibernate is JPA implemented framework...");
////    	a.setA_name("Servlet is an API");
//    	a.setA_name("JAVA is an Object Oriented Programming Language..!");
//    	
//    	q.setAns(a);
//    	a.setQue(q);
//    	
//    	session.persist(a);
//    	session.persist(q);
//    	begin.commit();
//    	session.close();
//    	System.out.println("Inseted Successfully");
    	
    	
    	
   // fetch data.............
    	
    	Question a = session.get(Question.class, 4);
    	System.out.println(a.getQ_name());
    	System.out.println(a.getAns().getA_name());
    	
    	
    }
}
