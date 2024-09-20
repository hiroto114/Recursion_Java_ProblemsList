
/*
 * 文字で構成される配列 charList が与えられるので、
 * 大文字は小文字に、小文字は大文字に変換し新しい配列を返す swapCase という関数を map 関数を使用して作成してください。
 * 
 * swapCase(['l','A','m','b','D','A']) --> [L,a,M,B,d,a]
 * swapCase(['a','E','s','P','A']) --> [A,e,S,p,a]
 * swapCase(['f','U','N','c','T','I','o','n']) --> [F,u,n,C,t,i,O,N]
 */
public class Problem439 {
    public static char[] swapCase(char[] charList){
        char[] result = new char[charList.length];
        int resultPointer = 0;
        for(char a : charList){
            if(Character.isLowerCase(a)){
                result[resultPointer++] = Character.toUpperCase(a);
            }
            if(Character.isUpperCase(a)){
                result[resultPointer++] = Character.toLowerCase(a);
            }
        }

        return result;
    }
}
