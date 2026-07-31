public class Teach2 {
	public static void main(String[] args) {
		//パターン１
		int num = 1;
		
		switch (num) {
		case 1:
			System.out.println("明日");
			break;
		case 2:	
			System.out.println("いくむ");			
			break;
		case 3:	
			System.out.println("いくお");
			break;
		default:
			System.out.println("にいお");
		}
		//パターン２
		
		switch (num) {
		case 1 -> 
		System.out.println("芦屋");
		case 2 -> 
		System.out.println("にいの");
		
		}
		
		//パターン３
		int score = 3;
		
		String resut = switch (score) {
		case 1 -> "悪い";
		case 2 -> {
			System.out.println("あした");
		yield "なつ";		
		}
		case 3 -> "いくむ";
		case 4 -> "不明";
		default -> "なにか";
		};
		
		//パターン４
		int num2 = 3;
		
		String result2 = switch (num2) {
		case 1 : System.out.println("sore");
		yield "あした";
		default : System.out.println("これ");
		yield "した";
		};
		
		
		
		
		
		
		
		
		
		
	}
}
