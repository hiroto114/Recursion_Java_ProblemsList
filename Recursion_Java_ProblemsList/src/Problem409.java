
/*
 * 問題 407 で 以下の Point クラスを作成しました。

double x: x 軸上の座標
double y: y 軸上の座標
問題 408 で 以下の Line クラスを作成しました。

Point startPoint: 線の始点
Point endPoint: 線の終点
double getLength(): 線の長さを返します。
四辺形オブジェクト（QuadrilateralShape）には、線分 AB、線分 BC、線分 CD、線分 DA が必要です。以下に従って、QuadrilateralShape クラスを作成し、テストケースを出力してください。

Line AB: 線分 AB
Line BC: 線分 BC
Line CD: 線分 CD
Line DA: 線分 DA
int getPerimeter(): 四角形の周囲の長さを返します。小数点以下は切り捨ててください。
int getArea(): 四角形の面積を返します。小数点以下は切り捨ててください。
 */
public class Problem409 {
	public static void main(String[] args){
		Line lineA = new Line(new Point(4,12), new Point(0,6));
		Line lineB = new Line(new Point(0,6), new Point(4,0));
		Line lineC = new Line(new Point(4,0), new Point(8,6));
		Line lineD = new Line(new Point(8,6), new Point(4,12));

		QuadrilateralShape rhombus = new QuadrilateralShape(lineA,lineB,lineC,lineD);

		System.out.println(rhombus.getPerimeter());
		System.out.println(rhombus.getArea());

		Line lineE = new Line(new Point(0,0), new Point(2,2));
		Line lineF = new Line(new Point(2,2), new Point(2,6));
		Line lineG = new Line(new Point(2,6), new Point(0,4));
		Line lineH = new Line(new Point(0,4), new Point(0,0));

		QuadrilateralShape parallelogram = new QuadrilateralShape(lineE,lineF,lineG,lineH);

		System.out.println(parallelogram.getPerimeter());
		System.out.println(parallelogram.getArea());


		Line lineI = new Line(new Point(0,0), new Point(4,0));
		Line lineJ = new Line(new Point(4,0), new Point(6,2));
		Line lineK = new Line(new Point(6,2), new Point(6,6));
		Line lineL = new Line(new Point(6,6), new Point(0,0));

		QuadrilateralShape trapezoid = new QuadrilateralShape(lineI,lineJ,lineK,lineL);

		System.out.println(trapezoid.getPerimeter());
		System.out.println(trapezoid.getArea());


		Line lineM = new Line(new Point(0,4), new Point(4,10));
		Line lineN = new Line(new Point(4,10), new Point(8,4));
		Line lineO = new Line(new Point(8,4), new Point(4,0));
		Line lineP = new Line(new Point(4,0), new Point(0,4));

		QuadrilateralShape kite = new QuadrilateralShape(lineM,lineN,lineO,lineP);

		System.out.println(kite.getPerimeter());
		System.out.println(kite.getArea());

		Line lineQ = new Line(new Point(0,0), new Point(8,0));
		Line lineR = new Line(new Point(8,0), new Point(10,12));
		Line lineS = new Line(new Point(10,12), new Point(2,6));
		Line lineT = new Line(new Point(2,6), new Point(0,0));

		QuadrilateralShape other = new QuadrilateralShape(lineQ,lineR,lineS,lineT);

		System.out.println(other.getPerimeter());
		System.out.println(other.getArea());
	}
}
class QuadrilateralShape{
	public Line lineAB;
	public Line lineBC;
	public Line lineCD;
	public Line lineDA;

	public QuadrilateralShape(Line lineAB,Line lineBC,Line lineCD,Line lineDA){
		this.lineAB = lineAB;
		this.lineBC = lineBC;
		this.lineCD = lineCD;
		this.lineDA = lineDA;
	}

	/*
	 * 四角形の周囲の長さを返します。小数点以下は切り捨ててください。
	 */
	public int getPerimeter(){
		return (int)(lineAB.getLength() + lineBC.getLength() + lineCD.getLength() + lineDA.getLength());
	}

	/*
	 * 四角形の面積を返します。小数点以下は切り捨ててください。
	 */
	public int getArea(){

		return (int)(0.5 * Math.abs(crossProduct(lineAB.endPoint,lineAB.startPoint) + 
									crossProduct(lineBC.endPoint,lineBC.startPoint) +
									crossProduct(lineCD.endPoint,lineCD.startPoint) +
									crossProduct(lineDA.endPoint,lineDA.startPoint)
									)
					);
	}
	public double crossProduct(Point X, Point Y){
		return X.x * Y.y - X.y * Y.x;
	}
}
