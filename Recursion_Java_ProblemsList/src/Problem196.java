import java.util.ArrayList;
import java.util.List;

/*
 * Carter は鉄道会社に勤めており、新しく開設する駅の担当になりました。
 * 電車の到着時刻と発車時刻は知らされていますが、駅にいくつプラットフォームを作成するかは決めていません。
 * 電車の到着時刻 arr と発車時刻 dep が与えられるので、電車を駅に停めるために最低限必要なプラットフォームの数を返す、
 * minimumPlatforms という関数を作成してください。以下の条件を考慮してください。
 * arr と dep の配列のサイズは同じ
 * 時刻表は（0000 - 2359）の間
 * 電車は必ず止まること（0 分停車はなし）
 * 前日繰越あり（駅に電車がないのに出発できない
 * 
 * minimumPlatforms([2010,1100,1500,1800,900,940],[910,1200,1120,1130,1900,2000]) --> 3
 * minimumPlatforms([950,1100,1500,1800,900,940],[910,1200,1120,1130,1900,2000]) --> 3
 * minimumPlatforms([900,940,950,1100,1500,1800],[910,1200,1120,1130,1900,2000]) --> 3
 * minimumPlatforms([900,940,950,1100,1120,1800],[1130,1200,1120,1130,1900,2000]) --> 5
 * minimumPlatforms([900,1100,1235],[1000,1200,1240]) --> 1
 * minimumPlatforms([900,940,950,1100,1120,1800],[1900,1200,1120,1130,1900,2000]) --> 5
 * minimumPlatforms([1538,1738,1232,1749,1222,1435,832],[1241,1647,1152,2258,2152,1841,934]) --> 4
 * minimumPlatforms([900,900,900],[900,900,900]) --> 6
 * minimumPlatforms([900,1000],[1000,1100]) --> 2
 * minimumPlatforms([1000,1100],[900,1000]) --> 2
 * 
 */
public class Problem196 {
    public static int minimumPlatforms(int[] arr, int[] dep) {
        List<int[]> events = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            events.add(new int[]{arr[i], 1});  // 到着イベント
            events.add(new int[]{dep[i], -1}); // 発車イベント
        }

        // イベントを時刻に基づいてソート。同じ時刻の場合は発車を先に。
        events.sort((a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return b[1] - a[1];
            }
        });

        System.out.println("Sorted Events: ");
        for (int[] event : events) {
            System.out.print("[" + event[0] + "," + event[1] + "] ");
        }
        System.out.println();

        int maxPlatforms = 0;
        int currentPlatforms = 0;
        List<int[]> queue = new ArrayList<>();

        for (int[] event : events) {
            // 発車イベントの場合
            if (event[1] == -1) {
                if (!queue.isEmpty()) {
                    // 同じ時刻の処理
                    if(queue.get(queue.size() - 1)[0] == event[0]){
                        maxPlatforms += 1;
                        queue.remove(0);
                    }else{
                        queue.remove(0);
                    }
                } else {
                    maxPlatforms += 1;
                }
            } else {
                // 到着イベントの場合
                queue.add(event);
                currentPlatforms = queue.size();
            }
            maxPlatforms = Math.max(maxPlatforms, currentPlatforms);
        }
        return maxPlatforms;
    }
}
