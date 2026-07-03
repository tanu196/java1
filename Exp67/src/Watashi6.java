import java.util.Scanner;
public class Watashi6 {

	public static void main(String[] args) {
		FriendRobot robot = new FriendRobot();
		Scanner sc = new Scanner(System.in);
		System.out.print("起きた時間：");
		String message =  robot.sayHelloByHour(sc.nextInt());
		System.out.println(message);

	}

}
