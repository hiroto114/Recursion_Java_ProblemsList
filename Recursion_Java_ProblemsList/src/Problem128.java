/*
 * Whalum はマッチングアプリを開発しており、ユーザー同士の共通点を表示するシステムを実装しています。
 * ユーザー1 の属性 string1、ユーザー2 の属性 string2 が与えられるので、
 * 共通の連続部分文字列を返す、findLongestCommonSubstring という関数を定義してください。
 * 共通の文字列が複数ある場合は最大の長さのものを返してください。また、最大の長さの文字列が複数ある場合は先に出てきた方を優先します。
 */
public class Problem128 {
    public static String findLongestCommonSubstring(String string1, String string2){
        for(int i=string1.length();i>=1;i--){
            for(int m=0;m+i<=string1.length();m++){
                System.out.println(i);
                System.out.println(m);

                System.out.println(string1.substring(m,m+i));
                if(string2.contains(string1.substring(m,m+i))){
                    return  string1.substring(m,m+i);
                }
            }
        }

        return "";
    }
}
