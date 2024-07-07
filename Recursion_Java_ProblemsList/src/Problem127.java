/*
 * Whalum はマッチングアプリを開発しており、ユーザー同士で共通点があるほど相性が良いことを表すシステムを実装しています。
 * ユーザー1 の属性 user1、ユーザー2 の属性 user2 が与えられるので、共通で持つ連続部分文字列の最大の長さを返す、longestCommonSubstringLength という関数を定義してください。
 * 
 * longestCommonSubstringLength("abcrdef","abcvdef") --> 3
longestCommonSubstringLength("abeoi","abkoi") --> 2
longestCommonSubstringLength("abeoipls","abkoipls") --> 5
longestCommonSubstringLength("abcdefgh","cubcdpor") --> 3
longestCommonSubstringLength("abcdaf","zbcdf") --> 3
longestCommonSubstringLength("abcdaf","axbycz") --> 1
longestCommonSubstringLength("abcdaf","abcdak") --> 5
longestCommonSubstringLength("abcd","abcd") --> 4
longestCommonSubstringLength("substringproblem","subproblem") --> 7
longestCommonSubstringLength("problem","prooblem") --> 5
 */
public class Problem127 {
    public static int longestCommonSubstringLength(String string1, String string2){

        for(int i=string1.length(); i>=1; i--){
            for(int m=0; m<=string1.length()-i; m++){
                if(string2.contains(string1.substring(m,m+i))) return i;
            }
        }
        return 0;
    }
}
