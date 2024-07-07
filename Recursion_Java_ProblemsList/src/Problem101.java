import java.util.Stack;

/*
 * Walker は出版社で文章チェックの仕事をしています。
 * () や {}、[] で括られている文章をチェックしているのですが、正しく使われているか見なければいけません。
 * 文字列 parentheses が与えられるので、それが有効かどうか判定する、isParenthesesValid という関数を定義してください。
 * 与えられる文字列が有効の条件は以下の通りです。
 * 左カッコが同じ種類の右カッコで閉じられてる
左カッコが右カッコによって正しい順で閉じられている
 */
public class Problem101 {
    public static boolean isParenthesesValid(String parentheses){
        Stack<String> stack = new Stack<String>();
        for(int i=0;i<parentheses.length();i++){
            if("{".equals(parentheses.substring(i,i+1))){
                stack.push("{");
            }
            if("(".equals(parentheses.substring(i,i+1))){
                stack.push("(");                
            }
            if("[".equals(parentheses.substring(i,i+1))){
                stack.push("[");                
            }


            if("}".equals(parentheses.substring(i,i+1))){
                if(stack.empty() || !stack.peek().equals("{")){
                    return false;
                }else{
                    stack.pop();
                    continue;
                }
            }
            if(")".equals(parentheses.substring(i,i+1))){
                if(stack.empty() || !stack.peek().equals("(")){
                    return false;
                }else{
                    stack.pop();
                    continue;
                }                         
            }
            if("]".equals(parentheses.substring(i,i+1))){
                if(stack.empty() || !stack.peek().equals("[")){
                    return false;
                }else{
                    stack.pop();
                    continue;
                }              
            }
        }
        if(stack.empty()) return true;
        return false;
    }
}
