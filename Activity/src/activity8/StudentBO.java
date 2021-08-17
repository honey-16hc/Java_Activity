package activity8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentBO {
	
	
	public List<Student> getAll() throws Exception {
		Connection con = Database.getConnection();
		List<Student> student = new ArrayList<Student>();
		PreparedStatement ps = con.prepareStatement("select * from student_data");
		ResultSet rs = ps.executeQuery();
		System.out.println("Id-----NAME------SEM-------COURSE-----DATE");
		while(rs.next()) {
			student.add(new Student (rs.getInt(1), rs.getString(2),rs.getInt(3), rs.getString(4),rs.getDate(5).toLocalDate()));
		}
		return student;
	}
	
  public String insert(Student student) throws Exception {
	  Connection con = Database.getConnection();
	  Statement s = con.createStatement();
		s.execute("insert into student_data values("+student.getId()+",'"+student.getName()+"',"+student.getSem()+",'"+student.getCourse()+"','"+student.getDate()+"')");
	  return "Data innserted successfully";
  }
  
  public String update(Student student) throws Exception {
	  Connection con = Database.getConnection();
	  Statement s = con.createStatement();
	  s.execute("UPDATE  student_data  set name = '"+student.getName()+"', sem = '"+student.getSem()+"',course = '"+student.getCourse()+"',date = '"+student.getDate()+"' WHERE id = '" + student.getId() + "' ");
	  
	  return "Data updated successfully.";
  }
  
  public String delete(int id) throws Exception {
	  Connection con = Database.getConnection();
	  Statement s = con.createStatement();
	  s.execute("DELETE from student_data  WHERE id = '" + id + "' ");
	  
	  return "Deleted successfully.";
  }
}
