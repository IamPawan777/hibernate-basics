package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	Configuration con = new Configuration().configure("hibernate.cfg.xml");
//    	con.configure("hibernate.cfg.xml");
    	SessionFactory sessionfactory = con.buildSessionFactory();
    	Session open = sessionfactory.openSession();
    	Transaction begin = open.beginTransaction();
    	
    	Student std = new Student();
//    	std.setId(1);
    	std.setName("Harry");
    	
    	open.persist(std);
    	begin.commit();
    	open.close();
    }
}
