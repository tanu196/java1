// 第11回 2. break ＋フラグで検索（おどろき演習）
// 5個の配列から target(30) をさがす。何回で終わる？
class SearchBreak {
    public static void main(String[] args) {
    	
    	String[] mojies = {"A" , "B" , "C"};//初期化
    	String[] mojies2 = new String[5];//宣言
    	mojies2[0] = "aiu";// 代入
    	
        int[] data = {10, 20, 30, 40, 50};
        int target = 30;
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            count++;                         // 何回見たか数える
            if (data[i] == target) {
                break;
            }
        }
        System.out.println("調べた回数: " + count);
    }
}
