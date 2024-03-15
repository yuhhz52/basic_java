package First;

import java.util.ArrayList;

public class ForEachTest {

	public static void main(String[] args) {
		
		//String[] animals = {"Cat","Dog","Brid","Rad"};
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Brid");
		animals.add("Rad");
		
		for(String i : animals) {
			System.out.println(i);
		}

	}

}
