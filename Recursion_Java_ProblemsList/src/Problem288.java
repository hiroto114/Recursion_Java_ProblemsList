/*
 * Pino は建設業者の一員としてダムを開発しました。
 * しかし、貯水量はどれくらいあるかまだ図っていません。
 * ダムの各地点の高さ一覧 height が与えられるので、ダムの貯水量（高さ * 幅）を返す waterCapacity という関数を作成してください。
 * ダムに囲まれた中で高さがある地点は、その高さだけ貯水量を引いてください。
 * 
 * waterCapacity([7,4,0,9]) --> 10
 * waterCapacity([16,4,8,0,9,10]) --> 19
 * waterCapacity([32,29,28,20,25,32]) --> 26
 * waterCapacity([2,3,4,5,3,1,2,8,19]) --> 9
 * waterCapacity([184,755,432,406,12,251,91,865,423,283,277,826,232,276,910,303,254]) --> 5456
 * waterCapacity([83,342,464,156,389,222,737,731,753,799,556,592,133,953,211,573,732,348,962,133,515,259,990,850,373,556,484,328,679,196]) --> 6649
 * waterCapacity([531,507,871,275,527,837,160]) --> 896
 * waterCapacity([152,347,126,453,886,293,858,286,979,492,768,753,323,744]) --> 2139
 * waterCapacity([898,748,137,527,417,377,473]) --> 542
 * waterCapacity([927,854,366,594,371,987,900,101,372,661,590,950,681,913,44,384,136,405,315,136,618,66,964,84]) --> 9675
 * 
 */
public class Problem288 {
    // もっと効率をあげたい。もっとだ。
    public static int waterCapacity(int[] height){
        int result = 0;
        int heightMax = 0;
        for(int i: height){
            if(heightMax < i) heightMax = i;
        }
        int leftMax  = 0;
        // 左から右へ
        for(int i=1; i<height.length-1; i++){
            leftMax = Math.max(leftMax, height[i-1]);
            result += (leftMax - height[i] > 0) ? leftMax - height[i]: 0;
        }

        int rightMax = 0;	
        // 右から左へ
        for(int i=height.length-2; i>0; i--){
            rightMax = Math.max(rightMax, height[i+1]);
            if(leftMax > rightMax){
                result -= leftMax - height[i] - rightMax;
            }
        }

        return result;
    }
}
