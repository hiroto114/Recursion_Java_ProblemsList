import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

/*
 * 文字列で表現された数式 expression が与えられるので、その数式を評価し、整数の結果を返す、expressionParser という関数を作成してください。
 * ただし、割り算に関しては小数点以下を切り捨てた整数値を返してください。
 * 
 * expressionParser("2+4*6") --> 26
 * expressionParser("2*3+4") --> 10
 * expressionParser("3-3+3") --> 3
 * expressionParser("2+2+2") --> 6
 * expressionParser("1-1-1") --> -1
 * expressionParser("3*3/3*3*3") --> 27
 * expressionParser("14/3*2") --> 8
 * expressionParser("12/3*4") --> 16
 * expressionParser("1+2+3+4+5+6+7+8+9+10") --> 55
 * expressionParser("1+2*5/3+6/4*2") --> 6
 * expressionParser("42") --> 42
 * expressionParser("7*3622*636*2910*183+343/2926/1026") --> 8587122934320
 * 
 * 20 * 3 + 6 の例を見てみますと、最初の文字は 2 ですが、
 * 数式では 20 なので 2 桁以上の場合のを処理をしスタックに 20 が入ります。
 * nums[20]
 * ops[]
 * 
 * 次にくる演算子 '*' は、まだ演算子のスタックに何も入っていないのでそのままスタックに入ります。
 * nums[20]
 * ops['*']
 * 
 * その次の 3 は数字なので数字のスタックに入ります。
 * nums[20,3]
 * ops['*']
 * 
 * 次の '+' が来たとき、'*' の優先順位は '+' のそれより高いので、先に計算をします。
 * nums に入っている 20 と 3 を取り出して、かけた値 60 を数字のスタックに入れます。
 * '*' は削除して '+' をスタックに入れます。
 * nums[60]
 * ops['+']
 * 
 * 最後の文字 6 をスタックに入れます。
 * nums[60,6]
 * ops['+']
 * 
 */
public class Problem295 {
	public static long expressionParser(String expression){
		Deque<String> nums = new ArrayDeque<>(); // 数字を入れるためのスタック
		Deque<String> ops = new ArrayDeque<>(); // 演算子を入れるためのスタック

		for (int i = 0; i < expression.length(); i++) {
			// 演算子が来たときの処理
			if (!Character.isDigit(expression.charAt(i))) {
				String currOP = expression.charAt(i) + "";
				// 現在の演算子とスタックに入っている演算子の優先順位を比較します。
				// スタックに入っている演算子の方が優先順位が高い時は先に計算します。
				while (!ops.isEmpty() && getPriority(currOP) <= getPriority(ops.peek())) {
					process(nums, ops.pop());

				}
				// 現在の演算子をスタックに入れます。
				ops.push(currOP+"");

			}

			// 数字が来たときの処理 ここでは文字列として扱います。
			else {
				String number = "";
				// 2桁以上の数字に対応するため、演算子がくるまで文字を結合していきます。
				while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
					number += expression.charAt(i);
					i++;
				}
				i--; // 最後に増やしたiを1つ戻しておきます。
				nums.push(number);
			}
		}

		// 演算子のスタックが空になるまでprocessを呼び出して計算を続けます。
		if (!ops.isEmpty()) {
			process(nums, ops.pop());

		}
		// 数字のスタックの先頭に答えが入っています。
		// =====Long.parseLongで文字列をlong型の数値に変更=====
		return Long.parseLong(nums.peek());
	}
	// スタックから数字を取り出し、受け取った演算子で計算する関数
	public static void process(Deque<String> stack, String op) {
		// 数字のスタックから文字列を取り出し数字にします。
		long right = Long.parseLong(stack.pop());
		long left = Long.parseLong(stack.pop());

		long value = 0;

		switch(op) {
		case "+": value = left + right; break;
		case "-": value = left - right; break;
		case "*": value = left * right; break;
		case "/": value = (int)Math.floor(left / right); break;
		}
		// 計算した結果は、次の演算子での計算のため再度スタックに入れます。
		stack.push(value+"");
	}

	// 演算子の優先順位を返す関数
	public static int getPriority(String op) {
		HashMap<String, Integer> map = new HashMap<>() {
			{
				put("*",2);
				put("/",2);
				put("+",1);
				put("-",1);
			}
		};
		int result = map.getOrDefault(op, 0);
		return result;
	}
}
