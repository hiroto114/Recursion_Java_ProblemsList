import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 出荷予定の荷物の体積を表す、正の整数で構成された配列 packages が与えられます。
 * 出荷チームは、体積の小さい荷物どうしをパッケージで梱包し、合計体積の新しい荷物を作成します。
 * この新しい荷物を作成するために使われた 2 つの荷物は配列から削除され、代わりに新しい荷物が元の配列に追加されます。
 * このサイクルは荷物が 1 つになるまで続きます。この処理で使われたパッケージの合計を返す、shipmentVolumePackages という関数を作成してください。
 * 
 * 例として、[5,3,10,9,4] を考えます。最初に使われるパッケージは、3 + 4 = 7 であり、出荷リストは [5,10,9,7] になります。
 * 次のサイクルでは、パッケージは 5 + 7 = 12、出荷リストは [10,9,12] になります。3 周期目のパッケージは 9 + 10 = 19、出荷リストは [12,19] になります。
 * 最後のサイクルではパッケージは 12 + 19 = 31、出荷リストは [31] になります。今まで使用した合計のパッケージは、7 + 12 + 19 + 31 = 69 となり、69 を返します。
 * 
 * shipmentVolumePackages([6,5,6]) --> 28
 * shipmentVolumePackages([5,3,10,9,4]) --> 69
 * shipmentVolumePackages([15]) --> 0
 * shipmentVolumePackages([1,2,3,4,5,6,10]) --> 80
 * shipmentVolumePackages([5,4,3,2,1]) --> 33
 * shipmentVolumePackages([45,65,20,3,4,5,66,19,23,3,1]) --> 700
 * 
 */
public class Problem274 {
	public static int shipmentVolumePackages(int[] packages){
		if(packages.length<=1) return 0;

		List<Integer> helper = Arrays.stream(packages)
				.boxed()
				.collect(Collectors.toList());
		int result = 0;

		while(helper.size()>=2){
			Collections.sort(helper);
			result += helper.get(0);
			result += helper.get(1);  
			helper.add(helper.get(0)+helper.get(1)); 

			helper.remove(helper.get(0));
			helper.remove(helper.get(0));         
		}
		return result;        
	}
}
