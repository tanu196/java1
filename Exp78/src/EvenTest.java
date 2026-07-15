// 第10回 3. for の中の if（条件で絞る）（おどろき演習）
// 10回まわる。表示されるのは何個？
class EvenTest {
    public static void main(String[] args) {
//    	String a = "e";
//        for (int i = 0; i < 20; i++) {
//            if (i % 3 == 0 || Integer.toString(i).contains("3")) {               // 偶数だけ
//                System.out.print(i + " ");
//            }
//        }
        
        for(int i = 1 ; i <= 9 ; i++) {
        	for(int j = 1 ; j <= 9 ; j++) {
        		System.out.print(i*j + " ");
        	}
        	System.out.println();
        }
        	
        
    }
}
