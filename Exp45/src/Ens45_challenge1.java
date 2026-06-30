import java.util.Random;


public class Ens45_challenge1 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		for(int i = 1 ; i <= 10 ; i++) {
			
			System.out.println("商品の検品を開始します");
			int score = rand.nextInt(40)+60;
			System.out.println(i + "個目の商品を検品をします");
			System.out.println("商品スコア：" + score);
			if(score >= 70) {
				System.out.println("検品結果：合格です");
			}else if(score < 70) {
				System.out.println("検品結果：不良品を検出しました");
				break;
			}
		}
		
		System.out.println("検品ラインを停止します");
		System.out.println("商品検品を終了します");
		
	}

}
