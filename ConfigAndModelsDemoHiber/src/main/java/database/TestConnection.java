package database;
// import 
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;
import org.hibernate.Session;
import models.Student;

public class TestConnection {
     
	public static void main(String[] args) {
		System.out.print("Connection started....");
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.print("Factory object: " + factory);
		
		// Creating Student
		
		Student st = new Student();
		st.setId(106);
		st.setName("Jack Pack");
		st.setCity("Quebec");
		
		
		// Session  form session factory
		
		Session sess =factory.openSession();
		
		sess.beginTransaction();
		sess.save(st);
		sess.getTransaction().commit();
		sess.close();
		
	}
}
