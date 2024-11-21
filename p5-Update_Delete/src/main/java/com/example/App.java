package com.example;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.bean.Person;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	/*  delete  ||  Update ( get then set )  */
    	Configuration con = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sessionfactory = con.buildSessionFactory();
    	Session session = sessionfactory.openSession();
    	Transaction open = session.beginTransaction();
    	
    	Person person = new Person();
    	
    	// update recorde
//    	person = session.get(Person.class, 2);
//    	
//    	if(person != null) {
//    		person.setName(" Bisht komal ");
////    		person.setMobile("87878");
//    	}
//    	else {
//    		System.out.println("Object not found..");
//    	}
    	
//    OR ......
    	
    	person.setId(8);
    	person.setMobile("2222222");
    	person.setName("pp");
    	session.merge(person);
    	
    	
    	
    	
    	
    	
    	// delete recorde
//    	person.setId(5);
//    	session.remove(person);
    	
////   or
    	
//    	person = session.get(Person.class, 2);
//    	if(person != null)    	
//    		session.remove(person);
//    	else
//    		System.out.println("Object not found..");
    	
    	
    	
    	open.commit();
    	session.close(); 
    }
}
