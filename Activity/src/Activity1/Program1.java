package Activity1;

import java.util.*;
import java.io.*;
public class Program1 {
 public static void main(String args[]) {
	 
	 Scanner sc = new Scanner(System.in);
	 int salary = sc.nextInt();
	 int shifts = sc.nextInt();
	 int sav = calculateSal(salary,shifts);
	 
	 if (sav == 1)
	 System.out.println("Salary too large");
	 else if(sav == 2)
		 System.out.println("Shifts too small");
	 else if(sav == 3)
		 System.out.println("Salary too small");
	 else
		 System.out.println(sav);
 }
	
	
	public static int calculateSal(int salary, int shifts) {
		int saving = 0;
		if(salary > 8000)
		{
			return 1;
		}
		else if(shifts < 0) {
			return 2;
		}
		else if(salary < 0)
		{
			return 3;
		}
		int food =  (20 * salary)/100;
		int travel =(30 * salary)/100;
		int shiftCost = ((2 * salary)/100) * shifts;
		saving = salary + shiftCost - food - travel;
		
		return saving;
	}
}
