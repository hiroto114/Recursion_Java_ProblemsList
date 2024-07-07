import java.util.Stack;

/*
 * Kendall は文書作成アプリを開発しており、
 * ユーザーが ( と ) を入力した際に自動で括弧が有効であるか知らせる機能を追加しています。
 * ( と ) で構成されている文字列 s が与えられるので、有効な括弧になるまで必要な ( および ) の数を返す、関数 makeParenthesesValid を作成してください。
 * 例えば、"()))((" の場合、インデックス 2, 3, 4, 5 の対となる文字が必要なため、答えは 4 になります。
 * 
 * makeParenthesesValid("(") --> 1
 * makeParenthesesValid("()") --> 0
 * makeParenthesesValid(")))") --> 3
 * makeParenthesesValid("()))") --> 2
 * makeParenthesesValid(")()))") --> 3
 * makeParenthesesValid("())))((") --> 5
 */
public class Problem251 {
	public static int makeParenthesesValid(String s){
		Stack<String> helper = new Stack<String>();
		for(int i=0;i<s.length();i++){
			if(helper.size()==0){
				helper.push(s.substring(i,i+1));
				continue;
			}
			if(s.substring(i, i+1).equals(")") && helper.peek().equals("(")){
				helper.pop();
				continue;
			}
			helper.push(s.substring(i,i+1));

		}

		return helper.size();
	}
}
