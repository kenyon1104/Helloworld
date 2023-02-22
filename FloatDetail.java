public class FloatDetail {
	public static void main(String[] args) {
		float num2 = 1.1f;
		double num3 = 1.1;
		double num4 = 1.1f;
		double num5 = .20929;
		double num6 = .123456789;
		double num7 = .123456789f;
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		//浮点型陷阱
		double num8 = 2.7;
		double num9 = 8.1 / 3;
		System.out.println(num8);
		System.out.println(num9);
		if(num8 == num9) {
			System.out.println("相等");
		}
		if(Math.abs(num8 - num9)<0.0000001) {
			System.out.println("差值非常小，认为相等");
		}
	}
}