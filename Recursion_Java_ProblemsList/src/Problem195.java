import java.time.Duration;
import java.time.LocalDateTime;

/*
 * Katz はオリンピックまでのカウントダウンを自動で行う機械を作り、駅に設置しようとしています。
 * dateA（monthA, dayA, yearA）と dateB（monthB, dayB, yearB）が与えられるので、
 * dateB と dateA の間に何日間あるか返す、getDays という関数を作成してください。
 */
public class Problem195 {
	public static int getDays(int[] dateA, int[] dateB) {
		LocalDateTime beginSummerVacation = LocalDateTime.of(dateA[2], dateA[0], dateA[1], 0, 0);
		LocalDateTime endSummerVacation = LocalDateTime.of(dateB[2], dateB[0], dateB[1], 0, 0);
		Duration summerVacationDuration = Duration.between(beginSummerVacation, endSummerVacation);
		return (int) summerVacationDuration.toDays();
	}
}
