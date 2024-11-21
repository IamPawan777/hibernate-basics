package com.example;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.bean.Address;
import com.example.bean.Person;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
    	Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
    	Transaction begin = session.beginTransaction();
    	
    	Person std = new Person();
    	std.setName("Lokesh");
    	std.setMobile("7777777");
    	std.setPass("abc@777");
    	
    	Address addr = new Address();
    	addr.setCountry("Mumbai");
    	addr.setState("MP");
    	addr.setCity("Kol");
    	
    	std.setAddress(addr);
    	addr.setPerson(std);
    	
    	session.persist(std);
    	session.persist(addr);
    	begin.commit();
    	session.close();
    	System.out.println("Inseted Successfully");
    	
    	
    	
//    	Person emp = session.load(Person.class, 1);
//    	System.out.println(emp.getName());
//    	System.out.println(emp.getAddress().getCity());
    	
//    	Address addr = session.get(Address.class, 1);
//    	System.out.println(addr.getPerson().getName());
//    	System.out.println(addr.getCity());
    	
    	
    }
}
