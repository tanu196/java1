
public class Exp50_4 {

	public static void main(String[] args) {
		
		String[] fruits = {"Mikan" , "Banana" , "Apple" , "Grape"};
		boolean isFind = false;
		
		for(int i = 0 ; i < fruits.length ; i++) {
			if(fruits[i].equals("Apple")) {
				isFind = true;
			}
			
		}
		
		if(isFind) {
			System.out.println("Appleが見つかりました");	
		}else {
			System.out.println("Appleは見つかりませんでした");
		}
		
		
		
		
	}

}
