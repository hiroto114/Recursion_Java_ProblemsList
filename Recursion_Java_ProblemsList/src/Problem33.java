/**
 * アルファベットを大文字、小文字に変換する
 * ランダムな英単語 word とアルファベット alphabet を受け取り、もしそのアルファベットが英単語に含まれていたら、
 * そのアルファベットより前の文字をすべて大文字にし、後ろの文字をすべて小文字に変換する toUpperheadLowerTail を作成してください。
 * もしアルファベットが複数含まれている場合は、最後に登場したものよりも前の部分をすべて大文字に変換し、
 * それ以降を小文字に変換してください。アルファベットが 1 つも使われていない場合はすべての文字を大文字にしてください。
 */
public class Problem33 {
    public static String toUpperHeadLowerTail(String word, char alphabet){
        int index = word.lastIndexOf(String.valueOf(alphabet));
        if(index ==-1) return word.toUpperCase();

        StringBuilder result = new StringBuilder("");

        for(int i=0;i<word.length();i++){
            if(i<index) result.append(Character.toUpperCase(word.charAt(i)));
            if(i>=index) result.append(Character.toLowerCase(word.charAt(i)));            
        }

        return result.toString();
    }
}
