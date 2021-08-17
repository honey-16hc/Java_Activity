package activity8;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	
	public static Connection getConnection() throws Exception {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "root");
		
		return con;
	}

}
