package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDatabaseConnection {

	public static void main(String[] args) {

		String url = "jdbc:mysql://uvxhpcwyphqrkakr:nqWP0CCmfLsONCkLUDjH@bfukfpmigpaspoxrmpox-mysql.services.clever-cloud.com:3306/bfukfpmigpaspoxrmpox";
		String user = "uvxhpcwyphqrkakr";
		String pass = "nqWP0CCmfLsONCkLUDjH";

		try {

			System.out.println("Connecting to database....");

			Connection myConnObj = DriverManager.getConnection(url,user,pass);

			System.out.println("Connection Successful !!");
		}catch(Exception ex) {

			ex.printStackTrace();


		}

	}

}
