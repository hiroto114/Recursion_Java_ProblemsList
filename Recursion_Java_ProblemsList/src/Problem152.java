/*
 * Joey は表計算アプリを作成しており、1 と 1 で囲まれた数字を抽出しようと考えています。
 * 0 と 1 のみで構成される文字列 bits が与えられるので、1 で始まり 1 で終わる部分文字列の組み合わせを返す、countSubstring という関数を作成してください。
 * すべての 1 と 0 は区別し、さらに同じ場所から始まり、同じ場所で終わる組み合わせはなしとします。
 * 例えば、1111 は 6 を返します。それは [11, 11, 11, 111, 111, 1111] の組み合わせが存在するからです。
 * また、01101 は [11, 101, 1101] の組み合わせが該当するため、3 を返します。
 */
public class Problem152 {
	/*
	 * こんなことやっているけど、1の個数を求めてnC2でO(n)で解けるよ。
	 */
    public static int countSubstring(String bits){
        int result = 0;

        for(int i=0;i<bits.length()-1;i++){
            for(int m=i+1;m<bits.length();m++){
                if(bits.charAt(i)=='1'&&bits.charAt(m)=='1') result++;
            }
        }

        return result;
    }
}
