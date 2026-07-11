package 練習１;

public class ForIfPractice {

	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 1 ; i <= 20 ; i++) {
			if(i % 3 == 0) {
				System.out.println(i + "は３の倍数です");
				count++;
			}
		}
		System.out.println("３の倍数は" + count + "個です");
	}

}
