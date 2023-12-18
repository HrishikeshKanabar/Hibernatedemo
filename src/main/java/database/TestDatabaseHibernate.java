package database;

import org.hibernate.Session;
//Step-1
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// Models
import models.Student;

public class TestDatabaseHibernate {

	public static void main(String[] args) {

		 // Make connection

		SessionFactory sessFacObj = new Configuration()
				                      .configure("hibernate.cfg.xml")
				                      .addAnnotatedClass(Student.class)
				                      .buildSessionFactory();

		// Create a student

		Student stdOne = new Student("opie","bggff","Joe6@Doe.com");
		Student stdTwo = new Student("fdfd","kfdf2","Joe6@Doe.com");
		Student stdThree = new Student("Jdfdo6","dfdkl6","Joe6@Doe.com");
		// Session life cycle by hibernate developer

		// STEP:1--> Open: Session
		Session sess = sessFacObj.openSession();
		// STEP:2--> Begin Transaction
		sess.beginTransaction();
		// STEP:3--> Save
		sess.save(stdOne);
		sess.save(stdTwo);
		sess.save(stdThree);
		// STEP:4--> Commit
		sess.getTransaction().commit();
		// STEP:5-->Close
		sess.close();

	}

}
