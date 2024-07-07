import java.util.Arrays;

/*
 * Holland はテーマパークを経営しています。テーマパークには 10 つの施設があり、安全のために定期点検が必要でした。
 * そこで毎日、以下のルールを設けて点検を行う施設を決めています。開場している施設を 1、点検している施設を 0 と表示している
 * 施設一覧が与えられた時、day 日後の各施設の状態を返す、getAmusementParkState という関数を作成してください。
 * 
 * 隣接している施設が両方とも点検中、または開場している場合、翌日開場します
 * 上記以外の場合、翌日点検します
 * 例えば、[0,1,1,0,0,1,0,0], 5 を見てみましょう。
 * 
 * 0 日目: [0,1,1,0,0,1,0,0]
 * 1 日目: [0,0,0,0,0,1,0,0]
 * 2 日目: [0,1,1,1,0,1,0,0]
 * 3 日目: [0,0,1,0,1,1,0,0]
 * 4 日目: [0,0,1,1,0,0,0,0]
 * 5 日目: [0,0,0,0,0,1,1,0]
 */
public class Problem313 {
	// 鳩ノ巣原理でかんがえればいけそう。考え中。longが8300000000でも1000000000000000でも対応できる。
	// 上記についてアルゴリズムの設計をしていたけど、大丈夫そうだった。
	// ポイントは施設が10個しかないこと。間の8個の施設のパターンは高々256パターンしかないので
	// 初めの値が途中で繰り返されることになる。だからその距離さえわかればlong値分計算しなくても　　
	// O(n)で検査出来る。これだな。これでバカでかい計算量を大幅に短縮。
	// 時間計算量を大幅に削減するためにソースコードが滅茶苦茶難しくなる。
	public static int[] getAmusementParkState(int[] initial, long day){
		int[] resultAfterOneDay = new int[initial.length];

		for(int i=1; i<initial.length-1; i++){
			if(initial[i-1] == initial[i+1]){
				resultAfterOneDay[i] = 1;
			}
			if(initial[i-1] != initial[i+1]){
				resultAfterOneDay[i] = 0;
			}
		}

		// 下記処理がおかしい気がする。直そう。
		int repeatDay = 0;
		int[] resultAfterOneDayClone = resultAfterOneDay.clone();
		int[] resultAfter = new int[initial.length];
		for(int i=2; i<=257; i++){
			for(int m=1;m<initial.length-1;m++){
				if(resultAfterOneDayClone[m-1] == resultAfterOneDayClone[m+1]){
					resultAfter[m] = 1;
				}
				if(resultAfterOneDayClone[m-1] != resultAfterOneDayClone[m+1]){
					resultAfter[m] = 0;
				}
			}
			if(Arrays.equals(resultAfterOneDay, resultAfter)){
				repeatDay = i - 1;
				break;
			}
			resultAfterOneDayClone = resultAfter.clone();
		}
		long targetDay = (day % repeatDay == 0)? repeatDay: day - repeatDay * (day / repeatDay);
		if(targetDay == 1l) return resultAfterOneDay;
		int[] result = new int[initial.length];
		for(long i=2l;i<=targetDay;i+=1l){
			for(int m=1;m<initial.length-1;m++){
				if(resultAfterOneDay[m-1] == resultAfterOneDay[m+1]){
					result[m] = 1;
				}
				if(resultAfterOneDay[m-1] != resultAfterOneDay[m+1]){
					result[m] = 0;
				}
			}
			resultAfterOneDay = result.clone();
		}
		return result;
	}
}
