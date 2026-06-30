
public class Exp54_3 {

	public static void main(String[] args) {
		int[][] scores = {
				{ 80, 70 },
				{ 65, 90 },
				{ 75, 85 }
		};
		int passCountClass1 = 0;
		int passCountClass2 = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.print("学生" + (i + 1) + ":");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print("科目" + (j + 1) + "_" + scores[i][j] + "点" + " ");
				if (j == 0 && scores[i][j] >= 80) {
					passCountClass1++;
				}else if(j == 1 && scores[i][j] >= 80) {
					passCountClass2++;
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("成績優秀者数");
		System.out.println("科目１：" + passCountClass1 + "人");
		System.out.println("科目２：" + passCountClass2 + "人");
	}

}
