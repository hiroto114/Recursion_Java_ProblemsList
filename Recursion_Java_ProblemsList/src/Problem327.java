/*
 * アメリカ合衆国では郵便番号として Zipcode が使われています。
 * 文字列 zipcode が与えられるので、それが有効かどうか確かめる、isZipcodeValid という関数を作成してください。 
 * 有効な Zipcode の条件は以下になります。
 * 
 * 5 桁であること
 * 空白を含まないこと
 * 文字を含まないこと
 * 
 */
public class Problem327 {
    public static boolean isZipcodeValid(String zipcode){
        if(zipcode.length()!=5) return false;
        if(zipcode.contains(" ")) return false;
        if(zipcode.matches("[0-9]{5}")) return true;
        return false;
    }
}
