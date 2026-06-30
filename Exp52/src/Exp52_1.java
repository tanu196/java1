
public class Exp52_1 {

	public static void main(String[] args) {
		int[] scores = {40,70,30,60,20};
		
		System.out.println("――ソート前ーー");
		for(int i = 0 ; i < scores.length-1 ; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
	//--------------------------------------------------------	
		
		for(int i = 0 ; i < scores.length-1 ; i++) {
			int minIndex = i;
			
			for(int j = i+1 ; j < scores.length ; j++) {
				if(scores[j] < scores[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = scores[i];
			scores[i] = scores[minIndex];
			scores[minIndex] = temp;
		}
	//---------------------------------------------------------------------	
		System.out.println("――ソート後（小さい順）ーー");
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
	}
}