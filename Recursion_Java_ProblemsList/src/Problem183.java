/*
 * Bona はスマホゲームで特定の時間になったらイベントが発生するような設定を作っています。
 * そこで時計の長針と短針によって生まれる角度を活用する予定です。
 * 時間を表す hour（12 未満）と min（60 未満）が与えられるので、長針と短針の角度を返す、findAngle という関数を作成してください。
 * 角度が小数になった場合は、小数点を切り捨ててください。
 */
public class Problem183 {
	public static int findAngle(int hour, int minute) {
		double hourAngle = 360 / 12 * hour + minute / 2.0;
		double minuteAngle = 360 / 60.0 * minute;

		if (minuteAngle > hourAngle) {
			return (int) Math.min(minuteAngle - hourAngle, 360 - (minuteAngle - hourAngle));
		}
		return (int) Math.min(hourAngle - minuteAngle, 360 - (hourAngle - minuteAngle));
	}
}
