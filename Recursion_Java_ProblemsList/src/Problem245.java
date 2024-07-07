import java.util.Stack;

/*
 * ゲームクリエイターの Levy は、ゲーム内で暗号を解かなければ開かない扉を設置しました。
 * その暗号は、アルファベットの I と D のみで構成されています。I は増加（increasing）、D は減少（decreasing）を意味しており、
 * 表示された文字列によって答えの数値が変わります。I と D で構成された文字列 code が与えられるので、
 * 答えとなる数値を返す getNumber という関数を作成してください。ただし、1 から 9 までの数字のみ使用可能とし、各値は 1 回しか使えないものとします。もし文字数が 8 を超えたら 0 を返してください。
 * 
 * 例えば、D の場合、1 回分減少しなければいけません。このような条件を満たす数値のうち最小の値は 21 になります。
 * IIDDD の場合、各値は 1 回のみしか使えないので、増加、減少を考慮すると、最小の値は 126543 になります。
 * 
 * etNumber("D") --> 21
 * getNumber("I") --> 12
 * getNumber("DD") --> 321
 * getNumber("IIDDD") --> 126543
 * getNumber("DDIDDIID") --> 321654798
 * getNumber("DIIDIDDD") --> 213549876
 * getNumber("IIIDIDDD") --> 123549876
 * getNumber("DIIDIDDDIID") --> 0
 * 
 * IIDDD の例。126543
I : 1 -> pop
I : 2 -> pop
D : 3
D : 3 4
D : 3 4 5
最後に6を追加して 3 4 5 6 -> pop


IIDDDI の例。1265437
I : 1 -> pop
I : 2 -> pop
D : 3
D : 3 4
D : 3 4 5
I : 3 4 5 6 -> pop
最後に7を追加して、pop


DIIDIDDD の例。213549876
D : 1
I : 1 2 -> pop
I : 3 -> pop
D : 4
I : 4 5 -> pop
D : 6
D : 6 7
D : 6 7 8
最後に 9 を追加して、6 7 8 9 -> pop
 * 
 */
public class Problem245 {
    public static String getNumber(String code){
        if(code.length() > 8) return "0";

        String result = "";
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i <= code.length();i++){
            stack.push(i+1);
            if (i == code.length() || code.charAt(i) == 'I'){
                while (stack.size() > 0) result += stack.pop();
            }
        }
        return result;
    }
}
