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
    public static void main(String[] args) {
        System.out.println(middleSubstring("A").equals("A"));
        System.out.println(middleSubstring("AB").equals("A"));
        System.out.println(middleSubstring("ABC").equals("B"));
        System.out.println(middleSubstring("ABCD").equals("BC"));
        System.out.println(middleSubstring("ABCDE").equals("BC"));
        System.out.println(middleSubstring("ABCDEF").equals("CDE"));
        System.out.println(middleSubstring("ABCDEFG").equals("CDE"));
        System.out.println(middleSubstring("ABCDEFGH").equals("CDEF"));
        System.out.println(middleSubstring("ABCDEFGHI").equals("CDEF"));
        System.out.println(middleSubstring("ABCDEFGHIJ").equals("DEFGH"));
        System.out.println(middleSubstring("ABCDEFGHIJK").equals("DEFGH"));
        System.out.println(middleSubstring("ABCDEFGHIJKL").equals("DEFGHI"));
        System.out.println(middleSubstring("fundamental").equals("damen"));
    }

    public static String middleSubstring(String stringInput){
        if((stringInput.length() <= 2)) return stringInput.substring(0, 1);
        int start = stringInput.length()/2 - stringInput.length()/4;
        int length = stringInput.length()/2;
        return stringInput.substring(start, start + length);
    }
}
