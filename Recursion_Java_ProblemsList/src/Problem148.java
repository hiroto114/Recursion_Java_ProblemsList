/*
 * Jack と Kim はルーレット大会にペアで参加しました。ルーレットを回すたびに 2 人が出した数字を掛け合わせ、
 * 得点に加算していきます（1 回目に Jack が 3、Kim が 2 を出したら合計 6 点。2 回目に Jack が 8、Kim が 9 を出したら 72 点が加算され、合計 78 点になります）。
 * Jack が出した数字 arr1 と Kim が出した数字 arr2 が与えられるので、2 人の合計点を返す関数 billSummation を作成してください。
 */
public class Problem148 {
    public static int billSummation(int[] arr1, int[] arr2){
        int result = 0;
        for(int i=0;i<arr1.length;i++){
            result += arr1[i]*arr2[i];
        }

        return result;
    }
}
