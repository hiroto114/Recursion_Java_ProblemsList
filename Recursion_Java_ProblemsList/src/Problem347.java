/*
 * Ken はバスで田舎を長旅する計画を立てました。
 * 旅路は n 本のバスの路線からなり、乗らなければならない順に、1 から n までの番号が振られています。
 * i 番目のバスは毎日運行しているわけではなく、Ai の倍数日目にしか乗ることができません。
 * 例えば、配列 A [5,6] が与えられたとき、1 番目のバスには 5、10、15、20...日目、2 番目のバスには6、12、18、24...日目しか乗ることができません。
 * ただしバスは非常に速いため、同じ日に何本でも乗ることができるとします。
 * 
 * また、Ken は m 日目までに旅を終えなければなりませんが、できるだけ遅い日に旅を始めたいと思っています。
 * バスの運行情報を表す配列 info と旅の期限 m が与えられるので、最遅で何日目に最初のバスに乗らなければならないか返す、
 * getLatestDay という関数を作成してください。ただし、m 日目までに旅を終えられることが保証されていると仮定します。
 * 
 * それでは例を見てみましょう。[5,4,7]、15 が与えられた場合、最初のバスに 10 日目に乗り、2 番目のバスに 12 日目に乗り、
 * 最後のバスへ 14 日目へ乗ると、15日までに旅を終えることができるでしょう。したがって、このケースでは 10 を戻り値として返します。
 * 
 * getLatestDay([2,1],6) --> 6
getLatestDay([5,4,7],15) --> 10
getLatestDay([5,7,5,3],20) --> 10
getLatestDay([13,169,12,144,400,20],505) --> 169
getLatestDay([23,37,53,61,79,88],231) --> 69
getLatestDay([11,13,19,24,37],84) --> 44
getLatestDay([4,5],6) --> 4
getLatestDay([8,3,2],10) --> 8
getLatestDay([8,4,2],10) --> 8
getLatestDay([118,206,3,7],711) --> 590
getLatestDay([23,102,45,74,63],475) --> 299
getLatestDay([77,55,99,44],1033) --> 924
 */
public class Problem347 {
	public static int getLatestDay(int[] info, int m){
		int[] heighestInfo = new int[info.length];
		for(int i=0;i<info.length;i++){
			heighestInfo[i] = getHighestInfo(m,info[i]);
		}

		for(int i=0;i<info.length-1;i++){
			if(heighestInfo[i]-heighestInfo[i+1]>0){
				heighestInfo[i] -= info[i];
				i = -1;
			}
		}
		return heighestInfo[0];

	}

	public static int getHighestInfo(int m,int n){
		int result = 0;
		System.out.println(m);
		System.out.println(n);
		while(m>0){
			if(m%n==0){
				result = m;
				break;
			}
			m -= 1;
		}
		System.out.println(result);
		return result;

	}
}
