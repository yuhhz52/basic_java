package First;

public class ArrayTest {

	public static void main(String[] args) {
		// array = used to store multiple values within a single variable
		
		String[] cars = new String[3];
		
		cars[0] = "Tesla";
		cars[1] = "BWM";
		cars[2] = "Macoro";
		
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}

	}

}
