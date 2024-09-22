import java.util.TreeSet;

/*
 * ■2番目に大きな値
 * Gene は動画配信プラットフォームを運営しており、年間で再生回数が多かった人たちに商品を与える予定です。
 * 現在、2 番目に多かった人に商品を与えようとしています。
 * 異なる再生回数一覧 views が与えられるので、その中から 2 番目に大きい値を返す、secondLargestElement という関数を作成してください。
 * 全ての再生回数が同じ場合は、その再生回数を返してください。
 */
public class Problem159 {
    public static void main(String[] args) {
        // テストケースまとめ
        System.out.println(secondLargestElement(new int[]{40, 50, 80, 100, 30}) == 80);		// true
        System.out.println(secondLargestElement(new int[]{80, 80, 80}) == 80);				// true
        System.out.println(secondLargestElement(new int[]{99, 1, 55, 99, 34, 76}) == 76);	// true
        System.out.println(secondLargestElement(new int[]{5, 9, 3}) == 5);					// true
        System.out.println(secondLargestElement(new int[]{7, 7, 7, 7}) == 7);				// true
        System.out.println(secondLargestElement(new int[]{1, 2}) == 1);						// true
    }
    public static int secondLargestElement(int[] views){
        TreeSet<Integer> viewSet = new TreeSet<Integer>();
        for(int i : views) viewSet.add(i);
        return getSecondLargest(viewSet);
    }
    public static int getSecondLargest(TreeSet<Integer> set) {
        if (set.size() == 1) {
            return set.last(); // 要素が1つしかない場合、最大値をそのまま返す
        } else if (set.size() >= 2) {
            set.pollLast(); // 最大値を取り除く
            return set.last(); // 2番目に大きい要素を取得
        }else{
            return 0;
        }
    }
}
