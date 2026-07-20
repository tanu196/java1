// 第14回 本丸1：「Bowie」は配列に無いキーワード。最後に何が出る？
class MusicSearch2 {
    public static void main(String[] args) {
        String[] artists = {"Beatles", "Queen", "Adele"};
        String[] albums = {"Abbey Road", "A Night at the Opera", "25"};
        int[] stocks = {5, 3, 10};
        String keyword = "Bowie";              // 配列に無いキーワード
        boolean found = false;
        for(int i = 0 ; i < albums.length ; i++) {
        	if(keyword.equals(albums[i])) {
        		System.out.println(artists[i]);
        		found = true;
        		break;
   
        	}
        }
        
        
        
        if (!found) {
            System.out.print("該当商品はありません。");
        }
    }
}
