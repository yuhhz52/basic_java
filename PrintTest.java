package First;

public class PrintTest {
	public static void main(String[] args) {
		// printf() = một phương thức tùy chọn để điều khiển, định dạng và hiển thị văn bản trên cửa sổ bảng điều khiển
		// hai đối số = chuỗi định dạng + (đối tượng/biến/giá trị)
		// % [cờ] [độ chính xác] [chiều rộng] [ký tự chuyển đổi]
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
			
		// [ký tự chuyển đổi]
		//System.out.printf("%b",myBoolean);
		//System.out.printf("%c",myChar);
		//System.out.printf("%s",myString);
		//System.out.printf("%d",myInt);
		//System.out.printf("%f",myDouble);
		
		//[chiều rộng]
		// số ký tự tối thiểu được ghi làm đầu ra
		//System.out.printf("Hello %10s",myString);
		
		//[độ chính xác]
		// đặt số chữ số chính xác khi xuất giá trị dấu phẩy động
		//System.out.printf("You have this much money %.1f",myDouble);
		
		// [cờ]
		// thêm hiệu ứng vào đầu ra dựa trên cờ được thêm vào bộ xác định định dạng
		// - : căn lề trái
		// + : xuất ra dấu cộng (+ ) hoặc dấu trừ ( - ) cho một giá trị số
		// 0 : các giá trị số được đệm bằng 0
		// , : dấu phân cách nhóm bằng dấu phẩy nếu số > 1000
		
		//System.out.printf("You have this much money %,f",myDouble);
	}


}
