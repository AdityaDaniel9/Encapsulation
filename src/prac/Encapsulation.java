package prac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Encapsulation {
	
	public static void main(String[] a) {
		
		
		Scanner sb = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name;
		
			name = sb.nextLine();
		
		
		
		boolean valid = false;
		boolean valid2 = false;
		int age = 0;
		System.out.print("Enter Your Age :  ");
		while(!valid) {
			
			
		try {
			 age = sb.nextInt();
			valid = true;
		} catch (InputMismatchException e) {
			
			System.out.println("This is not a valid age please enter correct age : ");
			sb.next();
			
		}
		}
		
	    Variables person = new Variables();
    	person.setAge(sb);
	    person.setName(sb)  ;
	
	
    	Scanner sb2 = new Scanner(System.in);
	    System.out.println("Enter Your 2nd Name");
	    
	    
	    String name1 = sb2.nextLine();	
	    
	    
	    
	   
      	System.out.println("Enter Your Age");
      	int age1=0;
         while(!valid2) {
	       try {
			age1 = sb2.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("This is not a valid age please enter correct age : ");
			sb2.next();
			
		}
         }
         System.out.print(   "Your Name is "+ name   );
 		System.out.println(" and age is "+ age);
 	    System.out.print("Your name is " +name1);
 	    System.out.println(" and age is " +age1);
 	    
	    Variables person2 = new Variables();
	    person2.setAge(sb2);
	    person2.setName(sb2);
		
		
		sb.close();
		sb2.close();
		
		
		
		
		
		
	}

}
