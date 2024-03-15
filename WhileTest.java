package First;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		
	/*	while(name.isBlank())// kt dk moi thuc thi khoi lenh ben duoi 
			{
			System.out.print("Enter your name: ");
			name = sc.nextLine();		
		}
		System.out.println("Hi " +name);
		*/
		do{
		System.out.print("Enter your name: ");
		name = sc.nextLine();		
	    }while(name.isBlank());
	
	   System.out.println("Hi " +name);

	}

}
