
public class Ens42_challenge2 {

	
	
	
	public static void main(String[] args) {
		String [] column = {"A","B","C","D","E"};
		for(int row = 1 ; row <= 5 ; row++) {
			for(int i = 0 ; i < column.length ; i++) {
				System.out.print(column[i] + row + " ");
				if(i == column.length-1) {
					System.out.println();
				}
			}
		}
	}

}
