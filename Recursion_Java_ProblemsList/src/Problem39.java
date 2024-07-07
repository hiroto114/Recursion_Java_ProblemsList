/**
 * Alberto は多言語対応のウェブサイト制作のチームに所属しています。
 * アクセスするユーザーの使用言語によって、サイトの表示を変更する仕組みを実装するようにマネージャーに指示されました。
 * 文字列 Japanese, English, Spanish, Russian が与えられるので、
 * 文字列によって www.example.org のサブディレクトリにリダイレクトする、redirectionUrl という関数を作成してください。
 * 例えば、この関数では Japanese が選択された時、www.example.org/ja を返します。
 * もし、上記以外の文字列が入力された時、www.example.org/ を返します。
 */
public class Problem39 {
    public static String redirectionUrl(String language){
        String baseUrl = "www.example.org/";
        String redirectUrl = "";
        switch (language) {
            case "English":
                redirectUrl = baseUrl + "en";
                break;
            case "Japanese":
                redirectUrl = baseUrl + "ja";
                break;
            case "Spanish":
                redirectUrl = baseUrl + "es";
                break;
            case "Russian":
                redirectUrl = baseUrl + "ru";
                break;
            case "German":
                redirectUrl = baseUrl;
                break;
            default:
                redirectUrl = baseUrl;                
                break;
        }
        return redirectUrl;
    }
}
