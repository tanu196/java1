
public class Exp50_3 {

	public static void main(String[] args) {
		int [] scores = {90,76,45,34,76,90,89,87};
		int passcount = 0 ;
		for(int i = 0 ; i <scores.length ; i++) {
			if(scores[i] >= 80) {
				System.out.println(scores[i]);
				passcount++;
			}
			
		}
		System.out.println("合格者：" + passcount + "人");
	}

}
