class Students {
	String name;
	int score;
	int attendance;
}

class Exp65_1 {
	public static void main(String[] args) {
		Students student1 = new Students();
		
		student1.name = "佐藤";
		student1.score = 85;
		student1.attendance = 12;
		
		System.out.println("名前" + student1.name);
		System.out.println(student1.score + "点");
		System.out.println(student1.attendance + "点");

	}

}
