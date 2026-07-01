import java.util.Scanner;
public class Exp65_challenge4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("新規学生の情報を入力してください");
		
		System.out.print("名前：");
		String name = sc.next();
		System.out.print("国語：");
		int jpscore = sc.nextInt();
		System.out.print("数学：");
		int mathscore = sc.nextInt();
		System.out.print("英語：");
		int enscore = sc.nextInt();
		
		Student student1 = new Student();
		student1.show();
		System.out.println();
		student1.average(name , jpscore , mathscore , enscore);
		student1.totalShow();
		
	}
}
