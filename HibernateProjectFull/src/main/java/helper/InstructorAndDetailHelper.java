package helper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Instrcutor;
import models.InstructorDetails;
import models.Student;

public class InstructorAndDetailHelper {
	
	public static Session getSession() {
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();
			Session sess =factory.openSession();
			return sess;
	}
	
	
	public void createIntructorWithDetails(String fn , String ln , String email , 
			                                  String phone , String channel , String hobby) {
		
	
		Session sess = InstructorAndDetailHelper.getSession();
		// Create Instructor
		Instrcutor ins = new Instrcutor(fn,ln,email,phone);
	    //Instructor Details
		InstructorDetails insDetails =new InstructorDetails(channel,hobby);
		// Associate the objects
		ins.setInsDetails(insDetails);
		// Session life cycle
		sess.beginTransaction();
		sess.save(ins);	
		sess.getTransaction().commit();
		sess.close();
	}
	
	// Read  Instructor And Details by Id
	public Instrcutor readInstructorAndDetails(int id) {
		
		Session sess = InstructorAndDetailHelper.getSession();
		Instrcutor ins = sess.get(Instrcutor.class, id);
		return ins;
	}
	
	// Update Instructor email and hobbies
	
	 public void updateInstructorEmailAndHobby(int instructorId , String email,String hobby) {
		 
		 Session sess = InstructorAndDetailHelper.getSession();
	    // Session life cycle
		sess.beginTransaction();
		Instrcutor ins = sess.get(Instrcutor.class, instructorId);
		sess.createQuery("update Instrcutor set email='"+email+"' where id="+ins.getId()).executeUpdate();
		sess.createQuery("update InstructorDetails set hobby='"+hobby+"' where id="+ins.getInsDetails().getId()).executeUpdate();
		sess.getTransaction().commit();
		sess.close();
	 }
	 
	 // Deleting instructor will also delete Instructor detail Cascade all
	 public void deleteInstrcuor(int id) {
		 Session sess = InstructorAndDetailHelper.getSession();
		 Instrcutor ins = sess.get(Instrcutor.class, id);
		 // Session life cycle
		 sess.beginTransaction();
		 sess.delete(ins);
		 sess.getTransaction().commit();
		 sess.close();
	 }

}
