/*
 * 文字列の真ん中を返す
 * middleSubstring("A") --> A
 * middleSubstring("AB") --> A
 * middleSubstring("ABC") --> B
 * middleSubstring("ABCD") --> BC
 * middleSubstring("ABCDE") --> BC
 * middleSubstring("ABCDEF") --> CDE
 * middleSubstring("ABCDEFG") --> CDE
 * middleSubstring("ABCDEFGH") --> CDEF
 * middleSubstring("ABCDEFGHI") --> CDEF
 * middleSubstring("ABCDEFGHIJ") --> DEFGH
 * middleSubstring("ABCDEFGHIJK") --> DEFGH
 * middleSubstring("ABCDEFGHIJKL") --> DEFGHI
 * middleSubstring("fundamental") --> damen
 * 
 * 考え方として、上記パターンに対する実験をして、3文字以上の長さのときにはこの番目からこの文字長分取ってくるよねを
 * 調べていく。
 * とにかく書いて実験をしてパターンをつかむこと。それをしないとずーっと頭の中でボーっとして解答がつかめない。
 */
public class Problem25 {
    public static String middleSubstring(String stringInput){
        if((stringInput.length()<=2)) return stringInput.substring(0,1);

        return stringInput.substring(
            middleSubstringHelper(stringInput.length())-1
            ,middleSubstringHelper(stringInput.length())-1 + stringInput.length()/2
        );
    }

    public static int middleSubstringHelper(int input){
        for(int i=1;true;i++){
            if(input >= (i)*(i+1)/2 && input <= (i+1)*(i+2)/2){
                return i-1;
            }
        }
    }
}
