import java.util.function.Function;

public class Problem417 {
	public static void main(String[] args){
		// ① MyClass内で circleArea ラムダを作成してみましょう。
		Function<Integer, Double> circleArea = x -> x*x*3.14;

		// ② 問題文にある一つ目のテストケースをMyClassに記述しましょう。
		// コンソール出力することでテストケースが正しい値であるかが判定されます。
		System.out.println(circleArea.apply(1));
		System.out.println(circleArea.apply(5));
		// ③ 上記を参考に他のテストケースを作成しましょう。
		// 問題文中のテストケースを全て満たすことで合格します。

		// ④ テストボタンを押して正しく出力されているかを確認しましょう。
		// メソッド名、文字列のスペースなどは注意深く確認しましょう。

		// ⑤ テストが確認できたら、提出ボタンを押して完了です。
	}
}
