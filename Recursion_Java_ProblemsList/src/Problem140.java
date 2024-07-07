import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Sanborn はゲーム内で買い物をしようと思っています。新しくものを買うと同時に、
 * 所有しているものを売ることで所持金に変更がないようにしたいと思っています。
 * このゲーム内では物の売買は一度に 3 回のみという縛りがあります。
 * 物の売買一覧を表す配列 intArr が与えられるので、その中から合計した時に 0 になる組み合わせの数を返す、threeSum という関数を定義してください。
 */
public class Problem140 {
    public static int threeSum(int[] intArr){
        Arrays.sort(intArr);
        Set<String> animals = new HashSet<String>();
        for(int i=0;i<=intArr.length-3;i++){
            for(int m=i+1;m<=intArr.length-2;m++){
                for(int n = m+1;n<=intArr.length-1;n++){
                    if(intArr[i]+intArr[m]+intArr[n]==0){
                        animals.add(String.valueOf(intArr[i])+String.valueOf(intArr[m])+String.valueOf(intArr[n]));
                    }
                }
            }
        }

        return animals.size();
    }
}
