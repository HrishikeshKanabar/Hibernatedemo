package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instrcutor {
	
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="instructor_id")
   private int id;
   @Column(name="instructor_fn")
   private String firstName;
   @Column(name="instructor_ln")
   private String lastName;
   @Column(name="instructor_email")
   private String email;
   @Column(name="instructor_phone")
   private String phone;
   
   // Default Constructor
   
	public Instrcutor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
  // Field Constructor
	
	public Instrcutor(int id, String firstName, String lastName, String email, String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	
	// getters and setters


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	
	
	
   
   
   
}
