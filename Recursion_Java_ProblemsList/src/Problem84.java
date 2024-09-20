
/*
 * Botti は新しい商品を開発し、商標登録を試みました。
 * しかし、Botti が考えた名前はすでに登録されていました。
 * そこで、考えた名前の子音のみを逆から表示させることで、名前の重複を避けようと考えました（例：water→ratew）。
 * Botti が考えた商品名 string が与えられるので、その中に含まれる子音のみを反転させる、reverseConsonants という関数を定義してください。
 * ただし、与えられる文字列は全て小文字とします。
 */
public class Problem84 {
    public static String reverseConsonants(String string){
        int first = 0;
        int last = string.length()-1;

        StringBuilder result = new StringBuilder(string);
        char temp = 'A';
        while(first<last){
            while(isVowel(result.charAt(first))&&first<last) first++;
            while(isVowel(result.charAt(last))&&first<last) last--;
            temp = result.charAt(last);
            result.setCharAt(last,result.charAt(first));
            result.setCharAt(first,temp);
            first++;
            last--;
        }

        return result.toString();
    }

    public static boolean isVowel(char input){
        return (input=='a')||(input=='i')||(input=='u')||(input=='e')||(input=='o');
    }
}
