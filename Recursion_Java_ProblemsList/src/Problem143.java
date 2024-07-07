import java.util.ArrayList;
import java.util.List;

/*
 * Mason は競技プログラミングに参加していたところ、カプレカ数を解く問題が出てきました。ここでのカプレカ数の定義は以下の通りです。
 * 正の整数を 2 乗し、それが偶数桁 2m 桁である場合は先頭 m 桁と末尾 m 桁に分け、
 * 奇数桁 2m + 1 桁である場合は先頭 m 桁と末尾 m + 1 桁に分けて和を取る。この操作によって元の値に等しくなる数をカプレカ数と呼ぶ。
 */
public class Problem143 {
    public static int[] kaprekarNumbers(int n){
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(isKaprekaNumber(i)){
                list.add(i);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * カプレカー数判定メソッド
     */
    public static boolean isKaprekaNumber(int n){
        if(n<=3) return n==1;
        String abc = String.valueOf(n*n);
        return Integer.parseInt(abc.substring(0,abc.length()/2))
                +Integer.parseInt(abc.substring(abc.length()/2,abc.length()))
               == n;
    }
}
