/*
 * 仮想通貨で大儲けした L さんは、ビットコインとイーサリアムを、同じ枚数ずつできるだけ多くの人に配りたいと思いました。
 * ビットコインとイーサリアムの枚数がそれぞれ x, y で与えられるので、配れる人数を返す、maximumPeople という関数を作成してください。
 * 
 * 例えば、ビットコイン 12 枚とイーサリアム 18 枚を配る場合、ビットコインを 6 人に 2 枚ずつ、イーサリアムを 6 人に 3 枚ずつ配ることができます。
 */
public class Problem364 {
    public static int maximumPeople(int x, int y){
        if(Math.min(x,y)==0) return Math.max(x,y);

        int temp = Math.max(x,y) % Math.min(x,y);
        return maximumPeople(Math.min(x,y),temp);
    }
}
