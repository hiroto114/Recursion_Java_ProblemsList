
/*
 * x-y-z 平面上の空間ベクトルを表す配列 vectorA と配列 vectorB が与えられるので、
 * 2 つのベクトルの外積を表す、vectorCrossProduct という関数を定義してください。
 */
public class Problem76 {
    /**
     * ベクトルの外積を返却
     */
    public static int[] vectorCrossProduct(int[] vectorA, int[] vectorB){
        int[] result = new int[3];
        result[0]=vectorA[1]*vectorB[2]-vectorA[2]*vectorB[1];
        result[1]=vectorA[2]*vectorB[0]-vectorA[0]*vectorB[2];
        result[2]=vectorA[0]*vectorB[1]-vectorA[1]*vectorB[0];

        return result;
    }
}
