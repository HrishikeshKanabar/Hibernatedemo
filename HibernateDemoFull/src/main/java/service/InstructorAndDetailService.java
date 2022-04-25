package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.InsDetails;
import entity.Instructor;

public class InstructorAndDetailService {
	
	// Configuration method
		public static Session getSession() {
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory Factory = cfg.buildSessionFactory();
			Session sess = Factory.openSession();
			
			return sess;
			
		}
		
		
	// Create 
		public void createInstructorWithDetails(String fn , String ln , String email,
				                                 String phone, String channel,String hobby) {
			
			// Session 
			Session sess = InstructorAndDetailService.getSession();
			// Create instructor
			Instructor ins = new Instructor(fn,ln,email,phone);
			// Create instructor detail
			InsDetails insDetails = new InsDetails(channel,hobby);
			// Associate objects 
			ins.setObjInsDetails(insDetails);
			
			System.out.println(ins.toString());
			
			// Session life cycle
			sess.beginTransaction();
			sess.save(ins);
			sess.getTransaction().commit();
			sess.close();
			
			
		}

}
