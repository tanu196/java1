// 第15回 回収：animals を拡張forでなぞると、出力はどうなる？
class ForEachUse {
    public static void main(String[] args) {
        String[] animals = {"Dog", "Cat", "Fish"};
        
        for (String animal : animals) {
            System.out.print(animal + " ");
        }
        System.out.println();
        
        int[] nums = {1,3,5,7,9};
        
        for(int n : nums) {
        	System.out.println(n);
        }
    }
}
