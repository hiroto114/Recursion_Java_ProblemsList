/*
 * Lauren は昇順ソートライブラリを開発しています。
 * 隣り合っている 2 つの数字を入れ替えることを繰り返し、昇順に並び替える仕組みを採用しようと試みてます。
 * 整数の一覧 intArr が与えられるので、昇順ソートを作るために必要な入れ替えの最小回数を返す、inversionOfArray という関数を作成してください。
 * 
 * 例えば、[2,4,1,3,5] の場合、① 1 と 4 を入れ替えて [2,1,4,3,5]、② 1 と 2 を入れ替えて [1,2,4,3,5]、③ 3 と 4 を入れ替えて [1,2,3,4,5] となり 3 回の操作によって昇順ソートが完成します。
 */
public class Problem241 {
    public static int inversionOfArray(int[] intArr){
        int result = 0;
        for(int i=0;i<intArr.length-1;i++){
            if(intArr[i] > intArr[i+1]){
                int temp = intArr[i];
                intArr[i] = intArr[i+1];
                intArr[i+1] = temp;
                result += 1;
                i = -1;
            }
        }

        return result;
    }
}
