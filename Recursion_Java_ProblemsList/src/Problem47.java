
/**
 * Jack は魔法使いからもらった豆を裏庭に植えて昼寝をしました。
 * 昼寝から目覚めて裏庭を確認するとその豆は巨木へと成長し、雲の上にある巨人の城にたどりつくまでの大きさになっていました。
 * 豆を観察すると、以下の条件で 1 秒ずつ成長することがわかりました。
f(0) = 0
f(1) = 1
f(n) = f(n-1) + f(n-2) (n ≥ 2)
整数 n が与えられるので、n 秒後の木の高さを求める、fibonacci という関数を作成してください。
 * @author 0me6-
 *
 */
public class Problem47 {
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return  fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
