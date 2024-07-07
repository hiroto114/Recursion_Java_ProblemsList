/*
 * Jordan は、CSS の一部の機能として、入力されるカラーコードが有効かどうかチェックするプログラムの作成を任されました。
 * 文字列 colorCode が与えられるので、それが有効かどうかチェックする関数、isValid という関数を作成してください。
 * カラーコードが有効になる条件は以下の通りです。
 * 
 * # で始まる
 * # 以外は 6 文字
 * 6 文字はアルファベットおよび数字のみでされる
 * アルファベットは A-F、a-f のみ
 */
public class Problem328 {
    public static boolean isValid(String colorCode){
        return colorCode.matches("#[0-9a-fA-F]{6}");
    }
}
