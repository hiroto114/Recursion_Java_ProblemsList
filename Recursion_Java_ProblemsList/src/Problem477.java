public class Problem477 {
	public static int videosToWatch(int[] time, int dailyGoal) {
		int helper = 0;
		for (int i = 0; i < time.length; i++) {
			helper += time[i];
			if (helper >= dailyGoal) {
				return i + 1;
			}
		}

		return -1;
	}
}
