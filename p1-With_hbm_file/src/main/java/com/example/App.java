package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World! kjnkjs" );
    	
    	Configuration con = new Configuration();
    	con.configure("hibernate.cfg.xml");
    	
    	SessionFactory sessionFactory = con.buildSessionFactory();
    	
    	Session open = sessionFactory.openSession();
    	Transaction begin = open.beginTransaction();
    	
    	Student std = new Student();
//    	std.setRoll11);
    	std.setName("Krishna");
    	std.setMarks(42.03f);
    	
    	open.persist(std);
    	begin.commit();
    	open.close();        
    }
}
