public class ShoppingCart {//計算処理
	private Item item1;
	private Item item2;
	private int discount;
	
	public ShoppingCart() {
		
	}
	public ShoppingCart(int discount) {
		this.discount = discount;
	}
	
	public ShoppingCart(Item item1 , Item item2 , int discount) {
		this.item1 = item1;
		this.item2 = item2;
		this.discount = discount;
	}
	
	
	
	 public int getTotal() {
		return item1.getSubtotal() + item2.getSubtotal();
	}
	
	public int getDiscountedTotal() {
		return getTotal() - discount;
	}
	
	public void showTotalInfo() {
		System.out.println("合計：" + getTotal() + "円");
		System.out.println("割引：" + discount + "円");
		System.out.println("割引後の合計：" + getDiscountedTotal() + "円");
		
	}
	
	

}
