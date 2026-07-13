package 配布用;

// 第7回 本丸：boolean を switch に渡している。
// これは動く？ 予想（ア「真」と表示／イ コンパイルエラー）してから実行しよう。
// ※このファイルはわざとエラーになる教材です（switch に boolean は使えない）。
class SwitchType {
    public static void main(String[] args) {
        char judge = 'A';
        
        switch (judge) {              // ← boolean は switch の条件に使えない
            case 'A':
                System.out.println("真");
                break;
            case 'B':
            	System.out.println("偽");
                break;
        }
    }
}
