/*
 * Brandon は株を自動売買することによってお金を稼ぐことを考えています。
 * そこで過去株によってどれほど利益を出すことができたか研究しようとしました。
 * 日ごとの株の値段を表す配列が与えられるので、
 * 株式の売買によって得られる最大のリターンを返す、maxProfitOfStock という関数を作成してください。
 * 各インデックスはそれぞれの日を表します。正のリターンが得られない場合は 0 を返してください。
 */
public class Problem118 {
    public static int maxProfitOfStock(int[] stocks){
        int result = 0;
        for(int i=0;i<stocks.length-1;i++){
            for(int m=i+1;m<stocks.length;m++){
                if(result<stocks[m]-stocks[i]){
                    result = stocks[m]-stocks[i];
                }
            }
        }
        return result;
    }
}
