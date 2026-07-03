public class FriendRobot {
	String name = "ロボ太";
	int battery = 100;
	
	void showStatus() {
		System.out.println("名前：" + name);
		System.out.println("バッテリー：" + battery + "%");
	}
	
	int workPartTime(int hours) {
		int hourlyWage = 1000;
		int money = hourlyWage * hours;
		
		System.out.println(money + "円稼いできました、どうぞ！");
		return money;
	}
	
	public void setName(String name) {
		this.name = name;
		battery -= 20;
	}
	
	public void charge() {
		battery += 40;
		System.out.println("充電しました！");
	}
}
