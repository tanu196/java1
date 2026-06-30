
public class Exp50_2 {

	public static void main(String[] args) {
		int[] scores = {80,65,90,78,45};
		int total = 0;
		
		
		for(int i = 0 ; i < scores.length ; i++) {
			total += scores[i];
			
		}
		
		
		
		
		double average = (double) total / scores.length;
		
		
		System.out.println("合格点：" + total);
		System.out.println("平均点：" + average);
		
	}

}
