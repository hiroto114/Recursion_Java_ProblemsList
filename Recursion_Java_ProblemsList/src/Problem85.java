/*
 * Steveは 回答が 0 と 1 によって構成される、2 択テストの採点システムを作っています。
 * 回答者の回答が bit1、模範回答が bits2 で与えられるので、回答者が何問間違えたかを算出する、
 * hammingDistance という関数を作成してください。
 */
public class Problem85 {
    public static int hammingDistance(String bits1, String bits2){
        int result =0;
        for(int i=0;i<bits1.length();i++){
            if(bits1.charAt(i)!=bits2.charAt(i))result++;
        }

        return result;
    }
}
