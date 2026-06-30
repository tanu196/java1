
public class Exp51_2 {

	public static void main(String[] args) {
		int[] scores = {
				90,60,40,20
		};
		System.out.println("――交換前ーー");
		System.out.println("a:" + scores[0]);
		System.out.println("b:" + scores[1]);
		System.out.println("c:" + scores[2]);
		System.out.println("d:" + scores[3]);
		
		if(scores[0] > scores[1]) {
			int temp = scores[0];
			scores[0] = scores[1];
			scores[1] = temp;
		}
		
		if(scores[1] > scores[2]) {
			int temp = scores[1];
			scores[1] = scores[2];
			scores[2] = temp;
		}
		
		if(scores[2] > scores[3]) {
			int temp = scores[2];
			scores[2] = scores[3];
			scores[3] = temp;
		}
		
		if(scores[0] > scores[1]) {
			int temp = scores[0];
			scores[0] = scores[1];
			scores[1] = temp;
		}
		
		if(scores[1] > scores[2]) {
			int temp = scores[1];
			scores[1] = scores[2];
			scores[2] = temp;			
		}
		
		if(scores[0] > scores[1]) {
			int temp = scores[0];
			scores[0] = scores[1];
			scores[1] = temp;
		}
		
		System.out.println("――交換後ーー");
		System.out.println("a:" + scores[0]);
		System.out.println("b:" + scores[1]);
		System.out.println("c:" + scores[2]);
		System.out.println("d:" + scores[3]);
		
		
	}

}
