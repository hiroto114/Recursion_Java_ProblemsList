/*
 * x-y 平面上の 4 つの点、A（ax,ay）、B（bx,by）、C（cx,cy）、D（dx,dy）が与えられるので、ABCD の形を文字列で返す、getShapeType という関数を作成してください。
 * 
 * getShapeType(1,1,2,2,3,3,4,4) --> not a quadrilateral
 * getShapeType(1,1,2,2,3,3,-1,-1) --> not a quadrilateral
 * getShapeType(0,0,1,1,0,0,1,1) --> not a quadrilateral
 * getShapeType(0,0,1,0,1,1,4,-5) --> other（その他）
 * getShapeType(0,0,0,1,1,1,0,0) --> not a quadrilateral
 * getShapeType(0,2,2,2,2,4,0,4) --> square（正方形）
 * getShapeType(3,3,3,-3,-3,-3,-3,3) --> square（正方形）
getShapeType(0,0,5,5,10,0,5,-5) --> square（正方形）
getShapeType(0,0,5,0,8,4,3,4) --> rhombus（ひし形）
getShapeType(-1,2,8,5,5,-4,-4,-7) --> rhombus（ひし形）
getShapeType(2,7,1,3,-3,2,-2,6) --> rhombus（ひし形）
getShapeType(0,0,5,0,5,8,0,8) --> rectangle（長方形）
getShapeType(-7,2,5,6,7,0,-5,-4) --> rectangle（長方形）
getShapeType(1,6,-5,-2,-1,-5,5,3) --> rectangle（長方形）
getShapeType(0,0,5,0,8,8,3,8) --> parallelogram（平行四辺形）
getShapeType(-1,5,3,3,6,-4,2,-2) --> parallelogram（平行四辺形）
getShapeType(-4,3,5,6,2,-2,-7,-5) --> parallelogram（平行四辺形）
getShapeType(-2,0,5,0,8,8,-1,8) --> trapezoid（台形）
getShapeType(-1,5,-3,1,3,-2,3,3) --> trapezoid（台形）
getShapeType(-3,3,1,5,4,-1,1,-5) --> trapezoid（台形）
getShapeType(0,0,5,3,0,8,-5,3) --> kite（凧）
getShapeType(-5,7,2,6,5,-3,-4,0) --> kite（凧）
getShapeType(-1,5,3,1,-1,-1,-5,1) --> kite（凧）
getShapeType(0,1,2,3,3,4,2,1) --> not a quadrilateral
getShapeType(-2,1,2,6,3,4,4,2) --> not a quadrilateral
getShapeType(-3,0,-2,6,-1,2,-2,1) --> not a quadrilateral
getShapeType(0,0,8,0,10,12,2,6) --> other（その他）
getShapeType(-2,5,4,2,4,-4,-4,-4) --> other（その他）
getShapeType(0,0,1,2,3,2,1,1) --> other（その他）
 * 
 */
public class Problem198 {
	public static String getShapeType(int ax, int ay, int bx, int by, int cx, int cy, int dx, int dy) {
		Point A = new Point(ax, ay);
		Point B = new Point(bx, by);
		Point C = new Point(cx, cy);
		Point D = new Point(dx, dy);

		Line AB = new Line(A, B);
		Line BC = new Line(B, C);
		Line CD = new Line(C, D);
		Line DA = new Line(D, A);
		Line AC = new Line(A, C);
		Line BD = new Line(B, D);

		Square ABCD = new Square(AB, BC, CD, DA, AC, BD);

		if (ABCD.isSquare(ABCD))
			return "not a quadrilateral";
		if (ABCD.isSameLengthAll(ABCD) && ABCD.isSameDiagonal(ABCD) && ABCD.isSameTilt(ABCD))
			return "square（正方形）";
		if (ABCD.isSameLengthAll(ABCD) && ABCD.isSameTilt(ABCD))
			return "rhombus（ひし形）";
		if (ABCD.isSameLengthTwoSide(ABCD) && ABCD.isSameDiagonal(ABCD) && ABCD.isSameTilt(ABCD))
			return "rectangle（長方形）";
		if (ABCD.isSameLengthTwoSide(ABCD) && ABCD.isSameTilt(ABCD))
			return "parallelogram（平行四辺形）";
		if (ABCD.isSameLengthOneSide(ABCD) && ABCD.isDiagonalXross(ABCD))
			return "trapezoid（台形）";
		if (ABCD.isSameLengthBothSide(ABCD) && ABCD.isDiagonalXross(ABCD))
			return "kite（凧）";

		return "other（その他）";

	}
}

