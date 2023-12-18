package models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Instructor_Details")
public class InstructorDetails {

	// Fields
	// Primary Key
	@Id
	// Auto-Increment
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Channel")
	private String channel;
	@Column(name="Hobby")
	private String hobby;

	// Constructor
	public InstructorDetails() {

	}

	// Constructor - Fields
	public InstructorDetails(String channel, String hobby) {
		this.channel = channel;
		this.hobby = hobby;
	}



	// Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}





}
