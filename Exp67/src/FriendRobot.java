
public class FriendRobot {
	int giveMoney() {
		return 500;
	}
	
	public String sayHello() {
		return "こんにちは！";
	}
	
	public int giveMoneyTimes(int count) {
		return 500 * count;
	}
	
	public String sayHello2(String name) {
		return name + "さん、こんにちは！";
	}
	
	String sayHelloByHour(int hour) {
		if(hour < 12) {
			return "おはよう";
		}else if(hour < 18) {
			return "こんにちは";
		}else {
			return "こんばんは";
		}
	}
}
