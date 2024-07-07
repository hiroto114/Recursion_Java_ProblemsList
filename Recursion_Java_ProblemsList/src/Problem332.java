/*
 * OR 演算子は「|」、AND 演算子は「&」、XOR 演算子は「＾」になります。
 */
public class Problem332 {
    public static int[] operateBits(int x, int y){
        int[] result = new int[3];
        result[0] = x|y;
        result[1] = x&y;
        result[2] = x^y;

        return result;
    }
}
