
/*
 * 1の補数を求める
 * →ビット反転するだけなので難しくない
 */
public class Problem61 {
    public static String oneComplement(String bits){
        StringBuilder result = new StringBuilder("");
        for(int i=0;i<bits.length();i++){
            if(bits.charAt(i) == '0') result.append("1");
            if(bits.charAt(i) == '1') result.append("0");
        }
        return result.toString();
    }
}
