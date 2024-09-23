import java.util.Stack;

/*
 * Lawrence は G 社でインターンとして働いており、膨大な括弧をチェックする仕事を任されました。
 * () で構成される、文字列 parentheses が与えられるので、
 * 有効な括弧の中で最長の部分文字列の長さを返す、longestValidParentheses という関数を作成してください。
 * 
 * longestValidParentheses("())))()") --> 2
 * longestValidParentheses("(()()(") --> 4
 * longestValidParentheses("(())") --> 4
 * longestValidParentheses("()()((()())())") --> 14
 * longestValidParentheses("(") --> 0
 * longestValidParentheses("()") --> 2
 * longestValidParentheses("))(") --> 0
 * longestValidParentheses("())") --> 2
 * longestValidParentheses(")))(((()))))()") --> 8
 * longestValidParentheses("((((((()))))))))") --> 14
 * longestValidParentheses(")())))(((()()(()()(") --> 4
 * 
 * ■解法（基本的にはStack＋for文の1重ループで解く。またfor文でループしている間にもresultをexpectedResultの値をもとに更新し続ける）
 * 1,文字が(なら問答無用でStackに詰める
 * 2,文字が)なら、、、
 *  2-1,Stackが空ならexpectedResultを0にする
 *  2-2,Stackのピークが(ならStackをPopしてexpectedResultを+2する
 *  2-3,Stackのピークが)ならStackをpopしてexpectedResultを0にする
 * これを繰り返すイメージ。
 * 
 * 何はともあれ、場合分けして実験して規則性をつかんでそれをコードに落とし込むだけ。
 */
public class Problem164 {
	// 鍵カッコ（parentheses）が与えられる
	// 有効な鍵カッコの長さの最大値を返却する
	// なるべく時間計算量O(n)で行くこと。
	public static int longestValidParentheses(String parentheses){
		int result = 0;
		int expectedResult = 0;
		Stack<Character> cache = new Stack<Character>();

		for(int i=0;i<parentheses.length();i++){
			if(parentheses.charAt(i) == '('){
				cache.push('(');
				continue;
			}
			if(parentheses.charAt(i) == ')'){
				if(cache.size() == 0){
					expectedResult = 0;
					continue;
				}
				if(cache.peek() == ')'){
					cache.pop();
					expectedResult = 0;
					continue;		    
				}
				if(cache.peek() == '('){
					cache.pop();
					expectedResult += 2;
				}
			}
			result = Math.max(result, expectedResult);
		}
		return result;
	}
}
