package 練習１;

public class ShortCircuit {
	public static void main(String[] args) {
		int x = 5;
		if(x > 0 || x++ > 100){
			System.out.println("通過");
		}
		System.out.println("x = " + x);
	}
}
