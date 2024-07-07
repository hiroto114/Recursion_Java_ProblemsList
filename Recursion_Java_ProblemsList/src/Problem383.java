/*
 * Jacques は、ソフトウェアの途中で、無料ユーザーと有料ユーザーの合計数を保存するための変数を作成しています。以下の指示に従って、変数に値を格納し、データを出力してください。

変数 onlinePaidUser を宣言し、整数 40 を割り当ててください。
変数 onlineUser を宣言し、onlinePaidUser に整数 50 を足した値を割り当ててください。
onlineUser に保存されている値をコンソールに出力してください。
 */
public class Problem383 {
    public static void main(String[] args){
        int onlinePaidUser = 40;

        int onlineUser = onlinePaidUser + 50;
        System.out.println(onlineUser);
    }
}
