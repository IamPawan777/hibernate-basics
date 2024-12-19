package com.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.connector.HibernateUtil;
import com.entity.Example;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	
//    	Transaction tx = session1.beginTransaction();
//    	Example ex = new Example();
//    	ex.setName("Vishnu.");
//    	ex.setMobile(7777);
//    	
//    	session.persist(ex);
//    	tx.commit();	
    
    	
    	
//    	//   first level cache...........
//    	Example e1 = session.get(Example.class, 1);
//    	System.out.println(e1);
//    	System.out.println(" after do something   .............");
//    	
//    	Example e2 = session.get(Example.class, 1);
//    	System.out.println(e2);
//    	System.out.println(" after do something again .............");
//    	
//    	Example e3 = session.get(Example.class, 1);
//    	System.out.println(e3);
    	
    	
    	
    	//		second level cache  (here 2 session but single query.....)
    	Session session1 = sessionFactory.openSession();
    	Example e1 = session1.get(Example.class, 4);
    	System.out.println(e1);
    	
    	Session session2 = sessionFactory.openSession();
    	Example e2 = session2.get(Example.class, 4);
    	System.out.println(e2);

    	session1.close();
    	session2.close();
    	sessionFactory.close();
    	
    	
    }
}
