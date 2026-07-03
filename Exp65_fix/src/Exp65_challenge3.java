
public class Exp65_challenge3 {

	public static void main(String[] args) {
		
		Student[] student = new Student[5];
		
		student[0] = new Student("今永" , 78 , 84 , 72 );
		student[1] = new Student("大谷" , 66 , 69 , 81);
		student[2] = new Student("岡本" , 92 , 88 , 90);
		student[3] = new Student("佐々木" , 55 , 64 , 70);
		student[4] = new Student("山本" , 84 , 75 , 72);
		
		
		for(Student s : student) {
			s.setAverage();
			s.show();
			
		}
 
	}

}   