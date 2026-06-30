import java.util.Random;

class Ens49_challenge1 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] topcount = new int[3];
		String topName = "";
		int count;
		int max = 0;

		for (int i = 0; i < 3; i++) {
			count = rand.nextInt(100) + 1;
			if (i == 0) {
				topcount[0] = count;
				System.out.println("red配列の要素数：" + count);
			} else if (i == 1) {
				topcount[1] = count;
				System.out.println("blue配列の要素数：" + count);
			} else {
				topcount[2] = count;
				System.out.println("green配列の要素数：" + count);
			}
		}
		max = topcount[0];
		for (int i = 0; i < topcount.length; i++) {
			if (max < topcount[i]) {
				max = topcount[i];
			}
		}
		if (max == topcount[0]) {
			topName = "red配列";
		} else if (max == topcount[1]) {
			topName = "blue配列";

		} else if (max == topcount[2]) {
			topName = "green配列";
		}

		System.out.println("今回の１位：" + topName + " (要素数" + max + ")");

	}
}