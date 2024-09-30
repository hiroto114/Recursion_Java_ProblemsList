/*
 * 整数 x と累乗 m が与えられるので、m 乗の数字を足し合わせたら x になる組み合わせの数を返す、combinationsOfSum という関数を定義してください。
 * combinationsOfSum(1,1) --> 1
 * combinationsOfSum(2,1) --> 1
 * combinationsOfSum(4,1) --> 2
 * combinationsOfSum(10,2) --> 1
 * combinationsOfSum(100,2) --> 3
 * combinationsOfSum(50,2) --> 3
 * combinationsOfSum(270,2) --> 28
 * combinationsOfSum(270,3) --> 0
 * combinationsOfSum(400,2) --> 55
 * combinationsOfSum(1000,2) --> 1269
 * combinationsOfSum(243,3) --> 1
 * combinationsOfSum(5000,4) --> 0
 * combinationsOfSum(255,2) --> 23
 * combinationsOfSum(320,2) --> 25
 * combinationsOfSum(90,1) --> 189586
 */
public class Problem90 {
    public static void main(String[] args) throws Exception {
        System.out.println(combinationsOfSum(1, 1) == 1);
        System.out.println(combinationsOfSum(2, 1) == 1);
        System.out.println(combinationsOfSum(4, 1) == 2);
        System.out.println(combinationsOfSum(10, 2) == 1);
        System.out.println(combinationsOfSum(100, 2) == 3);//
        System.out.println(combinationsOfSum(50, 2) == 3);//
        System.out.println(combinationsOfSum(270, 2) == 28);//
        System.out.println(combinationsOfSum(270, 3) == 0);
        System.out.println(combinationsOfSum(400, 2) == 55);
        System.out.println(combinationsOfSum(1000, 2) == 1269);
        System.out.println(combinationsOfSum(243, 3) == 1);
        System.out.println(combinationsOfSum(5000, 4) == 0);
        System.out.println(combinationsOfSum(255, 2) == 23);
        System.out.println(combinationsOfSum(320, 2) == 25);
        System.out.println(combinationsOfSum(90, 1) == 189586);
    }
    /**
     * 動的計画法で攻める
     * 1,0~xまでの値の場合の数を表すための配列を作成
     * 2,Math.pow(i,m)<=xになるような0以上の整数iの範囲内で繰り返す
     * 3,もしも1の配列内で正になっているやつがあってその値にMath.pow(i,m)をたすと
     *   配列のインデックスの中に納まる場合はそれを集計
     * 4,最後にcount[Math.pow(i,m)]に+1する
     * 5,最後にcount配列の一番最後の値を返す
     */
	public static int combinationsOfSum(int x,int m){
	    int[] count = new int[x+1];
	    for(int i=1;Math.pow(i,m)<=x;i++){
	        for(int n=x;n>=1;n--){
	            if(count[n]>0 && n+Math.pow(i,m)<=x){
	                count[n+(int)Math.pow(i,m)] += count[n];
	            }
	        }
            count[(int)Math.pow(i,m)] += 1;
	    }
	    return count[x];
	}
}
