import java.util .Random;
public class Ens53_challenge1 {

	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("じゅあ、この問題の答えはなんですか？");
		String[][] name = {
				{ "佐藤" , "鈴木" , "高橋" , "田中" },
				{ "伊藤" , "山本" , "渡辺" , "中村" },
				{ "小林" , "加藤" , "吉田" , "山田" },
		};
		int raw = rand.nextInt(3);
		int col = rand.nextInt(4);
		System.out.println( "前から" + (raw+1) + "番目、左から" 
		+ (col+1) + "番目の" + name[raw][col] + "さん、回答してください。");
		
		
	}

}
