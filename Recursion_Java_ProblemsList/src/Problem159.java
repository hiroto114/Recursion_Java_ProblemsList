import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * ■2番目に大きな値
 * Gene は動画配信プラットフォームを運営しており、年間で再生回数が多かった人たちに商品を与える予定です。
 * 現在、2 番目に多かった人に商品を与えようとしています。
 * 異なる再生回数一覧 views が与えられるので、その中から 2 番目に大きい値を返す、secondLargestElement という関数を作成してください。
 * 全ての再生回数が同じ場合は、その再生回数を返してください。
 */
public class Problem159 {
    /*
     * ツリーセットを使って重複要素を削除＋要素を昇順にする
     * そのうえで要素が1個→その値を返却
     * 要素が2個以上→最後から2番目を返却
     **/
    public static int secondLargestElement(int[] views){
        Set<Integer> viewSet = new TreeSet<Integer>();
        for(int i : views){
            viewSet.add(i);
        }
        if(viewSet.size() == 1) return getNthElementFromSet(viewSet, 1);
        return getNthElementFromSet(viewSet, viewSet.size() - 1);
    }
    /**
     * セットのn番目のようそをしゅと
     */
    public static int getNthElementFromSet(Set<Integer> set, int n){
        Iterator<Integer> iterator = set.iterator();
        int count = 0;
        int nthElement = 0;
        while (iterator.hasNext()) {
            nthElement = iterator.next();
            count++;
            if (count == n) {
                break;
            }
        }
        return nthElement;
    }
}
