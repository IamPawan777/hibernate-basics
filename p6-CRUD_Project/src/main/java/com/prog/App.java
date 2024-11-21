package com.prog;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prog.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Started.....!" );
        Configuration con = new Configuration().configure();
        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction begin = session.beginTransaction();
        
        Student std = new Student();
        Student std2 = new Student();
        
        // 1...... create or insert
        std.setName("om Pr");
        std.setAddress("mumbai");
        std.setEmail("ab@gmail.com");
        std.setCollege("abc");
        
        std2.setName("komal");
        std2.setAddress("kolkata");
        std2.setEmail("k@gmail.com 2");
        std2.setCollege("monkey2");
      
        
        
        
//      //   2....... read or fetch        
//      std = session.get(Student.class, 1);
//    	System.out.println(std);
        
//    	std2 = session.get(Student.class, 4);
//    	System.out.println(std2);
        
        
        
//        // 3.........update.......
//        std = session.get(Student.class , 3);
//        std.setAddress("Benglor");
//        std2 = session.get(Student.class, 1);
//        std2.setName("Pawan");
//        std2.setAddress("Chandighar");
        
        
        
        // 4............delete.......
//        std = session.get(Student.class, 2);
//        session.remove(std);
       
//        session.persist(std);
//        session.persist(std2);
        
        session.persist(std2);
        begin.commit();
        sessionFactory.close();
        session.close();
        
        System.out.println( "\n register successfully.....!" );
        
    }
}
