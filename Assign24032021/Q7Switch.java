package Assignments.Assign24032021;

import java.util.Scanner;

public class Q7Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		
		switch(number) {
		case 0:
			System.out.println("pressed 0");
			break;
			
		case 1:
			System.out.println("pressed 1");
			break;
			
		case 2:
			System.out.println("pressed 2");
			break;
			
		case 3:
			System.out.println("pressed 3");
			break;
			
		case 4:
			System.out.println("pressed 4");
			break;
			
		case 5:
			System.out.println("pressed 5");
			break;
			
		default:
			System.out.println("Not Allowed");
			break;
		}
	}

}
