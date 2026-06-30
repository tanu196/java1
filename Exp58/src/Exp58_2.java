
public class Exp58_2 {

	public static void main(String[] args) {
		int[] scores = { 85, 72, 90, 58, 76 };
		int total = 0;

		for (int score : scores) {
			if (score >= 80) {

				System.out.println("点数：" + score);
				total++;
			}

		}

		System.out.println("80点以上の人数：" + total + "人");

	}

}

