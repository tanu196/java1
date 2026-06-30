
public class Exp49_3 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a;
		
		System.out.println("再代入前");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		b =99;
		
		System.out.println("再代入後");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}

}
