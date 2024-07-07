/*
 * 教員の Sam は、テストで最高得点を取った生徒が何人いるかを数えたいと考えています。
 * 生徒たちのテストの点数の一覧 scores が与えられるので、その中に含まれる最大値がいくつ存在するかをカウントする
 * countHighestScores という関数を作成してください。
 * 例えば、点数の一覧が [10,2,3,4,5,6,10,10,10,6,7] である場合、最高得点は 10 で、その得点を取った生徒は 4 人いるので、4 を返します。
 */
public class Problem112 {
	/*
	 * 時間計算量O(n)、空間計算量O(1)で行けるスマート。
	 */
    public static int countHighestScores(int[] scores){
        int max = scores[0];
        int result = 1;

        for(int i=1;i<scores.length;i++){
            if(max == scores[i]){
                result += 1;
            }
            if(max < scores[i]){
                max = scores[i];
                result = 1;
            }
        }

        return result;
    }
}
