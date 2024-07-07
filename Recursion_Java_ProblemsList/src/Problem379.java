import java.text.DecimalFormat;

/*
 * ダイエット中の Carly は、運動によって計算上は体重がどれくらい減少しているはずなのかを調べることにしました。
 * 運動の種類と運動した時間（分）が与えられるので、運動によって消費したカロリーから体重が何キロになったのかを計算する
 * calcWeightByExercise という関数を定義してください。ただし、出力は小数第 2 位以降を切り取ってください。
 * 
 * Carly の現在の体重は 85.5kg とし、燃焼カロリーは MET（Metabolic Equivalent of Task）を使って計算します。
 * 1 分あたりの消費カロリーを求める計算式と 1 キロ消費するのに必要なカロリーおよび、運動ごとの運動強度（met）は以下の通りです。
 * 
 * 運動の種類	運動強度[met]
 * running	8
 * walking	3
 * tennis	5
 * rope jump	9
 * 1 分あたりの消費カロリー[キロカロリー] = 1 分あたりの運動強度[met] × 3.5 × 体重[Kg] ÷ 200
 * 1 キロ消費するのに必要なカロリー数 = 7700 キロカロリー
 */
public class Problem379 {
	public static double calcWeightByExercise(double weight, String exercise, int minutes) {
		int intensity = getExerciseIntensity(exercise);
		double caloriesBurned = calculateCaloriesBurned(weight, intensity, minutes);
		double newWeight = weight - (caloriesBurned / 7700);

		DecimalFormat df = new DecimalFormat("#.#");
		return Double.parseDouble(df.format(newWeight));
	}

	public static double calculateCaloriesBurned(double weight, int intensity, int minutes) {
		return (intensity * 3.5 * weight / 200) * minutes;
	}

	public static int getExerciseIntensity(String exercise){
		switch(exercise){
			case "walking":
				return 3;
			case "tennis":
				return 5;
			case "running":
				return 8;
			case "rope jump":
				return 9;
			default :
				return 0;
			}
	}

	public static void main(String[] args) {
		System.out.println(calcWeightByExercise(85.5, "running", 30)); // 例: 30分のランニング
	}
}
