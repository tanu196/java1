
public class Watashi3 {

	public static void main(String[] args) {
		FriendRobot robot = new FriendRobot();
		
		robot.showStatus();
		
		robot.setName("ロボ助");
		robot.showStatus();
		
		robot.setName("メカ丸");
		robot.showStatus();
		
		robot.charge();
		robot.showStatus();
		
		
		
	}

}
