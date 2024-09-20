
/*
 * Smith は間違い探しゲームに参加しています。
 * このゲームでは、異なる数字が並べられたボード arr と、同じ数字がシャッフルされたボード shuffledArr が与えられます。
 * shuffledArr において、arr の各数字がどのインデックスに移動したかを特定する shuffledPositions という関数を定義してください。
 * 
 * 例えば、arr が [2,32,45] で shuffledArr が [45,32,2] の場合、
 * 2 はインデックス 0 から 2 へ、32 は 1 から 1 へ、45 は 2 から 0 へ移動したので、結果は [2,1,0] となります。
 * shuffledPositions([2,32,45],[45,32,2]) --> [2,1,0]
 * shuffledPositions([10,11,12,13],[12,10,13,11]) --> [1,3,0,2]
 * shuffledPositions([10,11,12,13],[10,11,12,13]) --> [0,1,2,3]
 * shuffledPositions([1350,181,1714,375,1331,943,735],[1714,1331,735,375,1350,181,943]) --> [4,5,0,3,1,6,2]
 */
public class Problem73 {
    public static int[] shuffledPositions(int[] arr, int[] shuffledArr){
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int m=0;m<shuffledArr.length;m++){
                if(arr[i]==shuffledArr[m]){
                    result[i]=m;
                    break;
                }
            }
        }

        return result;
    }
}
