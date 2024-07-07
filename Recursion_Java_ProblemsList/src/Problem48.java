/**
 * 正の整数を引数として受け取り、その数の約数をすべてハイフンで区切って返す関数 divisor を再帰を用いて定義してください。
 * この関数を呼び出した際に返される文字列の形式は以下のようになります。
 * 例えば、divisor(12) を呼び出すと、文字列 "1-2-3-4-6-12" が返されます。
 * 最初の数値は必ず 1 で、その後の数値は昇順で約数が表示されます。最後の数値は引数で与えられた整数そのものです。
 */
public class Problem48 {
    public static String divisor(int number){
        StringBuilder result = new StringBuilder("");
        for(int i=1;i<=number;i++){
            if(number % i ==0){
                result.append(String.valueOf(i)+"-");
            }
        }

        return result.toString().substring(0,result.toString().length()-1);
    }
}
