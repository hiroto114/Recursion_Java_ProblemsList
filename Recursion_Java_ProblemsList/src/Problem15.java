/**
 * 高さ height と幅 width が与えられるので、デバイスの向きを返す、
 * screenViewMode という関数を定義してください。
 * もし、高さが幅以上の場合、portrait を返し、それ以外の場合では landscape を返します。
 * @author 0me6-
 *
 */
public class Problem15 {
    public static String screenViewMode(int height, int width){
        return (height >= width) ? "portrait" : "landscape";
    }
}
