/*
 * Ritenour はあるゲームをプレイしており、HP を回復させる道具を使おうとしました。
 * このゲームでは道具一覧から連続であればいくつでも使って良いというシステムを採用しています。
 * HP を回復に必要なポーション一覧を表す配列 potions が与えられるので、
 * 連続使用によって得られる最大値を返す、maxContiguousSubarray という関数を定義してください。
 */
public class Problem138 {
    public static int maxContiguousSubarray(int[] potions){
        int result = potions[0];

        for(int i = potions.length ; i>0 ; i--){
            for(int m=0;m+i<=potions.length;m++){
                result = (maxContiguousSubarrayHelper(potions,m,m+i-1)>result)?(maxContiguousSubarrayHelper(potions,m,m+i-1)):result;
            }
        }

        return result;

    }

    public static int maxContiguousSubarrayHelper(int[] potions,int first,int end){
        int result = 0;
        for(int i=first;i<=end;i++){
            result += potions[i];
        }

        return result;
    }
}
