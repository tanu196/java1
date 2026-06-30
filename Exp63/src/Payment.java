
public class Payment {//お金の処理
	int payment;
	int total;
	
	
	public Payment(int payment) {
		this.payment = payment;
	}
	
	
	public void checkPayment() {
		if(payment >= total) {
			System.out.println("購入できます");
			System.out.println("おつり：" + (payment - total) + "円");
		}else {
			System.out.println("金額が足りません");
		}
	}
}
