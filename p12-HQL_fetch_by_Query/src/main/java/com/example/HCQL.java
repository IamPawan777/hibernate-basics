package com.example;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import com.example.bean.Person;

import jakarta.persistence.criteria.CriteriaDelete;
import jakarta.persistence.criteria.CriteriaQuery;

public class HCQL 
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
    	
//    	// fetch table.......
//    	List<Person> q1 = session.createQuery("FROM Person").getResultList();
//    	q1.forEach(x -> System.out.println(x.getId()+" "+x.getName()));
    	
    	
    	HibernateCriteriaBuilder c = session.getCriteriaBuilder();
    	CriteriaQuery<Person> criteria= c.createQuery(Person.class);
    	criteria.from(Person.class);    	
    	List<Person> res =  session.createQuery(criteria).getResultList();
    	res.forEach(x -> System.out.println(x.getName()));
    	
    	
    	session.close(); 
    }
}
