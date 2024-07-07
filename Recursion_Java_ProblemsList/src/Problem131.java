import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Carter は野球部部長として部員をステーキ専門店に連れてきました。
 * 部長なので部員たちがどれくらいの量を食べれるか把握しています。
 * ステーキ専門店は肉のサイズを選べる仕組みになっていました。各部員の満腹度を表す配列 hunger と肉のサイズを表す配列 meats が与えられるので、
 * 満腹になる部員の数を返す findFullMembers という関数を作成してください。
 * 肉は1人1つしか食べることができず、余っても分解することができない前提で問題を解いてください。
 */
public class Problem131 {
    public static int findFullMembers(int[] hunger, int[] meats){
        Arrays.sort(hunger);
        Arrays.sort(meats);

        List<Integer> hungerList = new ArrayList<Integer>();
        for(int pointer: hunger){
            hungerList.add(pointer);
        }

        List<Integer> meatsList = new ArrayList<Integer>();
        for(int pointer: meats){
            meatsList.add(pointer);
        }

        int result = 0;
        int hungerPointer = 0;
        int meatsPointer  = 0;

        while(hungerPointer < hungerList.size() && meatsPointer < meatsList.size()){
            if(hungerList.get(hungerPointer) <= meatsList.get(meatsPointer)){
                result += 1;
                hungerPointer += 1;
                meatsPointer  += 1;
            }else{
                meatsPointer += 1;
            }
        }
        return result;
    }
}
