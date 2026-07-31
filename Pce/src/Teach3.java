public class Teach3 {
	public static void main(String[] args) {
		int menu = 2;

		//普通のswitch文
		switch (menu) {
		case 1:
			System.out.println("水を選びました");
			break;
		case 2:
			System.out.println("お茶を選びました");
			break;
		case 3:
			System.out.println("ジュースを選びました");
			break;
		default:
			System.out.println("その番号の商品はありません。");
			break;
		}

		//普通のswitch式

		int dayNumber = 0;
		String dayOfWeek = switch (dayNumber) {
		case 1 -> "金曜日";
		case 2 -> "土曜日";
		case 3 -> "日曜日";
		case 4 -> {
			System.out.println("なみ");
			yield "月曜日";
		}
		case 5 -> "火曜日";
		case 6 -> "木曜日";
		default -> {
			System.out.println("ア塩田");
			yield "不明";
		}
		};

		//アローswitch文
		String num = "";

		switch (dayNumber) {
		case 1 -> num = "金曜日";
		case 2 -> num = "土曜日";
		default -> num = "不明";

		}
		
		int month = 3;
		
		String season = switch (month) {
		
		case 1,2,3:
			System.out.println("暖かい");
			System.out.print("nanika");
			yield "はる";
		default:
			yield "不明";
		};
		
		System.out.println("判定終了");
		
		
		
		
	}
}
