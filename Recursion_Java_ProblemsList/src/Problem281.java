import java.util.HashMap;
import java.util.Map;

/*
 * 1 から 9 で構成される二分木が与えられるので、
 * 根ノードから葉ノードまでの各経路の中で並べ替えて回文の形にできる経路の数を返す、paliindromicPaths という関数を作成してください。
 */
public class Problem281 {
	public static int palindromicPaths(BinaryTree<Integer> root){
		if(root == null) return 1;
		// 末尾再帰最適化により、主記憶装置にかける負担を抑える。
		return palindromicPathsHelper(root, "");
	}
	// 再帰で行けそう。ベースケース、それ以外、流れを考え中
	public static int palindromicPathsHelper(BinaryTree<Integer> root, String s){
		if(root.left == null && root.right == null){
			if(canPalindrome(s + String.valueOf(root.data))){
				return 1;
			}
			return 0;
		}
		int result = 0;
		if(root.left  != null) result += palindromicPathsHelper(root.left, s + String.valueOf(root.data));
		if(root.right != null) result += palindromicPathsHelper(root.right,s + String.valueOf(root.data));
		return result;	
	}
	//　ここで並び替えたら回文になるよねメソッドを追加したい。
	public static boolean canPalindrome(String input){
		Map<String,Integer> countInput = new HashMap<String, Integer>();
		for(int i=0;i<input.length(); i++){
			countInput.put(input.substring(i, i+1), countInput.getOrDefault(input.substring(i,i+1),0) +1);
		}
		int oddCount = 0;
		for(int i: countInput.values()){
			if(i % 2 == 1) oddCount += 1;
		}
		return oddCount <= 1;
	}
}
