/*
 * Haslip は家計簿アプリを作成しており、電卓機能を実装することになりました。
 * 1 つ目の入力値 op1、2 つ目の入力値 op2、演算子 operator が与えられるので、
 * 2 つの入力値に演算子を作用させた時の処理を返す関数 calculator を作成してください。ただし、0 で割る場合は op1 を返すようにしてください。
 */
public class Problem145 {
    public static double calculator(String op1, String op2, char operatorChar){
        if(operatorChar == '+'){
            return Double.parseDouble(op1) + Double.parseDouble(op2);
        }else if(operatorChar == '-'){
            return Double.parseDouble(op1) - Double.parseDouble(op2);
        }else if(operatorChar == '*'){
            return Double.parseDouble(op1) * Double.parseDouble(op2);
        }else{
            if("0".equals(op2)){
                return Double.parseDouble(op1);
            }
            return Double.parseDouble(op1) / Double.parseDouble(op2);
        }
    }
}
