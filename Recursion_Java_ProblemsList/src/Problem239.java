/*
 * Lugo は仕事で () を頻繁に使っていました。
 * そのため、数字を打ち込むだけでキーボードの変換予測で、() が出てくる機能をパソコンに追加する予定です。
 * 自然数 n（n は 8 以下）が与えられるので、以下の条件を満たす括弧のパターン数を返す、conbinationsOfParenthesis という関数を作成してください。
 * 
 * 左カッコが右カッコで閉じられてる
 * 左カッコが右カッコによって正しい順で閉じられている
 * 例えば、3 が与えられたとき、()()() を使うことによって得られる括弧は、((())), (()()), (())(), ()(()), ()()() の 5 通りになります。
 * 
 * conbinationsOfParenthesis(1) --> 1
 * conbinationsOfParenthesis(2) --> 2
 * conbinationsOfParenthesis(3) --> 5
 * conbinationsOfParenthesis(5) --> 42
 * conbinationsOfParenthesis(7) --> 429
 * conbinationsOfParenthesis(8) --> 1430
 * 
 * 有効な鍵カッコには漸化式がある。
 * 以下、わかりやすいように、(()), ()() をまとめて {2} とします。先頭に () を固定すると、3 組の括弧は以下のように書き換えることができます。
(){2}, ({1}){1}, ({2})
したがって、n番目の括弧の組み合わせ数を Pnとすると、
P3=P2+P1⋅P1+P2=2+1+2=5になります。同様に 4 組の括弧を見てみると、
(){3} ({1}){2} ({2}){1} ({3})
したがって、
P4は P4=P3+P2⋅P1+P1⋅P2+P3=5+2+2+5=14となります。同様に、5 組の括弧を見てみると、
(){4}, ({1}){3}, ({2}){2}, ({3}){1}, ({4})
 * 
 */
public class Problem239 {
	// 再帰を使う。
	public static int conbinationsOfParenthesis(int num){
		if(num == 0) return 0;
		if(num == 1) return 1;
		if(num == 2) return 2;
		int result = 0;
		result += 2 * conbinationsOfParenthesis(num-1);
		for(int i=num-2 ; i>=1; i--){
			result += conbinationsOfParenthesis(i) * conbinationsOfParenthesis(num-1-i);
		}
		return result;

	}
}
