package First;
import java.util.Random;
public class RandomTest {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int x = rd.nextInt(6)+1;
		double y = rd.nextDouble();
		boolean z = rd.nextBoolean();
		
		
		System.out.println(y);

	}

}
