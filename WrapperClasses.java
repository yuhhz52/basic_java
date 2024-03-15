package First;

public class WrapperClasses {

	public static void main(String[] args) {
		
		// lớp trình bao bọc = cung cấp cách sử dụng các kiểu dữ liệu nguyên thủy làm kiểu dữ liệu tham chiếu
		// kiểu dữ liệu tham chiếu chứa các phương thức hữu ích
		// có thể được sử dụng với các bộ sưu tập (ex.ArrayList)
		
		//primitive		//wrapper
		//---------	   //-------
		// boolean		Boolean
		// char			Character
		// int			Integer
		// double		Double
		
		// autoboxing = sự chuyển đổi tự động mà trình biên dịch Java thực hiện giữa các kiểu nguyên thủy và các lớp bao bọc đối tượng tương ứng của chúng
		// unboxing = đảo ngược của autoboxing. Tự động chuyển đổi lớp bao bọc thành nguyên thủy
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		
	}
	
}