class Point {
	public int x;
	public int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Square {
	public Line AB;
	public Line BC;
	public Line CD;
	public Line DA;
	public Line AC;
	public Line BD;

	public Square(Line AB, Line BC, Line CD, Line DA, Line AC, Line BD) {
		this.AB = AB;
		this.BC = BC;
		this.CD = CD;
		this.DA = DA;
		this.AC = AC;
		this.BD = BD;

	}

	//傾きget
	public String getTilt(Line xline) {
		double yAbs = xline.startPoint.y - xline.endPoint.y;
		double xAbs = xline.startPoint.x - xline.endPoint.x;
		if (xAbs == 0) return "x=";
		else if (yAbs == 0) return "y=";
		else return String.valueOf(yAbs / xAbs);
	}

	//長さget
	public double getLength(Line a) {
		return Math.sqrt(Math.pow(Math.abs(a.startPoint.x - a.endPoint.x), 2) + Math.pow(Math.abs(a.startPoint.y - a.endPoint.y), 2));
	}

	//四角チェック
	public boolean isSquare(Square a) {
		return isSamePoint(a) || isLengthZero(a) || isSameTiltSide(a);
	}

	//チェック中身
	//一つの点の両サイドの傾きが同じか(y/x)
	public boolean isSameTiltSide(Square a) {
		return a.getTilt(AB).equals(a.getTilt(BC)) || a.getTilt(BC).equals(a.getTilt(CD)) || a.getTilt(CD).equals(a.getTilt(DA)) || a.getTilt(DA).equals(a.getTilt(AB)) ? true : false;
	}

	//lengthが0 = 隣の点と重なっている
	public boolean isLengthZero(Square a) {
		return getLength(a.AB) == 0 || getLength(a.BC) == 0 || getLength(a.CD) == 0 || getLength(a.DA) == 0 ? true
				: false;
	}

	//対角の点が同じ場所に点があるか
	public boolean isSamePoint(Square a) {
		return a.AB.startPoint.equals(a.BC.endPoint) || a.BC.startPoint.equals(a.CD.endPoint);
	}

	//台形、タコは対角の２辺が平行ではない
	public boolean isSameTilt(Square a) {
		return a.getTilt(AB).equals(a.getTilt(CD)) && a.getTilt(BC).equals(a.getTilt(DA));
	}

	//１組が平行なら台形,それ以外は凧
	public boolean isSameLengthOneSide(Square a) {
		return a.getTilt(AB).equals(a.getTilt(CD)) || a.getTilt(BC).equals(a.getTilt(DA));
	}

	//凧は隣り合った辺の長さが等しい,かつ,対角も等しい
	public boolean isSameLengthBothSide(Square a) {
		return a.getLength(AB) == a.getLength(BC) && a.getLength(CD) == a.getLength(DA) || a.getLength(BC) == a.getLength(CD) && a.getLength(DA) == a.getLength(AB);
	}

	//ひし形、正方形は全ての辺が等しい
	public boolean isSameLengthAll(Square a) {
		return a.getLength(AB) == a.getLength(BC) && a.getLength(CD) == a.getLength(DA) && a.getLength(BC) == a.getLength(CD) && a.getLength(DA) == a.getLength(AB);
	}

	//長方形、平行四辺形は対面が等しい
	public boolean isSameLengthTwoSide(Square a) {
		return a.getLength(AB) == a.getLength(a.CD) && a.getLength(a.BC) == a.getLength(a.DA);
	}

	//対角線が等しいか
	public boolean isSameDiagonal(Square a) {
		return a.getLength(AC) == a.getLength(BD);
	}

	//対角線が交わるか
	public boolean isDiagonalXross(Square a) {
		if (isVector(a.AB).equals(isVector(a.CD)) || isVector(a.BC).equals(isVector(a.DA)))
			return false;
		return true;
	}

	//線のx方向の向きをa,bで区別a→ b←
	public String isVector(Line XX) {
		String ans = "";
		System.out.println(XX.startPoint.y);
		if (XX.startPoint.x > XX.endPoint.x) {
			ans = ans + "b";
		} else if (XX.startPoint.x < XX.endPoint.x) {
			ans = ans + "a";
		} else if (XX.startPoint.y > XX.endPoint.y) {
			ans = ans + "b";
		} else
			ans = ans + "a";
		return ans;
	}
}
