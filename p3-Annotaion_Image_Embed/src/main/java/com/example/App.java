package com.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.bean.Address;
import com.example.bean.Person;

import jakarta.persistence.Embedded;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
    	/* annotation, store image, Embedded */
    	
//        System.out.println( "Hello World!" );
    	Configuration con = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sessionfactory = con.buildSessionFactory();
    	Session open = sessionfactory.openSession();
    	Transaction begin = open.beginTransaction();
    	
    	Person std = new Person();
    	std.setName("baharue Singh");
    	std.setMobile("777777");
    	std.setPass("9898");
    	std.setRegisterTime(new Date());
    	std.setStatus(true);
    	
    	FileInputStream img_file = new FileInputStream(System.getProperty("user.dir")+"\\resource\\sbi.png");
    	byte b[] = new byte[img_file.available()];
    	img_file.read(b);
    	std.setPice(b);
    	
    	
    	Address addr = new Address();
    	addr.setCountry("India");
    	addr.setState("M.P");
    	addr.setCity("Mumbai");
    	
    	std.setAddress(addr);
    	
    	open.persist(std);
//    	open.persist(addr);
    	begin.commit();
    	open.close();
    	img_file.close();  
    }
}
