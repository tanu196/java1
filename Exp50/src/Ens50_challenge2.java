import java.util.Scanner;

public class Ens50_challenge2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] foods = {
				"あんぱん" ,"メロンパン" , "カレーパン" ,
				"クロワッサン" , "食パン"
		};
		
		int[] price = {
				180,200,230,250,320
		};
		System.out.println("ーー商品メニューーーー");
		for(int i = 0 ; i < foods.length ; i++) {
			System.out.println(foods[i] + ":" + price[i] + "円");
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println();
		System.out.print("商品名を入力してください：");
		String infoods = sc.next();
		System.out.print("注文数を入力してください：");
		int count = sc.nextInt();
		System.out.println();
		boolean find = false;
		sc.close();
		for(int i = 0 ; i < foods.length ; i++) {
			if(foods[i].equals(infoods)) {
				System.out.println("商品名：" + foods[i]);
				System.out.println("単価：" + price[i] + "円");
				System.out.println("注文数：" + count + "個");
				System.out.println("合計金額：" + price[i] * count + "円");
				find = true;
			}
		}
		
		if(!find) {
			System.out.println("その商品は登録されていません");
		}
		
		
	}

}
