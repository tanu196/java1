
public class Exp46_1 {

	public static void main(String[] args) {
		for(int number = 1 ; number <= 5 ; number++) {
			if(number < 4) {
				continue;
			}
			
			System.out.println(number + "番の方を確認します");
		}
	}

}
