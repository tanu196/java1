import java.util.Scanner;
public class Exp65_challenge3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] student = new Student[5+1];
		
		student[0] = new Student("今永" , 78 , 84 , 72 );
		student[1] = new Student("大谷" , 66 , 69 , 81);
		student[2] = new Student("岡本" , 92 , 88 , 90);
		student[3] = new Student("佐々木" , 55 , 64 , 70);
		student[4] = new Student("山本" , 84 , 75 , 72);
		
		System.out.println("新規学生の情報を入力してください");
		System.out.print("名前：");
		String name = sc.next();
		System.out.print("国語：");
		int japScore = sc.nextInt();
		System.out.print("数学：");
		int mathScore = sc.nextInt();
		System.out.print("英語：");
		int engScore = sc.nextInt();
		
		student[5] = new Student(name , japScore , mathScore , engScore);
		
		
		for(Student s : student) {
			s.setAverage();
			s.show();
		}
		
		//for文version
		
		for(int i = 0 ; i < student.length ; i++) {
			student[i].setAverage();
			student[i].show();
		}
	}

}   