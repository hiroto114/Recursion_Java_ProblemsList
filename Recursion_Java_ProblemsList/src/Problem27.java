/**
 * 二次方程式の解
 * 天才 Ian 君は学校の課題として出された、二次方程式の解の種類を判別するクイズをプログラムを使って自動的に解く方法を思いつきました。
 * 二次方程式 ax2 + bx + c = 0 の各係数である整数 a, b, c が与えられるので、以下の条件の整数を返す、
 * quadraticEquationAnswer という関数を作成してください。
二次の係数が 0 のとき、0 を返してください
重解を持つとき、1 を返してください
実数解を 2 つ持つとき、2 を返してください
虚数解を 2 つ持つとき、-2 を返してください
 * @author 0me6-
 *
 */
public class Problem27 {
    public static int quadraticEquation(int a, int b, int c){
        if(a==0){
            return 0;
        }else if((b*b-4*a*c)==0){
            return 1;
        }else if((b*b-4*a*c)>=0){
            return 2;
        }else{
            return -2;
        }
    }
}
