
public class Exp51_3 {

	public static void main(String[] args) {
		int[] scores = {
				70, 40, 90, 60, 80
		};
		System.out.println("――処理前ーー");
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + "");
		}
		System.out.println();
		for (int j = 0; j < scores.length - 1; j++) {

			for (int i = 0; i < scores.length - 1 - j; i++) {
				if (scores[i] < scores[i + 1]) {
					int temp = scores[i];
					scores[i] = scores[i + 1];
					scores[i + 1] = temp;
				}
			}
		}
		System.out.println("――ソート完了後ーー");
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + "");
		}
		System.out.println();
	}

}
