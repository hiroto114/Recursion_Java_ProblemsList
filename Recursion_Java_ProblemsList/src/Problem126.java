/*
 * Mazurok が働いている企業では、営業の成約件数を毎月伸ばさなければペナルティが課されるルールでした。
 * しかし、一度だけ記録を改ざんすることが許可されており、それで毎月件数が伸びていればペナルティを免除することができます。
 * 月ごとの成約件数 appointments が与えられるので、1つだけ他の値に書き換えて記録が伸び続けているかどうか判定する、isIncreasing という関数を作成してください。
 */
public class Problem126 {
    // これfor文の2重ループだがオペレーションを見るとO(n)でいけてる。しかもわかりやすい。
    public static boolean isIncreasing(int[] appointments){
        if(appointments.length <= 2) return true;
        for(int i=0; i<appointments.length-1; i++){
            if(appointments[i] - appointments[i+1] >= 0){
                int[] appointments1 = appointments.clone();
                appointments1[i] = appointments1[i+1] - 1;
                int[] appointments2 = appointments.clone();
                appointments2[i+1] = appointments2[i] + 1;
                return isIncreasingArray(appointments1) || isIncreasingArray(appointments2);
            }
        }
        return true;
    }
    public static boolean isIncreasingArray(int[] appointments){
        if(appointments.length <= 1) return true;
        for(int i=0; i<appointments.length-1; i++){
            if(appointments[i] - appointments[i+1] >= 0) return false;
        }
        return true;
    }
}
