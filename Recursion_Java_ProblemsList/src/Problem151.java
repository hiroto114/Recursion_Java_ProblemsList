/*
 * ハノイの塔
 * Simon は 3 本の棒と複数枚の円盤を用意し、以下の条件がある課題に取り組んでいます。
 * 1 本目の棒に積み上げられている円盤を全て 2 本目の棒に移します。
 * 円盤は 1 枚ずつしか動かせません。また、3 本の棒以外の所に置いてはいけません。
 * 小さな円盤の上に大きな円盤を置いてはいけません。
 * 最初に積み重ねている円盤は、一番下が大きく、一番上が小さくなっています。
 */
public class Problem151 {
    public static int towerOfHanoi(int discs){
        if(discs ==1)return 1;
        else if(discs ==2)return 3;
        else return 2*towerOfHanoi(discs-1)+1;
    }
}
