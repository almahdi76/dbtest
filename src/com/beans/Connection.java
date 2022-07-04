package com.beans;

//import java.sql.Connection;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connection {
	
	private static Connection connect() {
		Connection c = null;
		   Statement stmt = null;
		      try {
		         Class.forName("org.postgresql.Driver");
		         c = (Connection) DriverManager
		            .getConnection("jdbc:postgresql://localhost:5432/testdb","postgres", "1234");
		      } catch (Exception e) {
		         e.printStackTrace();
		         System.err.println(e.getClass().getName()+": "+e.getMessage());
		         System.exit(0);
		      }
		      System.out.println("Opened database successfully");
		return c;
	}
	
	private static void inserssion() {
		Connection c = null;
		   Statement stmt = null;
		   
  	   try {

		   ((java.sql.Connection) c).setAutoCommit(false);


		   stmt = ((java.sql.Connection) c).createStatement();
		  
		  String sql=null;
		  sql = "INSERT INTO noms2 (NAME,AGE,ADDRESS,SALARY) "
		      + "VALUES ( 'Ali',29, 'California', 20000.00 );";
		  
		   stmt.executeUpdate(sql);



		   stmt.close();
		   ((java.sql.Connection) c).commit();
		   ((java.sql.Connection) c).close();
		} catch (Exception e) {
		   System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		   System.exit(0);
		}
		System.out.println("Records created successfully");
	}
	
	
	
	

}
