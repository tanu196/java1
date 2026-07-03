
public class Watashi3 {

	public static void main(String[] args) {
		FriendRobot robot = new FriendRobot();
		
		String message = robot.sayHello();
		
		System.out.println(message);
		
		int wallet = 0;
		
		wallet += robot.giveMoney();
		System.out.println("財布の中身：" + wallet + "円");
		wallet += robot.giveMoney();
		System.out.println("財布の中身：" + wallet + "円");
		wallet += robot.giveMoney();
		System.out.println("財布の中身：" + wallet + "円");

	}

}
