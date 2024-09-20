
/*
 * 小学校であるクラスを担当している先生 Dauna は、家にある限りのキャンディを持ってきて生徒に配ろうとしました。
 * 出席番号順に配る予定ですが、初めに配る人は 1 番に決めている訳ではありませんでした（例：6 番から配り始め、7, 8, 9 と配る等）。
 * 生徒の数 children、キャンディの数 candy、初めに配る生徒の出席番号 start が与えられるので、
 * 最後にキャンディをもらう生徒の出席番号を返す wholsTheLastPerson という関数を作成してください。
 */
public class Problem80 {
    public static int whoIsTheLastPerson(int children, int start, int candy){
        if(children==1) return 1;
        if(start+candy<=children) return start+candy-1;
        return (start+candy-1)%children==0?children:(start+candy-1)%children;
    }
}
