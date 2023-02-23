package wrapper;

public class WrapperTest {
	public static void main(String[] args) {
		int num = 7;
		Integer num1 = num;
		
		int num2 = num1;
		System.out.println(num2);
		
		String str = "12";
		int num3 = num1.parseInt(str);
		System.out.println(num3*2);
	}
}
