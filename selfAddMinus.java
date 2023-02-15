 public class selfAddMinus{
	 public static void main(String[] args) {
		 int a = 3;
		 int b = ++a;
		 int f = 3;
		 int c = --f;
		 int g = 3;
		 int d = g++;
		 int h = 3;
		 int e = h--;
		 System.out.println("自增运算后的值是" + b);
		 System.out.println("自减运算后的值是" + c);
		 System.out.println("先取值后自增的值是" + d);
		 System.out.println("先取值后自减的值是" + e);
	 }
 }