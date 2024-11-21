package com.prog;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prog.bean.Employee;
import com.prog.bean.Address;


public class App 
{
    public static void main( String[] args )
    {
    	Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
    	Transaction begin = session.beginTransaction();
    	
    	Employee emp1 = new Employee();
    	emp1.setEmp_name("Pawan");
    	emp1.setEmp_age(21);
    	Employee emp2 = new Employee();
    	emp2.setEmp_name("Jokar");
    	emp2.setEmp_age(33);
    	Employee emp3 = new Employee();
    	emp3.setEmp_name("Omkar");
    	emp3.setEmp_age(100);
    	
    	Address ad1 = new Address();
    	ad1.setAddr("Office: Delhi");
    	Address ad2 = new Address();
    	ad2.setAddr("Home: UK");
    	
    	List<Employee> empList = new ArrayList<>();
    	empList.add(emp1);
    	empList.add(emp2);
    	empList.add(emp3);
    	
    	List<Address> adList = new ArrayList<>();
    	adList.add(ad1);
    	adList.add(ad2);
    	
    	// pawan, jokar, Omkar home and office address is delhi and UK..
    	emp1.setAddress(adList);
    	emp2.setAddress(adList);
    	emp3.setAddress(adList);
    	
    	// at delhi pawan, lokar, omkar lives....
    	ad1.setEmployee(empList);
    	ad2.setEmployee(empList);
    	
    	
//    	session.persist(emp1);
//    	session.persist(emp2);
//    	session.persist(emp3);
//    	session.persist(ad1);
//    	session.persist(ad2);
//    	
//    	begin.commit();
//    	session.close();
    

// Fetch............
    	Employee e = (Employee)session.get(Employee.class, 2);
    	System.out.println(e.getEmp_name());
    	
    	
    	System.out.println("Successfully............");
    	
    	
    	
    	
    }
}
