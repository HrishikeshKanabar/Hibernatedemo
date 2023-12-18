package database;
import controller.Instrustructor_Detail_Service;

public class TestDatabaseInstructorDetailsService {

	public static void main(String args[]) {

		Instrustructor_Detail_Service obj = new Instrustructor_Detail_Service();
		/*obj.createInstructorWithDetails("Domble", "Door","Domble@Door.com",
				                          "56567","www.dumble.com",
				                           "Dancing,Music");*/


		/*Instructor myIns=obj.getInsAndDetsById(1);
		System.out.println("Object Persis:"+myIns);
		System.out.println("First Name:"+myIns.getFirstName());
		System.out.println("Email:"+myIns.getEmail());
		System.out.println("Channel:"+myIns.getObjInstructorDetails().getChannel());*/

	    //obj.updateInstructorEmailAndHobbyById(1,"www.door.com","SKI");

		obj.deleteInstructorById(1);
	}

}
