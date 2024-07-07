/**
 * Jacob は息子の学校の宿題を手伝ってあげています。
 * 答えを教えてしまっては勉強の意味がないので、答えの最後の 4 文字だけを教えてあげることにしました。
 * 文字列 string を受け取り、最後の 4 文字以外を Hint is: で置き換える、lastFourHint という関数を作成してください。
 * また、文字列が 6 文字未満の場合は、There is no Hint と返してください。
 *
 */
public class Problem21 {
	/**
	 * substringの引数が1個だけだとその文字数目以降を返す。
	 * substringの引数が2個あると2番目の引数の位置が含まれない→可読性が大きく下がるので、
	 * 出来れば使いたくないなあ。。。。
	 */
    public static String lastFourHint(String stringInput){
        if(stringInput.length() < 6) return "There is no Hint";
        return "Hint is:" + stringInput.substring(stringInput.length()-4);
    }
}
