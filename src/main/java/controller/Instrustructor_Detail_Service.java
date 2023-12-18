package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Instructor;
import models.InstructorDetails;

public class Instrustructor_Detail_Service {

	public static Session getSession() {
		// Configuration class
		// Step-1
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		// Session Factory
		// Step-2
		SessionFactory factory = cfg.buildSessionFactory();

        //Session
		// Step-3
        Session sess=  factory.openSession();

        return sess;

	}

	// Create Instructor with Details

	public void createInstructorWithDetails(String fn , String ln ,
			                                String em, String phone,
			                                String channel,String hobby ) {
		// Session
		Session sess = StudentService.getSession();
		// Create instructor
		Instructor ins = new Instructor(fn,ln,em,phone);
		// Create instructor details
		InstructorDetails insDets = new InstructorDetails(channel,hobby);
		//Set Instructor details
		ins.setObjInstructorDetails(insDets);
		// Session life cycle
		sess.beginTransaction();
		sess.save(ins);
		sess.getTransaction().commit();
		sess.close();


	}

	// Read instructor and Details

	public Instructor getInsAndDetsById(int id) {
		// Session
	    Session sess = StudentService.getSession();
	    // Reading instructor
	    Instructor insWithDets = sess.get(Instructor.class,id);
	    return insWithDets;


	}

	// Update instructor email and hobby

	public void updateInstructorEmailAndHobbyById(int id, String em,
			String hobby) {

		// Session
	    Session sess = StudentService.getSession();
	    // Reading instructor
	    Instructor insWithDets = sess.get(Instructor.class,id);
	    // updating Instructor email
	    insWithDets.setEmail(em);
	    // updating Instructor detail hobby
	    insWithDets.getObjInstructorDetails().setHobby(hobby);
	     // Session life cycle
 		sess.beginTransaction();
 		sess.save(insWithDets);
 		sess.getTransaction().commit();
 		sess.close();



	}

	// Delete

	public void deleteInstructorById(int id) {
		// Session
	    Session sess = StudentService.getSession();
	    // Reading instructor
	    Instructor insWithDets = sess.get(Instructor.class,id);
	    // Session life cycle
  		sess.beginTransaction();
  		sess.delete(insWithDets);
  		sess.getTransaction().commit();
  		sess.close();


	}




}
