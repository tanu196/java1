
public class Ens43_challenge2 {

	public static void main(String[] args) {
		char A = 64;
		int column = 1;
		System.out.println("座席予約状況");
		for(int i = 1 ; i <= 4 ; i++) {
			System.out.println();
		for(int b = 1 ; b < 7 ; b++ ) {
			System.out.print((char)(A + i));
			if(A + i == 66 && b == 3) {
				System.out.print(b + "× ");
			}else if(A + i == 67 && b == 5) {
				System.out.print(b + "× ");
			}else {
				System.out.print(b + "○ ");				
			}
			
		}
			
			
			
		}
		
		
	}

}
