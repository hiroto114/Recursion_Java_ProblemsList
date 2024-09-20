
import java.util.Arrays;
/*
 * Joe は web サイト作成をしており、pagination を担当することになりました。
 * URL によって構成される配列 urls、各ページのサイズ pageSize、特定のページ page が与えられるので、
 * 特定のページに表示される URL を返す、websitePagination という関数を作成してください。
 * 例えば、url1, url2, url3, url4, url5, url6, url7, url8, url9 の一覧があり、
 * 1 ページに含まれる URL の数が 3、現在作成しているページが 2 ページ目の場合、
 * 各ページに 3 つの URL が含まれることになるので、返される配列は 2 ページに含まれる url4, url5, url6 になります。
 */
public class Problem75 {
    public static String[] websitePagination(String[] urls, int pageSize, int page){
        if(page > urls.length/pageSize){
            return Arrays.copyOfRange(urls,pageSize*(page-1),urls.length);
        }

        return Arrays.copyOfRange(urls,pageSize*(page-1),pageSize*(page-1)+pageSize);

    }
}
