import java.util.Random;


public class Ens43_challenge1 {

	public static void main(String[] args) {
		Random rand = new Random();
		int score;
		int average = 0;
		int passcount = 0;
		int no_passcount = 0;
		int i;
		
		for(i = 1 ; i <= 30 ; i++) {
			score = rand.nextInt(100);
			System.out.println(i + "人目：" + score);
			
			if(score >= 60) {
				passcount++;
			}else if(score < 60) {
				no_passcount++;
			}
			average += score;
			System.out.println();
		}
		average /= i;
		
		System.out.println("成績集計結果");
		System.out.println("平均点：" + average + "点");
		System.out.println("合格者数；" + passcount + "人");
		System.out.println("不合格者：" + no_passcount + "人");
		
	}

}
