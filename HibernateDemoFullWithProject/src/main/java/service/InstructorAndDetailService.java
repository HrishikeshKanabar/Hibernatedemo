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
		
		// Read instructor and details by id
		
		public Instructor readInstructorAndDetails(int id) {
			// Session 
			Session sess = InstructorAndDetailService.getSession();
			Instructor ins = sess.get(Instructor.class,id);
			return ins;
		}
		
		// Update email and hobbies
		
		public void updateInstructorEmailandHobby(int instructorId, String email,String hobby) {
			// Session 
			Session sess = InstructorAndDetailService.getSession();
			// Get instructor
			Instructor ins = sess.get(Instructor.class,instructorId);
			// Session life cycle
			sess.beginTransaction();
			// Update email of instructor
			sess.createQuery("update Instructor set email='"+email+"' where id="+ins.getId()).executeUpdate();
			// update hobby of instructor
			sess.createQuery("update InsDetails set hobby='"+hobby+"' where id="+ins.getObjInsDetails().getId()).executeUpdate();
			sess.getTransaction().commit();
			sess.close();
			
		}
		
		// Delete instructor (will also delete instructor details)
		
		public void deleteInstructorByQuery(int id) {
			// Session 
			 Session sess = InstructorAndDetailService.getSession();
			// Get instructor
			Instructor ins = sess.get(Instructor.class,id);
			 // Session life cycle
			sess.beginTransaction();
			sess.createQuery("delete from Instructor where id="+ins.getId()).executeUpdate();
			sess.getTransaction().commit();
			sess.close(); 
			
		}
		
	//  Delete instructor by Hibernate entity	
		
		public void deleteInstructorByHibernateEntity(int id) {
			// Session 
			 Session sess = InstructorAndDetailService.getSession();
			// Get instructor
			Instructor ins = sess.get(Instructor.class,id);
			 // Session life cycle
			 sess.beginTransaction();
			 sess.delete(ins);
			 sess.getTransaction().commit();
			 sess.close();
		}
		
	
		
		
		
		
		
		

}
