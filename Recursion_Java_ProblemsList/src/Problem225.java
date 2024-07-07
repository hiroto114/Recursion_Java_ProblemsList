/*
 * Gerry は入力された文字の文字数をカウントするアプリを作成しています。
 * このアプリに拡張性をつけるために、再帰で文字をカウントする予定です。
 * 入力された文字列 string が与えられるので、再帰を使って文字数を返す、lenString という関数を作成してください。
 * ただし、Python の len や、JavaScript の length は使わずに解いてください。
 */
public class Problem225 {
	public static int lenString(String string){
		if(string.length()==1) return 1;
		return 1+lenString(string.substring(1));
	}
}
