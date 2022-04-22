package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="my_students")
public class Student {
	
	
	@Id  // Primary key
	@Column(name="student_id")
	// Primary is generate value by system (Auto-increment)
	// Note : Do not put strategy in String
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="student_fn")
	private String firstName;
	@Column(name="student_ln")
	private String lastName;
	@Column(name="student_email")
	private String email;
	@Column(name="student_phone")
    private String phone;
	
	// Default constructor
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	
	// Field constructor

	public Student(String firstName, String lastName, String email, String phone) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	
   //  getters and setters

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
