package First;

public class Array2DTest {

	public static void main(String[] args) {
		// array 2d
		//exp          0   1  2
		//           0 o1  o2 o3
		//           1 o4  o5 o6
		 //          2 o7  o8 o9
		
		String[][] cars = new String[3][3];
		
		cars[0][0] = "Oto1";
		cars[0][1] = "Oto2";
		cars[0][2] = "Oto3";
		cars[1][0] = "Oto4";
		cars[1][1] = "Oto5";
		cars[1][2] = "Oto6";
		cars[2][0] = "Oto7";
		cars[2][1] = "Oto8";
		cars[2][2] = "Oto9";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]);
				
			}
		}
		
		
		

	}

}
