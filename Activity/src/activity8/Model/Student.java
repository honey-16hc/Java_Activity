package activity8.Model;

import java.time.LocalDate;
import java.util.Date;

public class Student {
	
	
	private int id;
	private String name;
	private int sem;
	private String course;
	private LocalDate date ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Student(int id, String name, int sem, String course, LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		this.sem = sem;
		this.course = course;
		this.date = date;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sem=" + sem + ", course=" + course + ", date=" + date + "]";
	}
	
	

}
