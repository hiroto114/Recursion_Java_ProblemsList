/*
 * 2の補数
 * 1の補数（ビット反転）を出してそれにプラス1する
 */
public class Problem62 {
    public static String twosComplement(String bits){
        int a = Integer.parseInt("1".repeat(bits.length()),2);
        int b = Integer.parseInt(bits,2);

        String c = Integer.toBinaryString((a^b)+1);

        if(bits.length()-c.length()>=0){
            return "0".repeat(bits.length()-c.length())+c;
        }
        return c;
    }
}
