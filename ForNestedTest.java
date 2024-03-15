package First;

import java.util.Scanner;

public class ForNestedTest {
	
	public static void main (String args[]) {
		//nested loops = a lopp inside of a loop
		
		Scanner sc = new Scanner(System.in);
		
		int rows;
		int columns;
		String sybol = "";
		
		System.out.println("Enter rows: ");
		rows =sc.nextInt();
		System.out.println("Enter columns: ");
		columns =sc.nextInt();
		System.out.println("Enter sybol to use: ");
		sybol =sc.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=columns; j++) {
				System.out.print(sybol);
			}
		}
	}

}
