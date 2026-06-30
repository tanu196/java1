
public class Exp49_4 {

	public static void main(String[] args) {
		int[] arrayA = {10,20,30};
		int[] arrayB = arrayA;
		
		System.out.println("変更前");
		System.out.println("arrayA[1]" + arrayA[1]);
		System.out.println("arrayB[1]" + arrayB[1]);
		
		arrayB[1] = 99;
		
		System.out.println("変更後");
		System.out.println("arrayA[1]" + arrayA[1]);
		System.out.println("arrayB[1]" + arrayB[1]);
		
		
	}

}
