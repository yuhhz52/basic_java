package First;

import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("What is yoour name?");
		String name = sc.nextLine();
		System.out.println("How old are you?");
		int age = sc.nextInt();
		sc.nextLine();//chong troi lenh
		System.out.println("What is your favorite food?");
		String food = sc.nextLine();
		
		System.out.println("Hello " +name);
		System.out.println("How are "+age+" years old");
	    System.out.println("You like "+food);
	}
	

}
