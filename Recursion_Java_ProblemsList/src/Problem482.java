public class Problem482 {
	public static int getMinSteps(int n) {
		int[] helper = new int[n + 1];
		for (int i = 0; i < helper.length; i++) {
			if (i <= 1) {
				helper[i] = 0;
				continue;
			}
			if (i == 2 || i == 3) {
				helper[i] = 1;
				continue;
			}

			if (i % 3 == 0 && i % 2 == 0) {
				helper[i] = Math.min(
						Math.min(helper[i / 3] + 1, helper[i / 2] + 1), helper[i - 1] + 1);
				continue;
			}
			if (i % 3 == 0 && i % 2 != 0) {
				helper[i] = Math.min(helper[i / 3] + 1, helper[i - 1] + 1);
				continue;
			}
			if (i % 3 != 0 && i % 2 == 0) {
				helper[i] = Math.min(helper[i / 2] + 1, helper[i - 1] + 1);
				continue;
			}
			helper[i] = 1 + helper[i - 1];
		}

		return helper[n];
	}
}
