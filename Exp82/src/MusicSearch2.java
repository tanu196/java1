// 第14回 本丸1：「Bowie」は配列に無いキーワード。最後に何が出る？
class MusicSearch2 {
    public static void main(String[] args) {
        String[] artists = {"Beatles", "Queen", "Adele"};
        String[] albums = {"Abbey Road", "A Night at the Opera", "25"};
        int[] stocks = {5, 3, 10};
        String keyword = "Bowie";              // 配列に無いキーワード
        boolean found = false;
        for (int i = 0; i < artists.length; i++) {
            if (artists[i].equals(keyword)) {
                System.out.print("アーティスト名：" + artists[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("該当商品はありません。");
        }
    }
}
