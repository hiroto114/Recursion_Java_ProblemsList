/*
 * x-y 平面上の全ての点は (x,y) と表現することができます。以下に従って、Point クラスを作成し、テストケースを出力してください。

double x: x 軸上の座標
double y: y 軸上の座標
 */
public class Problem407 {
	public static void main(String[] args){
		Point a = new Point(3,1);
		Point b = new Point(3,6);

		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println(b.x);
		System.out.println(b.y);
	}
}
class Point{
	public int x;
	public int y;
	Point(int x1,int y1){
		x=x1;
		y=y1;
	}
}
