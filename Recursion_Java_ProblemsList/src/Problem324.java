/*
 * 2 つのパス path1、path2 を受け取り、それらを結合する、twoPaths という関数を作成してください。
 * 
 * twoPaths("path1","path2") --> path1/path2
 * twoPaths("path1/","path2") --> path1/path2
 * twoPaths("path1","/path2") --> path1/path2
 * twoPaths("path1/","/path2") --> path1/path2
 * twoPaths("et","/quisquam") --> et/quisquam
 * twoPaths("nam/","/recusandae") --> nam/recusandae
 * twoPaths("expedita/","non") --> expedita/non
 * twoPaths("pariatur","/dolor") --> pariatur/dolor
 * 
 */
public class Problem324 {
    public static String twoPaths(String path1, String path2){
        
        path1 = path1.replaceAll("/", "");
        path2 = path2.replaceAll("/", "");
        return path1 + "/" + path2; 
    }
}
