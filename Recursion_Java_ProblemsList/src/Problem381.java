/*
 * より複雑な計算やソフトウェアを作るには、その結果を保存し、再利用する方法が必要です。プログラムがデータを読み書きするための記憶領域は変数と呼ばれ、それぞれメモリアドレスに関連付けられています。静的型付け言語では、変数を宣言する際にデータ型の指定が必要です。

変数 myFavoriteFruit を宣言し、文字列 Apple を割り当ててください。
myFavoriteFruit に保存されている値をコンソールに出力してください。
変数 appleCount を宣言し、整数 5 を割り当ててください。
appleCount に保存されている値をコンソールに出力してください。
 */
public class Problem381 {
    public static void main(String[] args){
        String myFavoriteFruit = "Apple";
        System.out.println(myFavoriteFruit);

        int appleCount  = 5;
        System.out.println(appleCount);
    }
}
