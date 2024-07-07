/*
 * Padron は美術館のオーナーであり、新しく展示会を開こうとしました。
 * 新たな美術品を仕入れたので、3 つのポールで三角形の囲みを作ることで観覧者が美術品に触れさせないようにします。
 * 各ポールの長さ一覧 polls が与えられるので、三角形を作成できる組み合わせの個数を返す、countTriangles という関数を作成してください。
 * 同じ高さのポールでも違うものとして扱います。
 */
public class Problem153 {
    public static int countTriangles(int[] polls){
        int result = 0;
        for(int i=0;i<=polls.length-3;i++){
            for(int m=i+1;m<=polls.length-2;m++){
                for(int n=m+1;n<=polls.length-1;n++){
                    if(countTrianglesHelper(polls[i],polls[m],polls[n])){
                        result += 1;
                    }
                }
            }
        }

        return result;
    }
    public static boolean countTrianglesHelper(int a,int b,int c){
        int max = Math.max(Math.max(a,b), c);
        if(max ==a) return a < b+c;
        if(max ==b) return b < c+a;
        return c < a+b;        
    }
}
