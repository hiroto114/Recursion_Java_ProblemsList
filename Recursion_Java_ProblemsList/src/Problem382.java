/*
 * 変数は何度も値を変更することができます。変数に新しい値を代入すると、以前の値は失われ、新しい値が変数に関連付けられます。

変数 isEmailValid を宣言し、ブール値 trueを割り当ててください。
isEmailValid に保存されている値をコンソールに出力してください。
変数 isEmailValid にブール値 false を割り当て、値を上書きしてください。
isEmailValid に保存されている値をコンソールに出力してください。
 */
public class Problem382 {
    public static void main(String[] args){
        boolean isEmailValid = true;
        System.out.println(isEmailValid);
        isEmailValid = false;
        System.out.println(isEmailValid);
        
    }
}
