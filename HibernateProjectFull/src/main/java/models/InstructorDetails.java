package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InstructorDetails {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="instructor_detail_id")
	private int id;
	@Column(name="instructor_youtube_channel")
	private String channel;
	@Column(name="instructor_hobby")
	private String hobby;
	
	
	public InstructorDetails() {

	}


	public InstructorDetails(int id, String channel, String hobby) {
		super();
		this.id = id;
		this.channel = channel;
		this.hobby = hobby;
	}


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
