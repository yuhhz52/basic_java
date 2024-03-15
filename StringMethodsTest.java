package First;

public class StringMethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Cat";
	//	boolean res = name.equals("cat");// kt chuoi co bang nhau ko
	//	boolean res = name.equalsIgnoreCase("cat");// nt, ko phan biet viet hoa
	//	int res = name.length();// kt do dai
	//	char res = name.charAt(0);// tra ve 1 kis tu don
	//	int res = name.indexOf('a');// tra ve vi tri
	//  boolean res = name.isEmpty();// kt chuoi trong
	//  boolean res = name.isBlank();//kt moi ki tu trong chuoi co phai la khoang trong hay k
	//  String res = name.toUpperCase();// all = hoa
	//  String res = name.toLowerCase();// all = thuong
	//  String res = name.trim();// xoa khoang trong
	    String res = name.replace('C',' ');
		System.out.println(res);
		

	}

}
