package First;

import java.util.Scanner;

public class MathTest1 {

	public static void main(String[] args) {
		
		int x = 20;
		
		// &&(AND)
		if(x > 30)
		{
			System.out.println("Its hot outside");
		}else if(x<=20 && x>=30) {
			System.out.println("Its warm outside");		
		}else {
			System.out.println("Its cold");
		}
		
		// ||(OR)
		// !(NOT)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("You are play game! Press q or Q to quit");
		String response = sc.next();
		
		if(!response.equals("q") || !response.equals("Q")) {
			System.out.println("You are still the game -->");
			
		}else {
			System.out.println("You quit the game! ");
		}
		
		
	}

}
