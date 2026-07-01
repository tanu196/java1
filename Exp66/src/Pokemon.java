
public class Pokemon {
	String name;
	String type;
	int level;
	int hp;
	
	void showStatus() {
		System.out.println("名前；" + name);
		System.out.println("タイプ：" + type);
		System.out.println("レベル：" + level);
		System.out.println("HP:" + hp);
	}
	
	void greeTrainer(String trainerName) {
		System.out.println(trainerName + "さん" + name + "です！");
	}
	
}
