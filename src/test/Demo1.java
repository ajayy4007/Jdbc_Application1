package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo1 {
public static void main(String[] args) {
	try {
		//load jdbc driver type 4
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Stablish the connection b/w deta base application and data base
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
		System.out.println("Connection Stablish succcessfully");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
