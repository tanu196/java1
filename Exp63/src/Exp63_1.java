
public class Exp63_1 {

	public static void main(String[] args) {
		
		String itemName = "ノート";
		int price = 120;
		int quantity = 3;
		int payment = 500;
		
		int total = price * quantity;
		
		//会計情報の出力
		System.out.println("商品名：" + itemName);
		System.out.println("単価：" + price + "円");
		System.out.println("個数：" + quantity + "個");
		System.out.println("合計：" + total + "円");
		
		//会計処理
		if(payment >= total) {
			System.out.println("購入できます");
			System.out.println("おつり：" + (payment - total) + "円");
			
		}else {
			System.out.println("金額が足りません");
		}
		

	}

}
