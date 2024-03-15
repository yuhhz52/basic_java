package First;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Sushi");
		food.add("Kimchi");
		food.add("Pho");
		
		food.set(0, "Banhmi");
		food.remove(2);
		food.clear();
		
		for(int i=0; i<food.size(); i++) {
		System.out.println(food.get(i));
		}

	}

}
