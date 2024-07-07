/*
 * Glover は定期的に部屋替えを行うルールがあるシェアハウスに住んでいます。
 * くじ引きで数字をランダムに引いて、その数だけ住人が部屋をずらす仕組みです。
 * 例えば、数字 2 を引いたとき、部屋番号 1 に住んでいる人は 3 に移動します。
 * 住人たちの ID をまとめた ids と、くじ引きで引いた自然数 n が与えられるので、
 * 住人の位置をずらさせた配列を返す、rotateByTimes という関数を作成してください。
 */
public class Problem106 {
    public static int[] rotateByTimes(int[] ids, int n){
        int[] result = new int[ids.length];

        for(int i=0 ; i<ids.length ; i++){
            result[(i+n)%ids.length] = ids[i];
        }

        return result;
    }
}
