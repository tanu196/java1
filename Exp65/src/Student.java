
public class Student {
	private String name;
	private int englishScore;
	private int mathScore;
	private int japaneseScore;
	private double average;
	private double[] totalAverage = new double[100];
	private String[] maxName =  new String[100];

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getJapaneseScore() {
		return japaneseScore;
	}

	public void setJapaneseScore(int japaneseScore) {
		this.japaneseScore = japaneseScore;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public void show() {
		Student student = new Student();

		student.setName("今永");
		student.setJapaneseScore(78);
		student.setMathScore(84);
		student.setEnglishScore(72);
		student.setAverage(78.0);

		System.out.print("名前：" + student.getName() + " ");
		System.out.print("国語：" + student.getJapaneseScore() + "点" + " ");
		System.out.print("数学：" + student.getMathScore() + "点" + " ");
		System.out.println("英語：" + student.getEnglishScore() + "点" + " ");
		System.out.println("平均点：" + student.getAverage() + "点");

		System.out.println();

		Student student2 = new Student();

		student2.setName("大谷");
		student2.setJapaneseScore(66);
		student2.setMathScore(69);
		student2.setEnglishScore(81);
		student2.setAverage(72.0);

		System.out.print("名前：" + student2.getName() + " ");
		System.out.print("国語：" + student2.getJapaneseScore() + "点 ");
		System.out.print("数学：" + student2.getMathScore() + "点 ");
		System.out.println("英語：" + student2.getEnglishScore() + "点 ");
		System.out.println("平均点：" + student2.getAverage() + "点 ");

		System.out.println();

		Student student3 = new Student();

		student3.setName("岡本");
		student3.setJapaneseScore(92);
		student3.setMathScore(88);
		student3.setEnglishScore(90);
		student3.setAverage(90.0);

		System.out.print("名前：" + student3.getName() + " ");
		System.out.print("国語：" + student3.getJapaneseScore() + "点 ");
		System.out.print("数学：" + student3.getMathScore() + "点 ");
		System.out.println("英語：" + student3.getEnglishScore() + "点 ");
		System.out.println("平均点：" + student3.getAverage() + "点 ");

		System.out.println();

		Student student4 = new Student();

		student4.setName("佐々木");
		student4.setJapaneseScore(55);
		student4.setMathScore(64);
		student4.setEnglishScore(70);
		student4.setAverage(63.0);

		System.out.print("名前：" + student4.getName() + " ");
		System.out.print("国語：" + student4.getJapaneseScore() + "点 ");
		System.out.print("数学：" + student4.getMathScore() + "点 ");
		System.out.println("英語：" + student4.getEnglishScore() + "点 ");
		System.out.println("平均点：" + student4.getAverage() + "点 ");

		System.out.println();

		Student student5 = new Student();

		student5.setName("山本");
		student5.setJapaneseScore(84);
		student5.setMathScore(75);
		student5.setEnglishScore(72);
		student5.setAverage(77.0);

		System.out.print("名前：" + student5.getName() + " ");
		System.out.print("国語：" + student5.getJapaneseScore() + "点 ");
		System.out.print("数学：" + student5.getMathScore() + "点 ");
		System.out.println("英語：" + student5.getEnglishScore() + "点 ");
		System.out.println("平均点：" + student5.getAverage() + "点 ");

		totalAverage[0] = student.getAverage();
		totalAverage[1] = student2.getAverage();
		totalAverage[2] = student3.getAverage();
		totalAverage[3] = student4.getAverage();
		totalAverage[4] = student5.getAverage();
		
		maxName[0] = student.getName();
		maxName[1] = student2.getName();
		maxName[2] = student3.getName();
		maxName[3] = student4.getName();
		maxName[4] = student5.getName();

	}

	public void show2() {

		System.out.print("名前：" + name + " ");
		System.out.print("国語：" + japaneseScore + "点" + " ");
		System.out.print("数学：" + mathScore + "点" + " ");
		System.out.println("英語：" + englishScore + "点" + " ");
		System.out.println("平均点：" + average + "点");
		System.out.println();
	}

	public Student() {

	}

	public void average(String name, int japaneseScore, int mathScore, int englishScore) {
		this.name = name;
		this.japaneseScore = japaneseScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;

		average = (japaneseScore + mathScore + englishScore) / 3.0;
		totalAverage[5] = average;
		maxName[5] = name;
		
		show2();
	}
	
	public void totalShow() {
		double max = 0;
		int maxCount = 0;
		for (int i = 0; i <= 5; i++) {
			System.out.println(maxName[i]);
			if (max < totalAverage[i]) {
				max = totalAverage[i];
				maxCount = i;
			}
		}
		System.out.println("平均点が一番高い人：" + maxName[maxCount]);
	}

}
