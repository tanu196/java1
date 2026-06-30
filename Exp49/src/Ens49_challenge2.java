import java.util.Scanner;
public class Ens49_challenge2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("エルフーンはあたらしく「まもる」を覚えたい...");
		System.out.println("しかしわざを４つおぼえるのでせいいっぱいだ！");
		System.out.println();
		
		String[] technique = {
				("やどりぎのタネ"),
				("みがわり"),
				("アンコール"),
				("ムーンフォース")
		};
		System.out.println("ーーおぼえているわざリストーー");
		for(int i = 0 , o = 1 ; i< technique.length ;i++ , o++) {
			System.out.println();
			System.out.print(o +":" + technique[i]);
			System.out.println();
		}
		
		
	System.out.println();
	System.out.print("何番目の技を忘れさせますか:");
	int count = sc.nextInt();
	if(count <= 4 && count >= 1) {
		System.out.println();
		System.out.println("1,2の...ポカン！");
		System.out.println("エルフーンはあたらしく「まもる」をおぼえた！");
		System.out.println();
		System.out.println("――おぼえているわざリストーー");
		technique[count-1] = "まもる";
		for(int i = 0 , o = 1 ; i< technique.length ;i++ , o++) {
			System.out.println();
			System.out.print(o +":" + technique[i]);
			System.out.println();
		}
	}else {
		System.out.println("エラーです。");
	}
		sc.close();
	}

}
