//ふつう
public class Plan2 {
	private GameLeader game;

	public Plan2() {
		game = new GameLeader();
	}

	public void gameStart() {
		boolean flag = false;
		while (!flag) {

			System.out.println("じゃんけんの手を選んでください");
			System.out.println("０：グー");
			System.out.println("１：チョキ");
			System.out.println("２：パー");
			System.out.print("番号を入力：");
			int hand = game.getScanner().nextInt();
			if (hand == 0) {
				System.out.println("あなたの手：グー");
			} else if (hand == 1) {
				System.out.println("あなたの手：チョキ");
			} else if (hand == 2) {
				System.out.println("あなたの手：パー");
			}

			int cpuHand = game.getRandom().nextInt(3);
			if (cpuHand == 0) {
				System.out.println("CPUの手：グー");
			} else if (cpuHand == 1) {
				System.out.println("CPUの手：チョキ");
			} else if (cpuHand == 2) {
				System.out.println("CPUの手：パー");
			}
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
