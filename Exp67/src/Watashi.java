
public class Watashi {

	public static void main(String[] args) {
		FriendRobot robot = new FriendRobot();
		
		int money = robot.giveMoney();
		
		System.out.println("受け取った金額：" + money + "円");
		
		int wallet = 0; 
		
		wallet += robot.giveMoney();
		System.out.println("財布の中身：" + wallet + "円");
		wallet += robot.giveMoney();
		System.out.println("財布の中身：" + wallet + "円");
		wallet += robot.giveMoney();
		System.out.println("財布の中身：" + wallet + "円");
		
		
		

	}

}
