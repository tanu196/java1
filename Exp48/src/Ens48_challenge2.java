import java.util.Random;


public class Ens48_challenge2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int lastrate = rand.nextInt(100)+1;
		String[] rare = {
				new String("UR"),
				new String("SSR"),
				new String("SR"),
				new String("R"),
				new String("N")
		};
		
		System.out.println("ーーー１０連ガチャーーー");
		
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println();
			int rate = rand.nextInt(100)+1;
			System.out.print( i +"個目：");
			if(rate <= 40) {
				System.out.print(rare[4]);
			}else if(rate <= 65) {
				System.out.print(rare[3]);
			}else if(rate <= 85) {
				System.out.print(rare[2]);
			}else if(rate <= 95) {
				System.out.print(rare[1]);
			}else if(rate <= 100) {
				System.out.print(rare[0]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("ーーー⋆SR以上確定⋆ーーー");
		System.out.println();
		
		if(lastrate <= 54) {
			System.out.println("10個目：" + rare[2]);
		}else if(lastrate <= 82){
			System.out.println("10個目：" + rare[1]);
		}else {
			System.out.println("10個目：" + rare[0]);
		}
	}

}
