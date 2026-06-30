import java.util.Scanner;

public class Ens53_challenge {

	public static void main(String[] args) {
		String[][] mass = {
				{ " , ", " , ", " , " },
				{ " , ", " , ", " , " },
				{ " , ", " , ", " , " }
		};
		System.out.println("現在のマス");
		System.out.println(mass[0][0] + mass[0][1] + mass[0][2]);
		System.out.println(mass[1][0] + mass[1][1] + mass[1][2]);
		System.out.println(mass[2][0] + mass[2][1] + mass[2][2]);

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mass.length * mass.length; i++) {

			System.out.println("プレイヤー１の入力です");
			System.out.print("行番号を入力してください：");
			int raw0 = sc.nextInt();
			System.out.print("列番号を入力してください：");
			int col0 = sc.nextInt();
			if(mass[raw0 - 1][col0 - 1].equals("○") || mass[raw0 - 1][col0 - 1].equals("○")) {
				System.out.println("そのマスはすでに選ばれています");
				continue;
			}
			mass[raw0 - 1][col0 - 1] = "○";
			
			System.out.println("現在のマス");
			System.out.println(mass[0][0] + mass[0][1] + mass[0][2]);
			System.out.println(mass[1][0] + mass[1][1] + mass[1][2]);
			System.out.println(mass[2][0] + mass[2][1] + mass[2][2]);
			System.out.println();

			System.out.println("プレイヤー２の入力です");
			System.out.print("行番号を入力してください：");
			int raw1 = sc.nextInt();
			System.out.print("列番号を入力してください：");
			int col1 = sc.nextInt();
			if(mass[raw1 - 1][col1 - 1].equals("×") || mass[raw1 - 1][col1 - 1].equals("○")) {
				System.out.println("そのマスはすでに選ばれています");
				continue;
			}
			mass[raw1 - 1][col1 - 1] = "×";
			System.out.println("現在のマス");
			System.out.println(mass[0][0] + mass[0][1] + mass[0][2]);
			System.out.println(mass[1][0] + mass[1][1] + mass[1][2]);
			System.out.println(mass[2][0] + mass[2][1] + mass[2][2]);
			System.out.println();
			sc.close();
			}

		}
	}

