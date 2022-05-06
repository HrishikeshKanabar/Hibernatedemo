package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="My_InsDetails")
public class InsDetails {
	
	
	// primary key
	@Id
	// Auto-increment
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="instructor_detail_id")
	private int id;
	@Column(name="instructor_channel")
	private String channel;
	@Column(name="instructor_hobby")
	private String hobby;
	
	// Default constructor
	public InsDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Filed constructor

	public InsDetails(String channel, String hobby) {
		super();
		this.channel = channel;
		this.hobby = hobby;
	}
	
	
	// Getters and setters

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
	
	

	
	
	
	
	// To stirng 
	
	
	@Override
	public String toString() {
		return "InsDetails [id=" + id + ", channel=" + channel + ", hobby=" + hobby + "]";
	}
	
	
	
	
	
	

}
