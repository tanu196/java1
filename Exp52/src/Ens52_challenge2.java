
public class Ens52_challenge2 {

	public static void main(String[] args) {
		String[] names = { "井上", "加藤", "佐々木", "高橋", "田中", "前田", "山田", "吉田" };
		int[] examScores = { 90, 75, 85, 90, 75, 60, 75, 50 };
		int[] interviewScores = { 8, 7, 6, 9, 5, 4, 8, 7 };

		System.out.println("ーーーソート前ーーー");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);

		}

		for (int i = 0; i < names.length-1; i++) {
			int minIndex = i;
			for (int j = i; j < names.length; j++) {
				if (examScores[j] > examScores[minIndex])
					minIndex = j;
				else if (examScores[j] == examScores[minIndex]) {
					if (interviewScores[j] > interviewScores[minIndex]) {
						minIndex = j;
					}
				}
			}
			String temp1 = names[i];
			names[i] = names[minIndex];
			names[minIndex] = temp1;
			
			int temp2 = examScores[i];
			examScores[i] = examScores[minIndex];
			examScores[minIndex] = temp2;
			
			int temp3 = interviewScores[i];
			interviewScores[i] = interviewScores[minIndex];
			interviewScores[minIndex] = temp3;
		}

		System.out.println();
		System.out.println("ーーーソート後ーーー");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);

		}
	}

}
