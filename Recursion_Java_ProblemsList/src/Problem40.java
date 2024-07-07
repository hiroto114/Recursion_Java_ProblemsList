/**
 * 図のように三角数の数列があります。天才 Pascal は小学生の時にこの並びを見て規則的な発見をしました。
 * 自然数 x が与えられるので、x 番目の三角形に含まれるドットの数を返す、numberOfDots という関数を再帰を使って作成してください。
 * @author 0me6-
 *
 */
public class Problem40 {
    /** 
     * これは再帰で解ける。
     * しかしJavaの内部スタックにかなりの負担をかける
     */
    public static int numberOfDots(int x){
        if(x==1) return 1;
        return x + numberOfDots(x-1);
    }
}
