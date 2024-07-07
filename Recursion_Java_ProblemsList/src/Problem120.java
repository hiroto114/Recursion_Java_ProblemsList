/*
 * Price はクラスの担任教師で、あるルールでクラスの掃除当番を決めていました。
 * 生徒全員にくじ引きを引かせて、奇数番目にくじを引いた生徒のみの合計値と偶数番目にくじを引いた生徒のみの合計値を求めていきます。
 * そして、合計値が高い方が掃除当番になるルールです。
 * 順番に生徒が引いた数字の一覧 intArr が与えられるので、値が高いグループの合計値を返す関数 findHighestScore を作成してください。
 * 順番は 0 番目からスタートするものとします。
 */
public class Problem120 {
    public static int findHighestScore(int[] intArr){
        int oddNumber  = 0;
        int evenNumber = 0;

        for(int i=1;i<=intArr.length;i++){
            if(i%2==0) evenNumber += intArr[i-1]; 
            if(i%2==1) oddNumber  += intArr[i-1];
        }

        return Math.max(oddNumber,evenNumber);
    }
}
