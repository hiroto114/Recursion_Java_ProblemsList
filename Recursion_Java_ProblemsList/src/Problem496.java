/*
 * 文字列で構成される配列が与えられるので、文字列の配列の中から、
 * 最も長い共通の接頭辞を返す longestCommonPrefix という関数を作成してください。
 * 共通の接頭辞がない場合は、空文字列 "" を返してください。
 * 
 * longestCommonPrefix(["ccc","cbd","cbc","c"]) --> c
 * longestCommonPrefix(["Recurrence","Relation","Recursion","Restart"]) --> Re
 * longestCommonPrefix(["autopilot","autobiography","automobile","auto"]) --> auto
 * longestCommonPrefix(["divide","and","conquer"]) -->
 * 
 */
public class Problem496 {
    public static String longestCommonPrefix(String[] strArr){
        StringBuilder result = new StringBuilder(strArr[0]);
        for(int i=1;i<strArr.length;i++){
            result = new StringBuilder(longestCommonPrefixHelper(result.toString(),strArr[i]));
        }

        return result.toString();
    }

    public static String longestCommonPrefixHelper(String a,String b){

        StringBuilder result = new StringBuilder("");
        for(int i=0;i<Math.min(a.length(),b.length());i++){
            if(a.substring(i,i+1).equals(b.substring(i,i+1))){
                result.append(a.substring(i,i+1));
            }else{
                break;
            }
        }
        return result.toString();
        
    }
}
