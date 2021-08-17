package activity8;


import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StudentBO bo = new StudentBO();
		System.out.println("Enter your choice" + "\n" + " 1. View Details" +  "\n" +" 2. Insert Details" +  "\n" +" 3. Delete Details"  +  "\n" +" 4. Update Details");
		int n = sc.nextInt();
		sc.nextLine();
		
		
		if(n == 1) {
			List<Student> st = bo.getAll();
			for(Student s:st)
				System.out.println(s);
			}
			
		if(n == 2) {
			System.out.println("Enter Name");
			String name = sc.nextLine();
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter semester");
			int sem = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter course");
			String course = sc.nextLine();
			LocalDate date = LocalDate.now();
            Student stu = new Student(id,name,sem,course,date);
			String s = bo.insert(stu);
			System.out.println(s);
		}
		
		else if(n == 3) {
			System.out.println("Enter id to be deleted");
			int id = sc.nextInt();
			String s = bo.delete(id);
			System.out.println(s);
			
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
		LocalDate date = LocalDate.now();
        Student stu = new Student(id,name,sem,course,date);
		String s = bo.update(stu);
		System.out.println(s);
		}
	}

}
