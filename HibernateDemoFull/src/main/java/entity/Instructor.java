package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="My_Instructor")
public class Instructor {
	
	// Primary key
	@Id
	// Auto-increment
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="ins_fn")
	private String firstName;
	@Column(name="ins_ln")
	private String lastName;
	@Column(name="ins_email")
	private String email;
	@Column(name="ins_phone")
	private String phone;
	
	// Relationship to instructor details / FK
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="instructor_detail_id")
	private InsDetails ObjInsDetails;
	
	
	


	// Default constructor
	public Instructor() {
		
		
	}
	
	
	// Fields constructor
	
	public Instructor(String firstName, String lastName,String email, String phone) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}



	// Getters and settesr
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
	
	// Getter and setters for object
	public InsDetails getObjInsDetails() {
		return ObjInsDetails;
	}


	public void setObjInsDetails(InsDetails objInsDetails) {
		ObjInsDetails = objInsDetails;
	}


	
	
	// To stirng
	
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", ObjInsDetails=" + ObjInsDetails.toString()+ "]";
	}
	
	

}
