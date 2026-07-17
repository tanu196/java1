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
			cpuHand();
			myHand();
			winJudge();
		} else if (judge == 2) {
			myHand();
			cpuHand();
			winJudge();
		} else if (judge == 3) {
			myHand();
			strongCpu();
			winJudge();
		}
	}

	public void myHand() {//自分の手を決める
		System.out.println("じゃんけんの手を選んでください");
		System.out.println("０：グー");
		System.out.println("１：チョキ");
		System.out.println("２：パー");
		System.out.print("番号を入力：");
		hand = game.getScanner().nextInt();
		if (hand == 0) {
			System.out.println("あなたの手：グー");
		} else if (hand == 1) {
			System.out.println("あなたの手：チョキ");
		} else if (hand == 2) {
			System.out.println("あなたの手：パー");
		}
	}

	public void cpuHand() {
		cpuHand = game.getRandom().nextInt(3);
		if (cpuHand == 0) {
			System.out.println("CPUの手：グー");
		} else if (cpuHand == 1) {
			System.out.println("CPUの手：チョキ");
		} else if (cpuHand == 2) {
			System.out.println("CPUの手：パー");
		}
	}

	public void winJudge() {//勝敗判定

		if (hand == 0 && cpuHand == 0) {//自分の手がグー
			drowShow();
			startUp();
		} else if (hand == 0 && cpuHand == 1) {
			winShow();
		} else if (hand == 0 && cpuHand == 2) {
			loseShow();
		}

		if (hand == 1 && cpuHand == 0) {//自分の手がチョキ
			loseShow();
		} else if (hand == 1 && cpuHand == 1) {
			drowShow();
			startUp();
		} else if (hand == 1 && cpuHand == 2) {
			winShow();
		}

		if (hand == 2 && cpuHand == 0) {//自分の手がパー
			winShow();
		} else if (hand == 2 && cpuHand == 1) {
			loseShow();
		} else if (hand == 2 && cpuHand == 2) {
			drowShow();
			startUp();
		}
	}

	public void winShow() {//表示
		System.out.println("あなたの勝ちでやんす");
		System.out.println("ゲームを終了します");
	}

	public void loseShow() {//表示
		System.out.println("CPUの勝ちでやんす");
		System.out.println("ゲームを終了します");
	}

	public void drowShow() {//表示
		System.out.println("あいこでやんす");
		System.out.println("もう一度じゃんけんします");
	}
	
	
	
	//cpu強い時のモード
	public void strongCpu() {
		if (hand == 1) {
			cpuHand = 0;
			System.out.println("CPUの手：グー");
		} else if (hand == 2) {
			cpuHand = 1;
			System.out.println("CPUの手：チョキ");
		} else if (hand == 0) {
			cpuHand = 2;
			System.out.println("CPUの手：パー");
		}
	}

}
