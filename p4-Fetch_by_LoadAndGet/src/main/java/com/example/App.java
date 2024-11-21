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
    	/* get(), load()  */
    	Configuration con = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sessionfactory = con.buildSessionFactory();
    	Session session = sessionfactory.openSession();
//    	Transaction begin = session.beginTransaction();
//    	
//    	Person p = new Person();
//    	p.setName("Pawan bIhst");
//    	p.setMobile("9797979");
//    	p.setPass("jajan m");
    	Person std = (Person)session.get(Person.class, 1);
    	
// or 
//    	Person std = session.load(Person.class, 1);
    	
        System.out.println(std);
    	
//    	session.persist(p);
//    	begin.commit();
    	
    	
    	session.close(); 
    }
}
