package activity4.problem5;

import java.util.Scanner;

public class Exceptions3 {

	public static void main(String[] args) throws Exception {
	String name ="";
	int age;
	
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter the player name");
	name = sc.nextLine();
	System.out.println("Enter the player age");
	age = sc.nextInt();
	if(age >= 19)
		System.out.println("Player name : " + name + "\n" + "Player age : " + age);
	else
		throw new CustomException();
	}

}
