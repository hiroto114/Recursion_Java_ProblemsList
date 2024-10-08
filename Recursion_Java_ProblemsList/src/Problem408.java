
/*
 * x-y 平面上の線は、始点と終点によって定義することができます。
 * この Line クラスには、2 つの Point オブジェクトを引数として受け取るコンストラクタがあり、
 * Line オブジェクトの始点および終点に代入されます。以下に従って、Line クラスを作成し、テストケースを出力してください。

Point startPoint: 線の始点
Point endPoint: 線の終点
double getLength(): 線の長さを返します。
 */
public class Problem408 {
	public static void main(String[] args){
		Point a = new Point(3,1);
		Point b = new Point(3,6);
		Line lineAB = new Line(a, b);
		System.out.println((int)lineAB.getLength());

		Point c = new Point(1,3);
		Point d = new Point(6,15);
		Line lineCD = new Line(c, d);
		System.out.println((int)lineCD.getLength());     
	}
}

