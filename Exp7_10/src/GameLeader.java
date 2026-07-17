import java.util.Random;
import java.util.Scanner;

public class GameLeader {
	private Random rand;
	private Scanner sc;

	//gameの準備
	public GameLeader() {
		this.rand = new Random();
		this.sc = new Scanner(System.in);
	}

	//Ranodomクラスを渡せる
	public Random getRandom() {
		return rand;
	}

	public Scanner getScanner() {
		return sc;
	}
	
	//一番最初の難易度決め
	public void startUp() {
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
