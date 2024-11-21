package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.entity.Employee;
import com.example.entity.Person;
import com.example.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	Configuration con = new Configuration().configure();
    	SessionFactory sessionFactory = con.buildSessionFactory();
    	Session open = sessionFactory.openSession();
    	Transaction begin = open.beginTransaction();
    	
    	Person per = new Person(44, "AAAA");
//    	per.setId(11);
//    	per.setName("AAAA");
    	
    	Employee emp = new Employee();
    	emp.setId(55);
    	emp.setName("BBBB");
    	emp.setJob("Developer");
    	emp.setSalary(1223.34);
    	
    	Student std = new Student();
    	std.setId(66);
    	std.setName("CCCC");
    	std.setCourse("Java Dev");
    	std.setFees(12000);
    	
    	open.persist(per);
    	open.persist(emp);
    	open.persist(std);
    	
    	begin.commit();
    	open.close();
    }
}
