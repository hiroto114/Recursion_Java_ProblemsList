
import java.util.ArrayList;
import java.util.List;

/*
 * 整数と単位（mm, m, km）が文字列のリスト l が与えられるので、
 * map を使って m に変換し、filter を使って 100m 以上のリストを返す over100m という関数を作成してください。
 * 
 * over100m(["111m","2222222mm","3km","4m"]) --> [111,2222.222,3000]
 * over100m(["203658mm","745217mm","314035mm","4km","1km"]) --> [203.658,745.217,314.035,4000,1000]
 * over100m(["3km","690m","428288mm","9km","52379mm"]) --> [3000,690,428.288,9000]
 * over100m(["5km","1km","748431mm","985m","1km"]) --> [5000,1000,748.431,985,1000]
 */
public class Problem556 {
	public static double[] over100m(String[] l) {
		List<Double> list = new ArrayList<Double>();
		for (int i = 0; i < l.length; i++) {
			if (l[i].contains("km")) {
				if (Double.parseDouble(l[i].substring(0, l[i].length() - 2)) * 1000 >= 100) {
					list.add(Double.parseDouble(l[i].substring(0, l[i].length() - 2)) * 1000);
				}
				continue;
			}
			if (l[i].contains("mm")) {
				if (Double.parseDouble(l[i].substring(0, l[i].length() - 2)) / 1000 >= 100) {
					list.add(Double.parseDouble(l[i].substring(0, l[i].length() - 2)) / 1000);
				}
				continue;
			}
			if (Double.parseDouble(l[i].substring(0, l[i].length() - 1)) >= 100) {
				list.add(Double.parseDouble(l[i].substring(0, l[i].length() - 1)));
			}
		}

		return list.stream().mapToDouble(Double::doubleValue).toArray();
	}
}
