
public class Watashi4 {
	public static void main(String[] args) {
		FriendRobot robot = new FriendRobot();
		
		int wallet = 0;
		
		wallet += robot.giveMoneyTimes(1);
		
		System.out.println("財布の中身：" + wallet + "円");
		wallet += robot.giveMoneyTimes(3);
		
		System.out.println("財布の中身：" + wallet + "円");
		wallet += robot.giveMoneyTimes(5);
		
		System.out.println("財布の中身：" + wallet + "円");
		
	}
}
