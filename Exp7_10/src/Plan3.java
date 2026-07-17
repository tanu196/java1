////めっちゃつよい
//public class Plan3 {
//	private GameLeader game;
//
//	public Plan3() {
//		game = new GameLeader();
//	}
//
//	public void gameStart() {
//		System.out.println("じゃんけんの手を選んでください");
//		System.out.println("０：グー");
//		System.out.println("１：チョキ");
//		System.out.println("２：パー");
//		System.out.print("番号を入力：");
//		int hand = game.getScanner().nextInt();
//		if (hand == 0) {
//			System.out.println("あなたの手：グー");
//		} else if (hand == 1) {
//			System.out.println("あなたの手：チョキ");
//		} else if (hand == 2) {
//			System.out.println("あなたの手：パー");
//		}
//
//		int cpuHand = 0;
//		if (hand == 1) {
//			cpuHand = 0;
//			System.out.println("CPUの手：グー\n\n");
//		} else if (hand == 2) {
//			cpuHand = 1;
//			System.out.println("CPUの手：チョキ\n\n");
//		} else if (hand == 0) {
//			cpuHand = 2;
//			System.out.println("CPUの手：パー\n\n");
//		}
//		if (hand == 0 && cpuHand == 0) {//自分の手がグー
//			System.out.println("あいこでやんす");
//			System.out.println("もう一度じゃんけんをします");
//		} else if (hand == 0 && cpuHand == 1) {
//			System.out.println("あなたの勝ちでやんす");
//			System.out.println("ゲームを終了します");
//		} else if (hand == 0 && cpuHand == 2) {
//			System.out.println("CPUの勝ちでやんす");
//			System.out.println("ゲームを終了します");
//		}
//
//		if (hand == 1 && cpuHand == 0) {//自分の手がチョキ
//			System.out.println("CPUの勝ちでやんす");
//			System.out.println("ゲームを終了します");
//		} else if (hand == 1 && cpuHand == 1) {
//			System.out.println("あいこでやんす");
//			System.out.println("もう一度じゃんけんをします");
//		} else if (hand == 1 && cpuHand == 2) {
//			System.out.println("あなたの勝ちでやんす");
//			System.out.println("ゲームを終了します");
//		}
//
//		if (hand == 2 && cpuHand == 0) {//自分の手がパー
//			System.out.println("あなたの勝ちでやんす");
//			System.out.println("ゲームを終了します");
//		} else if (hand == 2 && cpuHand == 1) {
//			System.out.println("CPUの勝ちでやんす");
//			System.out.println("ゲームを終了します");
//		} else if (hand == 2 && cpuHand == 2) {
//			System.out.println("あいこでやんす");
//			System.out.println("もう一度じゃんけんをします");
//		}
//	}
//
//}
