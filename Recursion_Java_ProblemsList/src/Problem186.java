import java.util.*;

/*
 * Bill は映画監督で今まで何本も映画を作成してきました。
 * 現在、自分が作った映画がどれくらいヒットしたか気になっています。
 * そこで、後に上映された映画の累計来場者数より来場者数が多い映画があるかを調べ始めました。
 * 各映画の来場者数 visitors が与えられるので、その映画より後に上映された累計来場者数より大きいものを全て返す getAllMovies という関数を作成してください。
 * 
 * getAllMovies([16,17,4,3,5,2]) --> [17,5,2]
 * getAllMovies([16,17,3,4,3,5,2]) --> [5,2]
 * getAllMovies([1,32,31,30,25,0,5,0]) --> [25,5,0]
 * getAllMovies([1,9,31,8,5,0]) --> [31,8,5,0]
 * getAllMovies([6,3,0,0,2,1]) --> [2,1]
 * getAllMovies([100,29,20,3,2,1]) --> [100,29,20,2,1]
 * 
 * 下記やりかたなら時間計算量O(n)でいける。
 * 
 */
public class Problem186 {
    public static void main(String[] args) {
        System.out.println(Arrays.equals(getAllMovies(new int[]{16, 17, 4, 3, 5, 2}), new int[]{17, 5, 2}));
        System.out.println(Arrays.equals(getAllMovies(new int[]{16, 17, 3, 4, 3, 5, 2}), new int[]{5, 2}));
        System.out.println(Arrays.equals(getAllMovies(new int[]{1, 32, 31, 30, 25, 0, 5, 0}), new int[]{25, 5, 0}));
        System.out.println(Arrays.equals(getAllMovies(new int[]{1, 9, 31, 8, 5, 0}), new int[]{31, 8, 5, 0}));
        System.out.println(Arrays.equals(getAllMovies(new int[]{6, 3, 0, 0, 2, 1}), new int[]{2, 1}));
        System.out.println(Arrays.equals(getAllMovies(new int[]{100, 29, 20, 3, 2, 1}), new int[]{100, 29, 20, 2, 1}));
    }
    
    /**
     * 与えられたvisitorsという配列を一番右側から順にみていく。
     * @param visitors 映画館への訪問者数
     * @return result 後に上映された映画の累計来場者数より来場者数が多い映画のリスト
     */
	public static int[] getAllMovies(int[] visitors) {
		List<Integer> result = new ArrayList<Integer>();
		// visitorsの一番右側の要素は必ず答えに含まれるので答えに入れ、sumに代入
		result.add(visitors[visitors.length-1]);
		int sum = visitors[visitors.length-1];
		// 
		for(int i=visitors.length-2;i>=0;i--){
		    if(visitors[i] > sum){
		        result.add(0,visitors[i]);
		    }
		    sum += visitors[i];
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
