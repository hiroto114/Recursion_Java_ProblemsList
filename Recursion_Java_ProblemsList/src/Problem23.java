/**
 * Tony は上司からドキュメントの修正を指示されました。
 * 自身が作成した膨大な数のドキュメントを、一から修正するのは大変なので、
 * 指摘された部分だけを削除するプログラムを作成しようと思いました。
 * 文字列 string と数値 i が与えられるので、i 番目の文字が削除された文字列を返す、deleteAt という関数を作成してください。
 * 数値 i が受け取った文字列のサイズより大きい場合は、文字列をそのまま返します。
 */
public class Problem23 {
	/**
	 * 既存のライブラリを使う（StringBuilder）と超絶キレイに書ける。
	 */
    public static String deleteAt(String s, int i){
        if(i<=0 || s.length()<i) return s;

        return (new StringBuilder(s)).deleteCharAt(i-1).toString();
    }
}
