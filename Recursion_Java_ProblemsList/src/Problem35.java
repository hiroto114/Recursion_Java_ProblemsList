/**
 * Karen の初期地点 x1、Michael の初期地点 x2、Karen の速さ v1、Michael の速さ v2 が与えられるので、
 * 時間が経った時に 2 人が同じ位置にいることができるかどうか判定する、
 * isSameLocation という関数を作成してください。
 * ただし時間は整数のみで 4.7 秒というような小数は考えないものとしてください。
 *
 */
public class Problem35 {
    public static boolean isSameLocation(int x1, int v1, int x2, int v2){
        if(x1==x2){
            return true;
        }

        if(x1>x2){
            if(v1<v2){
                if((x1-x2)%(v2-v1)==0){
                    return true;
                }
            }        
        }

        if(x1<x2){
            if(v2<v1){
                if((x2-x1)%(v1-v2)==0){
                    return true;
                }
            }  
        }
        return false;

    }
}
