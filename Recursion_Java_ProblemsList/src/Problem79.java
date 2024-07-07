import java.util.Arrays;

/*
 * 昔、世界中に巨人が蔓延っており、人類は身を守るために至る所で壁を建設しました。
 * 様々な場所の壁の高さ walls と巨人の身長 taitanHeight が与えられるので、
 * 最も高い壁と巨人の身長差を返す wallAndMaxTaitan という関数を作成してください。
 * 壁の高さが巨人より低い場合、その差を負の数で表してください。
 */
public class Problem79 {
	/*
	 * int型配列の最大値取得にstreamかなり使えるな。。
	 */
    public static int wallAndMaxTaitan(int[] walls, int taitanHeight){
        return Arrays.stream(walls).max().getAsInt()-taitanHeight;
    }
}
