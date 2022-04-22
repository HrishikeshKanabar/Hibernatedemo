package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	
	@Id  // Primary key
	@Column(name="student_id")
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
	
    
    // Default Constructor
    public Student() {
		
		
	}
    
    
    // Constructor with fields
    
    public Student(String firstName, String lastName, String email, String phone) {
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	
    
    
    // getter and setters
    

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


	// To String
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
	
	
    
    
    

}
