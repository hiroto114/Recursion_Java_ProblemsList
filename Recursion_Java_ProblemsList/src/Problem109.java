/*
 * Kilson は時計を生産する工場で働いています。生産した時計の時間にズレがないかチェックし、
 * 誤差が 0 秒のものだけ順番の最後に回すようにします。
 * 生産した時計の誤差がまとめられているリスト errors が与えられるので、
 * 0 だけを一番最後に移動させる move0ToTheEnd という関数を定義してください。
 * move0ToTheEnd([1,0,2,0,4,5,6,7]) --> [1,2,4,5,6,7,0,0]
 * move0ToTheEnd([0,1,0,2,3,4,10,11,100,3]) --> [1,2,3,4,10,11,100,3,0,0]
 * move0ToTheEnd([-20,1,34500,0,3,4,10,11,100,0,0,0]) --> [-20,1,34500,3,4,10,11,100,0,0,0,0]
 * move0ToTheEnd([-20,100,8,5,1]) --> [-20,100,8,5,1]
 * move0ToTheEnd([0,0,0,0]) --> [0,0,0,0]
 * 
 * int型配列は初期化時に自動的に0がセットされる。
 */
public class Problem109 {
    /**
     * 与えられた配列に含まれる0を最後尾に移動させた配列を返す
     * @param errors
     * @return resultArray
     */
    public static int[] move0ToTheEnd(int[] inputArray){
        /** 結果配列とインデックスのイテレーター */
        int[] resultArray = new int[inputArray.length];
        int resultArrayIterator = 0;

        for(int input:inputArray){
            if(input != 0){
                resultArray[resultArrayIterator] = input;
                resultArrayIterator += 1;
            }
        }

        return resultArray;
    }
}
