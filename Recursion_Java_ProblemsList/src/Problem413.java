import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
/*
 * 問題 295 では文字列で表現された数式を評価して整数の結果を返すことができました。
 * 括弧 () が含まれた文字列 expression が与えられるので、
 * その式を解析して整数の結果を返す、expressionParenthesisParser という関数を作成してください。
 * 四則演算の際、割り算の結果は全て切り捨てを行ってください。
 * 
 * expressionParenthesisParser("2+4*6") --> 26
 * expressionParenthesisParser("2*3+4") --> 10
 * expressionParenthesisParser("3-3+3") --> 3
 * expressionParenthesisParser("2+2+2") --> 6
 * expressionParenthesisParser("1-1-1") --> -1
 * expressionParenthesisParser("3*3/3*3*3") --> 27
 * expressionParenthesisParser("42") --> 42
 * expressionParenthesisParser("7*3622*636*2910*183+343/2926/1026") --> 8587122934320
 * expressionParenthesisParser("(2*3)+(1+2)") --> 9
 * expressionParenthesisParser("4/(486-484)") --> 2
 * expressionParenthesisParser("(1+(2+3+4)-3)+(9+5)") --> 21
 * expressionParenthesisParser("(100+300)*5+(20-10)/10") --> 2001
 * expressionParenthesisParser("(100+200)/3*100+1000/10") --> 10100
 */
public class Problem413 {
	public static long expressionParenthesisParser(String expression){
		Deque<String> nums = new ArrayDeque<>(); // 数字を入れるためのスタック
		Deque<String> ops = new ArrayDeque<>(); // 演算子を入れるためのスタック

		for (int i = 0; i < expression.length(); i++) {
			// 演算子の場合
			if (!Character.isDigit(expression.charAt(i))) {
				String currOP = expression.charAt(i) + "";
				// 現在の演算子とスタックに入っている演算子の優先順位を比較する
				// 現在の演算子が"("の場合は計算しない
				// スタックに入っている演算子の方が優先順位が高い時は先に計算する
				while (!ops.isEmpty() && getPriority(currOP) <= getPriority(ops.peek()) && !currOP.equals("(")) {
					if(ops.peek().equals(")")){
						ops.pop();
					}
					else if(ops.peek().equals("(")){
						ops.pop();
						break;
					}
					process(nums, ops.pop());
				}
				ops.push(currOP+"");
			}
			// 数字の場合
			else {
				String number = "";
				while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
					number += expression.charAt(i);
					i++;
				}
				i--;
				nums.push(number);
			}
		}

		// 演算子のスタックが空になるまで計算を続ける
		while (!ops.isEmpty()) {
			if(ops.peek().equals(")") || ops.peek().equals("(")){
				ops.pop();
			}
			process(nums, ops.pop());
		}

		return Long.parseLong(nums.peek());
	}
	// スタックから数字を取り出し、受け取った演算子で計算する関数
	public static void process(Deque<String> stack, String op) {
		long right = Long.parseLong(stack.pop());
		long left = Long.parseLong(stack.pop());
		long value = 0;

		switch(op) {
		case "+": value = left + right; break;
		case "-": value = left - right; break;
		case "*": value = left * right; break;
		case "/": value = left / right; break;
		}
		stack.push(value+"");
	}

	// 演算子の優先順位を返す関数
	public static int getPriority(String op) {
		HashMap<String, Integer> map = new HashMap<>() {
			{
				put(")",3);
				put("*",2);
				put("/",2);
				put("+",1);
				put("-",1);
				put("(",1);
			}
		};
		int result = map.getOrDefault(op, 0);
		return result;
	}
}

