package First;

public class OverloadedMethods {

	public static void main(String[] args) {
		
		int x = add(1,6,8);
		System.out.println(x);
		
	}	
		static int add(int a, int b) {
			System.out.println("This is overloaded methods ");
			return a+b;
		}
		static int add(int a, int b, int c) {
			System.out.println("This is overloaded methods ");
			return a+b+c;	
		}
		static int add(int a, int b, int c, int d) {
			System.out.println("This is overloaded methods ");
			return a+b+c+d;

		}

}
