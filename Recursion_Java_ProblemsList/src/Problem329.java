/*
 * Jordan は、JavaScript の一部の機能として、入力されるコメントアウトが有効かどうかチェックするプログラムの作成を任されました。
 * 文字列 s が与えられるので、それが有効かどうかチェックする関数、isCommentOutValid という関数を作成してください。
 * コメントアウトが有効になる条件は以下の通りです。
 * 「/」「/」のセット「//」でコメントアウトを表す
 */
// 「/*」を使う場合は、直後に「*/」が置かれなければいけない
//文字列内の全てのコメントアウトが有効でなければならない
//*/
public class Problem329 {
	public static boolean isCommentOutValid(String s){
		String copyedS = s;
		/*
		 * これは絶対コメント必要。単純に空に置換＋エスケープしている。
		 * replaceAllは第一引数を正規表現で見立ててしまうので、エスケースしないといかん。
		 */
		copyedS = copyedS.replaceAll("/\\*\\*/","");
		/*
		 * containsについては引数を正規表現と見立てないので特殊文字のエスケープ不要。
		 */
		if(copyedS.contains("/*") || copyedS.contains("*/")) return false;

		int count = 0;
		for(int i=0;i<copyedS.length();i++){
			if(copyedS.charAt(i) == '/')count += 1;
		}

		return count % 2 == 0;
	}
}
