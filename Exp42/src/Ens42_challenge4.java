
public class Ens42_challenge4 {

	
	
	
	public static void main(String[] args) {
		for(int row = 1 ; row <= 5 ; row++) {
			String result = switch (row) {
			case 1 -> "A" + row ;
			case 2 -> "B" + row ;
			case 3 -> "C" + row ;
			case 4 -> "D" + row ;
			default -> "E"+ row;
			};
			System.out.println(result);
			
		}
	}

}
