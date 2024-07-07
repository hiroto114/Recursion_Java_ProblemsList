/*
 * John はすごろくゲームで遊んでいます。そこでは 1 ターンで x 歩進んだ後に、y 歩後退する仕組みになっています。
 * 各ステージのクリアにかかる歩数一覧 stages が与えられるので、全てのステージをクリアするために必要なターン数を返す、
 * countSteps という関数を作成してください。ただし、x > y であるとします。
 * 
 * 例えば、x : 4, y : 1, stages : [6,9,11,4,5] と仮定しましょう。各ステージでの様子は以下のようになります。
 * 1 ステージ目: 4 -1, 4 => 2 回
 * 2 ステージ目: 4 -1, 4 -1, 4 => 3 回
 * 3 ステージ目: 4 -1, 4 -1, 4 -1, 4 => 4 回
 * 4 ステージ目: 4 => 1 回
 * 5 ステージ目: 4 -1, 4 => 2 回
 * したがって、クリアまでにかかるターン数は 12 になります。
 */
public class Problem250 {
	public static int countSteps(int x, int y, int[] stages){
		//ここから書きましょう
		int stepSum = 0;
		for (int stage: stages) {
			if (stage <= x) {
				stepSum += 1;
			} else {
				stepSum += 1 + Math.ceil((double)(stage - x) / (double)(x - y));
			}
		}
		return stepSum;
	}
}
