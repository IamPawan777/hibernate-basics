package com.example;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.example.bean.Person;

public class App 
{
    public static void main( String[] args ) throws IOException
    {   
    	Configuration con = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sessionfactory = con.buildSessionFactory();
    	Session session = sessionfactory.openSession();
    	Transaction begin = session.beginTransaction();

//    	Person p = new Person();
//    	p.setName("Kar do Na PLZ");
//    	p.setMobile("12890");
//    	p.setPass("Please");
//    	
//    	session.persist(p);
//    	begin.commit();
    	
//    	Person std = (Person)session.get(Person.class, 1);
//        System.out.println(std);
    	
    	
    	
    	// fetch table.......
    	List<Person> list = session.createQuery("FROM Person").getResultList();
    	list.forEach(x -> System.out.println(x.getId()+" "+x.getName()));
////    	or
    	Query<Person> q1 = session.createQuery("FROM Person");
    	List<Person> list1 = q1.list();
    	list1.forEach(x -> System.out.println(x.getId()+" "+x.getName()));
    	
        // fetch from 3 row and maximum 2 row only.....
    	Query<Person> q2 = session.createQuery("FROM Person");
    	q2.setFirstResult(2);
    	q2.setMaxResults(2);
    	List<Person> list2 = q2.list();
    	list2.forEach(x -> System.out.println(x.getId()+" "+x.getName()));

//    	 updata recode
    	Query<Person> q5 = session.createQuery("UPDATE Person AS p SET p.name =: name WHERE p.id=2");					// posinational perameter
    	q5.setParameter("name", "Sarswati");
    	int i = q5.executeUpdate();
    	if(i>0)
    		System.out.println("recode updated..");
    	begin.commit();
    	
    	
//    	// delete recode
//    	Query<Person> q6 = session.createQuery("DELETE Person p WHERE p.id=5");
//    	int j = q6.executeUpdate();
//    	if(j>0)
//    		System.out.println("delete Successfully..");
//    	begin.commit();
    	
    	
    	// select clause........fetch column data
    	Query<Integer> q3 = session.createQuery("SELECT p.id FROM Person AS p");
    	List<Integer> list3 = q3.list();
    	list3.forEach(x -> System.out.println(x));
    	
    	// where clause........fetch column data
    	Query<String> q4 = session.createQuery("SELECT name FROM Person WHERE id=2");
    	List<String> list4 = q4.list();
    	list4.forEach(x -> System.out.println(x));
    	
    	// greater values.........
    	Query<Object[]> q7 = session.createQuery("SELECT name, mobile FROM Person WHERE id > 2");
    	List<Object[]> list7 = q7.list();
    	list7.forEach(x -> System.out.println(x[0]+":  "+x[1]));

    	//	max clause (min, count, avg, sum etc)
    	Query<Object> q8 = session.createQuery("SELECT max(mobile) FROM Person");
    	List<Object> list8 = q8.list();
    	list8.forEach(x -> System.out.println(x));
    	
    	
    	session.close(); 
    }
}

