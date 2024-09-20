
import java.util.ArrayList;
import java.util.List;
/*
 * 整数で構成される n x n 行列を表す配列 matrixA と同じサイズの配列 matrixB が与えられるので、
 * 2 つの行列の積を返す、nByNMatrixDotProduct という関数を定義してください。
 * ここでは n x n 行列は 1 次元配列として表されることに注意すること。
 * 
 * 例えば、[1, 2, 3, 4] は、以下のように 2 x 2 行列を表します。
 * matrixDotProduct([1,2,3,4],[5,6,7,8]) --> [19,22,43,50]
 * matrixDotProduct([-1,1,0,2],[3,4,5,6]) --> [2,2,10,12]
 * matrixDotProduct([5,2,6,1,0,6,2,0,3,8,1,4,1,8,5,6],[7,5,8,0,1,8,2,6,9,4,3,8,5,3,7,9]) 
 * --> [96,68,69,69,24,56,18,52,58,95,71,92,90,107,81,142]
 */
public class Problem77 {
    public static int[] matrixDotProduct(int[] matrixA, int[] matrixB){
        int length = (int)Math.sqrt(matrixA.length);
        int[][] matrixa = matrixDotProductHelper(matrixA);
        int[][] matrixb = matrixDotProductHelper(matrixB);
        int[][] matrixResult = new int[length][length];

        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                for(int k = 0; k < length; k++){
                    matrixResult[i][j]+=matrixa[i][k]*matrixb[k][j];
                }
            }
        }

        List<Integer> list=new ArrayList<>();
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                list.add(matrixResult[i][j]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[][] matrixDotProductHelper(int[] matrixA){
        int length = (int)Math.sqrt(matrixA.length);
        int[][] result = new int[length][length];
        int count = 0;
        
        for(int i=0;i<length;i++){
            for(int m=0;m<length;m++){
                result[i][m] = matrixA[count];
                count += 1;
            }
        }

        return result;
    }
}
