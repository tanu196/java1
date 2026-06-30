
public class Exp53_3 {

	public static void main(String[] args) {
		String[][] schedule= {
				{ "Java1" , "-" , "Java1" , "-" , "Java1"}, //一行目
				{"Java1", "DB" , "Java1" , "-" , "Java1"},//二行目
				{"-" , "-" , "-" , "情リテ" ,"-" },//三行目
				{"-" , "-" , "-" , "情リテ" ,"-" },//四行目
		};
		
		System.out.println("月曜日の時間割\n"  + schedule[0][0] + schedule[1][0] +
				schedule[2][0] + schedule[3][0]);
		System.out.println("火曜日の時間割\n"  + schedule[1][0] + schedule[1][1] +
				schedule[1][2] + schedule[1][3] + schedule[1][4]);
		System.out.println("水曜日の時間割\n"  + schedule[2][0] + schedule[2][1] +
				schedule[2][2] + schedule[2][3] + schedule[2][4]);
		System.out.println("木曜日の時間割\n"  + schedule[3][0] + schedule[3][1] +
				schedule[3][2] + schedule[3][3] + schedule[3][4]);
		
		
	}

}
