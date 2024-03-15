package First;
import java.util.Scanner;
public class MathTest {

	public static void main(String[] args) {
		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x, y);
		double a = Math.min(x, y);
		double b = Math.abs(y);// gia tri tuyet doi
		double c = Math.sqrt(y);// can bat 2
		double d = Math.round(x);// chuyen ve so int
		double e = Math.ceil(x);// lam tron int tang
		double g = Math.floor(x);// lam tron int giam
		
		System.out.println(d);
		
		// exp : Tim canh huyen
		double p,u,i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter side p: ");
		p = sc.nextDouble();
		System.out.println("Enter side u: ");
		u = sc.nextDouble();
		
		i = Math.sqrt((p*p)+(u*u));
		
		System.out.println("The hypotenuse is: "+i);
		sc.close();
	}
}
