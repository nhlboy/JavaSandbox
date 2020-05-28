package _StarWalker;

import java.util.Scanner;

public class Idiot {
	public static void main(String[] args) {
		int day;
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Please eneter the number from 1 to 7");
day = sc.nextInt();
		
 if(day < 1 || day > 7) {
 System.out.println("Are you an Idiot?! I did ask you to enter number from 1 to 7");
}

		switch(day) {
			case 1:
				System.out.println("1 is for Monday");
				break;
			case 2:
				System.out.println("2 is for Tuesday");
				break;
			case 3:
				System.out.println("3 is for Wednesday");
				break;
			case 4:
				System.out.println("4 is for Thursday");
				break;
			case 5:
				System.out.println("5 is for Friday");
				break;
			case 6:
				System.out.println("6 is for Saturday");
				break;
			case 7:
				System.out.println("7 is for Sunday");
 

				
		}
	}
}