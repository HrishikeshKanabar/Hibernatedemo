package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class CMPService {
	
	// Configuration method
				public static Session getSession() {
							
							Configuration cfg = new Configuration();
							cfg.configure("hibernate.cfg.xml");
							SessionFactory Factory = cfg.buildSessionFactory();
							Session sess = Factory.openSession();
							return sess;
							
				}
	
	public List<Student> getAllStudents(){
		
		// Session 
		  Session sess = HQLServices.getSession();
		
		List<Student> allStudents  =sess.createQuery("from Student").getResultList(); 
		
		return allStudents;
	}

}
