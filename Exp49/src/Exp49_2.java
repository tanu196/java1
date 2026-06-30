
public class Exp49_2 {

	public static void main(String[] args) {
		String[] items = {"水", "お茶" ,"ジュース"};
		
		System.out.println(items[0]);
		System.out.println("変更前：" + items[1]);
		System.out.println(items[2]);
		
		items[1] = "スポーツドリンク";
		
		System.out.println("変更後：" + items[1]);
		
	}

}
