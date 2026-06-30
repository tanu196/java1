
public class Ens51_challenge1 {

	public static void main(String[] args) {
		char[] letters = {
				'm', 'K', 'y', 'D', 'a', 'X', 'j', 'R', 'b', 'P',
				's', 'C', 'v', 'L', 'e', 'W', 'h', 'N', 'z', 'I',
				'u', 'F', 'q', 'O', 't', 'B', 'k', 'Y', 'c', 'S',
				'g', 'H', 'w', 'A', 'p', 'V', 'n', 'E', 'r', 'M',
				'x', 'J', 'd', 'U', 'i', 'T', 'f', 'Z', 'l', 'G',
				'o', 'Q'
		};
		System.out.println("ーー処理前ーー");
		for(int i = 0 ; i < letters.length ; i++) {
			System.out.print(letters[i]);
			System.out.print(" ");
		}
		System.out.println();
		for (int j = 0; j < letters.length - 1; j++) {

			for (int i = 0; i < letters.length - 1 - j; i++) {
				if (letters[i] > letters[i + 1]) {
					int temp = letters[i];
					letters[i] = letters[i + 1];
					letters[i + 1] = (char) temp;
				}

			}
		}
		System.out.println("ーーソート完了後ーー");
		for(int i = 0 ; i < letters.length ; i++) {
			System.out.print(letters[i]);
			System.out.print(" ");
		}
		System.out.println();

	}

}
