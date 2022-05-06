package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class HQLServices {
	
	// Configuration method
			public static Session getSession() {
						
						Configuration cfg = new Configuration();
						cfg.configure("hibernate.cfg.xml");
						SessionFactory Factory = cfg.buildSessionFactory();
						Session sess = Factory.openSession();
						return sess;
						
			}

	public static void main(String[] args) {
		
		// Get sesssion
		
		// Session 
		  Session sess = HQLServices.getSession();
		
		// HQL QUERY TO Retrive all Students
		  
		 List<Student> std =sess.createQuery("from Student").getResultList(); 
		 System.out.println("********* LIST OF ALL STUDENTS *********");
		 System.out.println(std);
		 
		 //  HQL Query with Where clause
		 
		 List<Student> stdWhere =sess.createQuery("from Student s where s.lastName='Mack'").getResultList(); 
		 System.out.println("********* LIST OF STUDENTS WHERE LAST NAME IS 'MACK' *********");
		 System.out.println(stdWhere);
		 
		 // HQL Query with OR operator
		 List<Student> stdOR =sess.createQuery("from Student s where s.lastName='Mack' OR s.firstName='Tack'").getResultList(); 
		 System.out.println("********* LIST OF STUDENTS WHERE LAST NAME IS 'MACK'   OR FIRST NAME IS TACK *********");
		 System.out.println(stdOR);
		 
		 // HQL Query with Like Clase
		 List<Student> stdLIKE =sess.createQuery("from Student s where s.email LIKE 'Tackcors@mack.com'").getResultList(); 
		 System.out.println("********* LIST OF STUDENTS WHERE email like 'Tackcors@mack.com' *********");
		 System.out.println(stdLIKE);
	}

}
