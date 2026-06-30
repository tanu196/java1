
public class Exp52_2 {

	public static void main(String[] args) {
		String[] names = {"井上","佐々木","田中","前田","山田"};
		int[] scores = {40,70,30,60,20};
		System.out.println("――ソート前ーー");
		for(int i = 0 ; i < names.length ; i++) {
			System.out.print(names[i] +" ");
		}
		//--------------------------------------------
		for(int i = 0 ; i < names.length-1 ; i++) {
			int minIndex = i;
			for(int j = i ; j < names.length ; j++) {
				if(scores[j] < scores[minIndex]) {
					minIndex = j;
				}
			}
			int tempScore = scores[i];
			scores[i] = scores[minIndex];
			scores[minIndex] = tempScore;
			
			String tempName = names[i];
			names[i] = names[minIndex];
			names[minIndex] = tempName;
			
		}
		
		//---------------------------------------------
		System.out.println();
		System.out.println("――ソート後（小さい順）ーー");
		for(int i = 0 ; i < names.length ; i++) {
			System.out.print(names[i] +" ");
		}
	}

}
