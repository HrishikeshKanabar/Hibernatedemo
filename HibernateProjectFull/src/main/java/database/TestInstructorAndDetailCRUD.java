package database;

import helper.InstructorAndDetailHelper;
import models.Instrcutor;

public class TestInstructorAndDetailCRUD {

	public static void main(String[] args) {
		
		InstructorAndDetailHelper obj = new InstructorAndDetailHelper();
		
		//obj.createIntructorWithDetails("Prof Newton","Albert","newt@fan.com" ,"4567890453","www.newt.com","Singing");
		//obj.createIntructorWithDetails("Prof Issac","watt","issac@gmai.com" ,"789097654","www.issac56.com","Research");
		//Instrcutor ins =obj.readInstructorAndDetails(5);
		//System.out.println(ins);	
		//obj.updateInstructorEmailAndHobby(5,"newton@gmail.com","Biking");
		
		obj.deleteInstrcuor(9);
		}

}

