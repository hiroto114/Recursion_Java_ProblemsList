/*
 * Austin はある RPG に夢中になっています。
 * そこでは、1 ターンで複数の攻撃コマンドを入力するのですが、攻撃で与えられるダメージを加算していくか乗算していくかプレイヤーが選べる仕組みになっています。
 * 攻撃によるダメージ一覧 attacks が文字列として与えられるので、加算と乗算を組み合わせた時の最も大きなダメージを返す、maxValueInteger を作成してください。
 * （ただし、2 つの演算子に優先度はなく、常に左から計算されます。）
 * 
 * 例えば、01230 の場合では、0 + 1 + 2 * 3 + 0 と計算を行うと最大値 9 が得られます。
 * 
 * maxValueInteger("01230") --> 9
 * maxValueInteger("51403") --> 72
 * maxValueInteger("100101101001") --> 6
 * maxValueInteger("938210591") --> 19486
 * 
 */
public class Problem242 {
    public static int maxValueInteger(String attacks){
        int result = 0;
        result += Integer.parseInt(attacks.substring(0,1));
        for(int i=1;i<attacks.length();i++){
            if(!"0".equals(attacks.substring(i,i+1))){
                if(result ==1) result += Integer.parseInt(attacks.substring(i,i+1)); 
                else result *= Integer.parseInt(attacks.substring(i,i+1));
            }
            if("1".equals(attacks.substring(i,i+1))){
                result += 1;
            }
        }

        return result;
    }
}
