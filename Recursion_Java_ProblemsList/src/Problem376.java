/*
 * メールアドレス email が与えられるので、@ の位置を返す getAtLocation という関数を作成してください。
 * ただし、@ が含まれていない場合は -1 を返してください。また、email の最初の文字は 1 番目と数えます。
 */
public class Problem376 {
    public static int getAtLocation(String email){
        return email.indexOf("@")==-1? -1 :email.indexOf("@")+1;
    }
}
