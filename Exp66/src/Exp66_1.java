
public class Exp66_1 {

	public static void main(String[] args) {
		Pokemon pokemon = new Pokemon();
		pokemon.name = "ペンドラー";
		pokemon.type = "どく";
		pokemon.level = 4000;
		pokemon.hp = 10000;
		
		Pokemon pikachu = new Pokemon(); 
        Pokemon lucario = new Pokemon(); 
        Pokemon mokuroh = new Pokemon(); 
 
        pikachu.name = "ピカチュウ"; 
        pikachu.type = "でんき"; 
        pikachu.level = 10; 
        pikachu.hp = 35; 
 
        lucario.name = "ルカリオ"; 
        lucario.type = "かくとう"; 
        lucario.level = 15; 
        lucario.hp = 70; 
 
        mokuroh.name = "モクロー"; 
        mokuroh.type = "くさ"; 
        mokuroh.level = 8; 
        mokuroh.hp = 45; 
		
        
        pikachu.showStatus();
        System.out.println();
        lucario.showStatus();
        System.out.println();
        mokuroh.showStatus();
        System.out.println();
        pokemon.showStatus();
        System.out.println();

        pokemon.greeTrainer("サトシ");
        
	}

}
