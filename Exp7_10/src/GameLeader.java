import java.util.Random;
import java.util.Scanner;

public class GameLeader {
	private Random rand;
	private Scanner sc;

	//gameの準備
	public GameLeader() {
		this.rand = new Random();
		this.sc = new Scanner(System.in);
	}

	//Ranodomクラスを渡せる
	public Random getRandom() {
		return rand;
	}

	public Scanner getScanner() {
		return sc;
	}
}
