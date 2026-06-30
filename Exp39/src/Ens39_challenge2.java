import java.util.Random;

public class Ens39_challenge2 {

	public static void main(String[] args) {
		Random rand = new Random();
		String characterName = "エムバぺ";
		int hp = 1;
		int defense = 1;
		int attack = 1;
		int coolness =1;
		System.out.println("キャラクター名：" + characterName);
		System.out.println("HP:" + hp);
		System.out.println("攻撃力：" + attack);
		System.out.println("防御力：" + defense);
		System.out.println("カッコよさ：" + coolness);
		System.out.println("");
		System.out.println("");
		int level =1;
		for(level= 1 ; level<=5 ; level++) {
			int hpUp = rand.nextInt(10)+1;
			int attackUp = rand.nextInt(5)+1;
			int defenseUp = rand.nextInt(5)+1;
			int coolnessUp = rand.nextInt(5)+1;
			
			System.out.println(characterName + "は" + level + "レベルに上がりました！");
			System.out.println("HPが" + hpUp + "上がりました！");
			System.out.println("攻撃力が" + attackUp + "上がりました！");
			System.out.println("防御力が" + defenseUp + "上がりました！");
			System.out.println("カッコよさが" + coolnessUp + "上がりました！");
			System.out.println("");
			System.out.println("");
			hp += hpUp;
			attack += attackUp;
			defense += defenseUp;
			coolness += coolnessUp;
		}
		level = 5;
		System.out.println("レベルアップ処理が完了しました");
		System.out.println("レベル" + level + "のステータス");
		System.out.println("HP:" + hp);
		System.out.println("攻撃力：" + attack);
		System.out.println("防御力：" + defense);
		System.out.println("カッコよさ：" + coolness);
	}

}
