
public class Item {//商品
	private String itemName;
	private int price;
	private int quantity;
	
	int getSubtotal() {
		return price * quantity;
	}
	
	public Item() {
		
	}
	
	
	
	public Item(String itemName , int price , int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
	
	void showItemInfo() {
		System.out.println("商品名：" + itemName);
		System.out.println("単価：" + price + "円");
		System.out.println("個数：" + quantity + "個");
		System.out.println("小計：" + getSubtotal() + "円");
	}
}
