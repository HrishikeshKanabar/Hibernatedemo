package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class StudentService {

	public static void main(String[] args) {
		 
		// Configuration
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory Factory = cfg.buildSessionFactory();
		
		// Create student
		
		Student obj = new Student("FANCY","NANCY","Fan@nan.com","7896543210");
		
		System.out.println("Student: " + obj );
		
		// Session life cycle
		
		Session sess = Factory .openSession();
		sess.beginTransaction();
		sess.save(obj);
		sess.getTransaction().commit();
		sess.close();
	 

	}

}
