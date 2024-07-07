import java.util.ArrayList;
import java.util.List;

/*
 * Sam は a 駅、b 駅、... y 駅、z 駅とアルファベットが各駅の名前になっている路線の電車に乗っています。
 * Sam は自分が乗った駅から降りる駅まで、全ての停止場所を確認しました。
 * 乗車駅 firstAlphabet、降車駅 secondAlphabet が与えられるので、停止駅を配列として返す、
 * generateAlphabet という関数を定義してください。
 * ただし、アルファベットは大文字と小文字を区別せず、全て小文字で表示し、a に近い文字から返すようにしてください。
 * generateAlphabet('a','z') --> [a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z]
 * generateAlphabet('b','b') --> [b]
 * generateAlphabet('M','z') --> [m,n,o,p,q,r,s,t,u,v,w,x,y,z]
 */
public class Problem70 {
    public static char[] generateAlphabet(char firstAlphabet, char secondAlphabet){
        firstAlphabet = Character.toLowerCase(firstAlphabet);
        secondAlphabet = Character.toLowerCase(secondAlphabet);
        char temp;
        if(firstAlphabet>secondAlphabet){
            temp = firstAlphabet;
            firstAlphabet = secondAlphabet;
            secondAlphabet = temp;
        }


        List<Character> result = new ArrayList<Character>();
        for(char i = firstAlphabet;i<=secondAlphabet;i++){
            result.add(i);
        }

        char[] chars = new char[result.size()];

        for(int i=0;i<result.size();i++){
            chars[i] = result.get(i);
        }

        return chars;
    }
}
