
public class Ens51_challenge2 {

	public static void main(String[] args) {
		int[] scores = {50, 40, 30, 20, 10}; 
		
		System.out.println("ーー処理前ーー");
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.print(scores[i]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println();
		
		
		for(int i = 0 ; i < scores.length-1 ; i++) {
			System.out.print("パス" + (i+1) + "回目終了時：");
			
			for(int j = 0 ; j < scores.length-1-i ; j++) {
				if(scores[j] > scores[j+1]) {
					int temp = scores[j];
					scores[j] = scores[j+1];
					scores[j+1] = temp;
				}
			}
			for(int k = 0 ; k < scores.length ; k++) {
				System.out.print(scores[k] + " ");						
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("ーーソート完了後ーー");
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.print(scores[i]);
			System.out.print(" ");
		}
		
		
	}

}
