package activity7;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Problem1JDBC {
	public static void main(String[] args) throws Exception {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "root");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice" + "\n" + " 1. View Details" +  "\n" +" 2. Insert Details" +  "\n" +" 3. Delete Details"  +  "\n" +" 4. Update Details");
		int n = sc.nextInt();
		sc.nextLine();
		
		if(n == 1) {
		PreparedStatement ps = con.prepareStatement("select * from student_details");
		ResultSet rs = ps.executeQuery();
		System.out.println("Id-----NAME------SEM-------COURSE");
		while(rs.next()) {
			System.out.println(rs.getInt(1) + "-----" + rs.getString(2)+ "------"+rs.getInt(3) + "-------"+ rs.getString(4));
		}
		}
		
		else if(n == 2) {
			System.out.println("Enter Name");
			String name = sc.nextLine();
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter semester");
			int sem = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter course");
			String course = sc.nextLine();
			Statement s = con.createStatement();
			s.execute("insert into student_details values("+id+",'"+name+"',"+sem+",'"+course+"')");
			
			
		}
		
		else if(n == 3) {
			System.out.println("Enter id to be deleted");
			int id = sc.nextInt();
			Statement s = con.createStatement();
			s.execute("DELETE from student_details  WHERE id = '" + id + "' ");
			
		}
		else if(n == 4) {
			System.out.println("Enter id to be updated");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name");
			String name = sc.nextLine();
			System.out.println("Enter semester");
			int sem = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter course");
			String course = sc.nextLine();
			Statement s = con.createStatement();
			s.execute("UPDATE  student_details  set name = '"+name+"', sem = '"+sem+"',course = '"+course+"' WHERE id = '" + id + "' ");
			
		}
		con.close();
	}

}
