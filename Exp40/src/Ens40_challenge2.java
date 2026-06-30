import java.util.Random;
import java.util.Scanner; 
 
class Ens40_challenge2 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        Random rand = new Random(); 
 
        int choice; 
        int successCount = 0; 
        boolean isGameOver = false; 
 
        while (!isGameOver) { 
            int treasureCode = rand.nextInt(5) + 1; 
            boolean isHit = false; 
 
            System.out.println("新しい宝箱探しを開始します"); 
 
            for(int tryCount = 0; !isHit && tryCount < 3 ; tryCount++) {
            	
                System.out.println("残り回数：" + (3 - tryCount) + 
"回"); 
                System.out.print("宝箱を選んでください（1〜5）："); 
 
                choice = scanner.nextInt(); 
 
                if (choice == treasureCode) { 
                    System.out.println("当たりです！"); 
                    isHit = true; 
                } else { 
                    System.out.println("はずれです"); 
                    System.out.println(); 
                } 
            }


 
            if (isHit) { 
                System.out.println("クリア！"); 
                successCount++; 
 System.out.println(" 現 在 の 連 続 成 功 回 数 ： " + 
successCount + "回"); 
                System.out.println(); 
            } else { 
                System.out.println("ゲームオーバー..."); 
 System.out.println("当たりの宝箱は" + treasureCode 
+ "番でした"); 
                System.out.println("連続成功回数：" + successCount + 
"回"); 
                isGameOver = true; 
            } 
        } 
 
        scanner.close(); 
    } 
} 