package First;

import java.util.ArrayList;

public class ArrayList2DTest {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> grocery = new ArrayList();
		
		ArrayList<String> flower = new ArrayList();
		flower.add("Hoa dao");
		flower.add("Hoa mai");
		flower.add("Hoa cuc");
		
		ArrayList<String> drink = new ArrayList();
		drink.add("Soda");
		drink.add("Sanban");
		drink.add("Caco");
		
		ArrayList<String> tree = new ArrayList();
		tree.add("Bo");
		tree.add("Thong");
		tree.add("Kiem");
		
		grocery.add(flower);
		grocery.add(drink);
		grocery.add(tree);
		
		
		System.out.println(grocery.get(1).get(2));

	}

}
