/*
 * とある表計算ソフトではカラム名が数字ではなくてアルファベットの組み合わせによって表現されています。
 * たとえば、1 列目は A 列と呼ばれ、27 列目は AA 列とよばれます。
 * Mike は上司から number 列の部分を修正してくれと指示されたのですが、number が自然数で与えられたため、
 * それがどの列を指しているのかわかりませんでした。Mike のために number 列がアルファベット表記ではどの列に相当するのかを教えてあげましょう。
 * number が自然数（number <= 702）で与えられるので、大文字アルファベットとして返す findColumn という関数を作成してください。
 * 
 * findColumn(1) --> A
 * findColumn(26) --> Z
 * findColumn(27) --> AA
 * findColumn(52) --> AZ
 * findColumn(53) --> BA
 * findColumn(99) --> CU
 * findColumn(105) --> DA
 * findColumn(322) --> LJ
 * findColumn(567) --> UU
 * findColumn(702) --> ZZ
 */
public class Problem87 {
    public static String findColumn(int number){
        number = number -1;
        String[] character = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
        if(0 <= number && number <= 25) return character[number];
        
        StringBuilder result = new StringBuilder("");
        int a = number / 26;
        int b = number % 26;

        result.append(character[a-1]);
        result.append(character[b]);

        return result.toString();
    }
}
