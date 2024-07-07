/**
 * CSS Bootstrap は 4 つのクラスを持つグリッドシステムを使っています。
 * これを利用すれば、ウェブページをユーザーのデバイスに最適化して表示することができます。
 * スクリーンサイズ screenWidth が与えられるので、適切な css クラスを文字列で返す、
 * getBootstrapClass という関数を作成してください。
 * スクリーンサイズは自然数としてプログラムを作成してください。
 */
public class Problem11 {
    public static String getBootstrapClass(int screenWidth){
        if(screenWidth >= 1200) return "lg";
        if(screenWidth >= 992) return "md";
        if(screenWidth >= 768) return "sm";
        return "xs";
    }
}
