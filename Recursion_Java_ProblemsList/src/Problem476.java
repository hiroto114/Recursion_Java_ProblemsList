public class Problem476 {
	public static boolean canMakeTargetVal(int[] arr, int target) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int m = i + 1; m < arr.length; m++) {
				if (arr[i] + arr[m] == target)
					return true;
			}
		}

		return false;
	}
}
