/*
 * 4 << 1 = 8
 * computeShift(16,1) --> [8,32]
 * computeShift(0,0) --> [0,0]
 * computeShift(2,1) --> [1,4]
 * computeShift(3,1) --> [1,6]
 * computeShift(24,2) --> [6,96]
 * computeShift(128,3) --> [16,1024]
 * 
 */
public class Problem334 {
	public static int[] computeShift(int num, int n){
		int[] result = new int[2];
		result[0] = num >> n;
		result[1] = num << n;

		return result;
	}
}
