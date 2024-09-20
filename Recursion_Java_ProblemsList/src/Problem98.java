
/*
 * Bond はクラスの文化祭で行う劇で背景を制作することになり、現在は山を作っています。
 * 各地点での山の高さの一覧 height が与えられるので、山型になっているかどうか判断する isMountain という関数を定義してください。
 * 山型の条件は以下の通りです。
 * 配列のサイズが 3 以上であること
 * 高さは初めは上がり続け、一度下がったら下がり続けること（例：1,2,3,4,5,3,2,1）
 */
public class Problem98 {
    public static boolean isMountain(int[] height){
        int l = height.length;
        if (l <= 0 || height[0] > height[1]) return false;

        // 最大値・最小値・インデックスの初期値
        int max = (int)-Integer.MAX_VALUE;
        int min = (int)Integer.MAX_VALUE;
        int i = 0;

        // 昇順が終わるまで処理を繰り返します
        while (i < l && height[i] > max) {
            max = height[i];
            i++;
        }

        // 昇順のみの配列の場合、falseを返します
        if (i == l || max == height[i]) return false;

        // 降順が終わるまで処理を繰り返します
        while (i < l && height[i] < min) {
            min = height[i];
            i++;
        }

        // 配列の末尾まで降順が続いていなかったらfalseを返します
        return i == l;
    }
}
