import java.util.Scanner;

public class SuperJankenGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("じゃんけんゲームを開始します\n\n");

		System.out.println("難易度を選んでください");
		System.out.println("１：めっちゃよわい");
		System.out.println("２：ふつう");
		System.out.println("３：めっちゃつよい");

		System.out.print("番号入力:");
		int judge = sc.nextInt();
		
		//モードの選択
		if (judge == 1) {
			Plan1 plan1 = new Plan1();
			plan1.gameStart();
		} else if (judge == 2) {
			Plan2 plan2 = new Plan2();
			plan2.gameStart();
		} else if (judge == 3) {
			Plan3 plan3 = new Plan3();
			plan3.gameStart();
		}

	}
}
