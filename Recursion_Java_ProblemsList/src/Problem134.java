/*
 * 自然数 x が与えられるので、1 または 2 を足し合わせて合計が x になる組み合わせの数を返す、
 * numberOfWay という関数を作成してください。例えば、3 になる組み合わせは以下の通りです。
 * 再帰を使うとうまくかける！！
 */
public class Problem134 {
    public static int numberOfWay(int x){
        if(x<=1) return 1;
        else if(x==2) return 2;
        else return numberOfWay(x-1)+numberOfWay(x-2);
    }
}
