
public class Student {
	private String name;
	private int japanScore;
	private int mathScore;
	private int engScore;
	private double average;
	
	public Student() {
		
	}
	
	public void setAverage() {
		average = (japanScore + mathScore + engScore) /3;
	}

	public Student(String name, int japanScore, int mathScore, int engScore) {
		this.name = name;
		this.japanScore = japanScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
		
	}
	
	public void show() {
		System.out.print("名前：" + name + "  ");
		System.out.print("国語：" + japanScore + "点  ");
		System.out.print("数学：" + mathScore + "点  ");
		System.out.println("英語：" + engScore + "点  ");
		System.out.print("平均点：" + average + "点");
		System.out.println();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJapanScore() {
		return japanScore;
	}

	public void setJapanScore(int japanScore) {
		this.japanScore = japanScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public double getAverage() {
		return average;
	}

	
			
	
}