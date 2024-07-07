/*
 * Donald は、飛行機へ搭乗しており、自分と向かい側に座る人が誰なのかを見つけようとしています。
 * Donald の番号 seat、搭乗席の長さ len が与えられるので、自分と反対側の番号を返す、oppositeSeat という関数を作成してください。
 * 搭乗席は左側を奇数、右側を偶数として以下のように番号が振られています。
 * 
 */
public class Problem322 {
	public static int oppositeSeat(int seat, int len){
		return 2*len - seat + 1;
	}
}
