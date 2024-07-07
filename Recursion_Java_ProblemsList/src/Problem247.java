/*
 * Angela はオンラインサバイバルゲームのイベント開催を予定しており、同じランクのユーザーをペアにしようと考えていました。
 * その下準備として、同じランクになるペアがいくつあるか数えようとしています。各ユーザーのランク ranks が与えられるので、
 * 同じ値を持つペアの数を返す、countEqualPairs という関数を作成してください。
 * 
 * 例えば、ユーザー A, B, C, D がそれぞれ [1,2,1,1] のランクを持っているとき、A&C、A&D、C&D がペアの候補に該当します。
 */
public class Problem247 {
	public static int countEqualPairs(int[] ranks){
		int result = 0;
		for(int i=0;i<ranks.length-1;i++){
			for(int m=i+1;m<ranks.length;m++){
				if(ranks[i]==ranks[m]) result += 1;
			}
		}

		return result;
	}
}
