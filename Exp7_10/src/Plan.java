public class Plan {
	private GameLeader game;
	private int cpuHand;
	private int hand;

	public Plan() {
		game = new GameLeader();
		startUp();
	}

	//一番最初の難易度決め
	public void startUp() {
		System.out.println("じゃんけんゲームを開始します\n\n");

		System.out.println("難易度を選んでください");
		System.out.println("１：めっちゃよわい");
		System.out.println("２：ふつう");
		System.out.println("３：めっちゃつよい");

		System.out.print("番号入力:");
		int judge = game.getScanner().nextInt();

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

	public void winJudge() {
		boolean flag = false;
		while (!flag) {

			if (hand == 0 && cpuHand == 0) {//自分の手がグー
				System.out.println("あいこでやんす");
				System.out.println("もう一度じゃんけんします");
			} else if (hand == 0 && cpuHand == 1) {
				System.out.println("あなたの勝ちでやんす");
				System.out.println("ゲームを終了します");
				flag = true;
			} else if (hand == 0 && cpuHand == 2) {
				System.out.println("CPUの勝ちでやんす");
				System.out.println("ゲームを終了します");
				flag = true;
			}

			if (hand == 1 && cpuHand == 0) {//自分の手がチョキ
				System.out.println("CPUの勝ちでやんす");
				System.out.println("ゲームを終了します");
				flag = true;
			} else if (hand == 1 && cpuHand == 1) {
				System.out.println("あいこでやんす");
				System.out.println("もう一度じゃんけんします");
			} else if (hand == 1 && cpuHand == 2) {
				System.out.println("あなたの勝ちでやんす");
				System.out.println("ゲームを終了します");
				flag = true;
			}

			if (hand == 2 && cpuHand == 0) {//自分の手がパー
				System.out.println("あなたの勝ちでやんす");
				System.out.println("ゲームを終了します");
				flag = true;
			} else if (hand == 2 && cpuHand == 1) {
				System.out.println("CPUの勝ちでやんす");
				System.out.println("ゲームを終了します");
				flag = true;
			} else if (hand == 2 && cpuHand == 2) {
				System.out.println("あいこでやんす");
				System.out.println("もう一度じゃんけんします");
			}
		}

	}

}
