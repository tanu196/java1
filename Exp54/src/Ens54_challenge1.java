
public class Ens54_challenge1 {

	public static void main(String[] args) {
		String[][] name = {
				{ "科目１" , "科目２" , "科目３" },
				{ "学生１" },
				{ "学生２" },
				{ "学生３" },
				{ "学生４" },
				{ "学生５" },
		};
		
		int[][] scores = {
				{ 78 , 84 , 72 },	
				{ 66 , 69 , 81 },	
				{ 92 , 88 , 90 },	
				{ 55 , 64 , 70 },	
				{ 84 , 75 , 72 },
		};
		double[][] average = new double[10][10];
		average[0][0] = (scores[0][0] + scores[0][1] + scores[0][2])/3;
		average[0][1] = (scores[1][0] + scores[1][1] + scores[1][2])/3;
		average[0][2] = (scores[2][0] + scores[2][1] + scores[2][2])/3;
		average[0][3] = (scores[3][0] + scores[3][1] + scores[3][2])/3;
		average[0][4] = (scores[4][0] + scores[4][1] + scores[4][2])/3;
				
		
		for(int i = 0 ; i < name.length-1 ; i++) {
			System.out.print( name[i+1][0] + "：" );
			for(int j = 0 ; j < scores[1].length ; j++) {
				System.out.print(name[0][j] + " " + scores[i][j] + "点 " + "平均" +average[0][i] + "点");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		average[1][0] = (scores[0][0] + scores[1][0] + scores[2][0] + scores[3][0] + scores[4][0])/5;
		average[1][1] = (scores[0][1] + scores[1][1] + scores[2][1] + scores[3][1] + scores[4][0])/5;
		average[1][2] = (scores[2][2] + scores[1][2] + scores[2][2] + scores[3][2] + scores[4][0])/5;
		
		System.out.println("科目１の平均点：" + average[1][0] + "点");
		System.out.println("科目２の平均点：" + average[1][1] + "点");
		System.out.println("科目３の平均点：" + average[1][2] + "点");
	}

}
