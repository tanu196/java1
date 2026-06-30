import java.util.Random;

public class Ens45_challenge2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int mineRow = rand.nextInt(5)+1;
		int mineCol = rand.nextInt(5)+1;
		
		System.out.println("マップを表示します");
		System.out.println();
		System.out.println(" A   B   C   D   E  ");
		for(int row = 1 ; row <= 5 ; row++) {
			System.out.println();
			System.out.print(row);
			for(int col = 1 ; col <= 5 ; col++) {
				System.out.print(" □ ");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println("地雷を探します");
		System.out.println();
		mineSerch:
		for(int row = 1 ; row <= 5 ; row++) {
			for(int col = 1 ; col <= 5 ; col++) {
				String colName;
				if(col == 1) {
					colName = "A";
				}else if(col == 2) {
					colName = "B";
				}else if(col == 3) {
					colName = "C";
				}else if(col == 4) {
					colName = "D";
				}else {
					colName = "E";
				}
				System.out.println(row + "行目" + colName + "列を確認します");
				System.out.println();
				if(row == mineRow && col == mineCol) {
					System.out.println("地雷を発見しました");
					break mineSerch;
				}
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("地雷の位置を表示します");
		System.out.println();
		System.out.println("  A   B   C   D   E  ");
		for(int row = 1 ; row <= 5 ; row++) {
			System.out.println();
			System.out.print(row);
			for(int col = 1 ; col <= 5 ; col++) {
				if(row == mineRow && col == mineCol) {
					System.out.print(" × ");
				}else {
					System.out.print(" □ ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("探索を終了します");
	}
					
}
