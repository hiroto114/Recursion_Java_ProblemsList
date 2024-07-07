import java.util.ArrayList;
import java.util.List;

/*
 * Davis は本屋の店長で、本の陳列を変えようとしました。
 * 特定の位置までは全く変えず、それ以外は全ての本を逆並びの配置にする予定です。
 * 陳列している本の商品番号一覧を表す配列 intArr と特定の位置（インデックス）i が与えられるので、
 * 0 から i-1 までの配置はそのままで、i から最後までの配置を反転させた商品番号一覧を返す、reverseIntegers という関数を定義してください。
 * 例えば、123456789 のインデックス 2 以降を切り取り、反転させて再び連結させると以下のようになります。
 */
public class Problem139 {
    public static int[] reverseIntegers(int[] intArr, int input){
        List<Integer> list=new ArrayList<>();

        // 0番目からinput-1番目まではそのまま入れる
        for(int i=0;i<input;i++){
            list.add(intArr[i]);
        }

        // input番目から最後までは逆順になるように入れる
        for(int i=intArr.length-1;i>=input;i--){
            list.add(intArr[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
