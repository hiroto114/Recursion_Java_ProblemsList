import java.util.HashMap;

/*
 * Niswanger は子供が自由にデザインできるパズルをはめていく様子を見ていました。
 * 子供は同じ色やデザインのものが隣り合うようにはめていきましたが、途中ではめ方が誤っていることに気づきました。
 * そこで、Niswanger にパズルを直すことができないか聞きました。パズルの順番 puzzle が与えられるので、
 * それを直すことができるかどうか判定する canFixPuzzle という関数を定義してください。直せる条件は以下の通りです。

同じ色のパズルが隣にある
「_」がある場合、内部の文字列の順序を変更できる点に注意してください。

それでは具体例を見てみましょう。
Green、Orange、Pink のパズルが G_GO_OPP と並んでいたとします。
文字列の中には「_」が含まれているので G_GO_OPP から GGOOPP__ に順番を入れ替えることができます。
この場合、G の隣には G、O の隣には O、P の隣には P が並んでいるので、true を返します。

canFixPuzzle("_") --> false
canFixPuzzle("r") --> false
canFixPuzzle("RrRr") --> false
canFixPuzzle("RrRr_") --> true
canFixPuzzle("__rrssypp554{{4") --> false
canFixPuzzle("ABCABC_") --> true
canFixPuzzle("ABCAB_") --> false
canFixPuzzle("ABABCDE_") --> false
canFixPuzzle("BBR_RY_Y") --> true
canFixPuzzle("DDRD_RRRYAA_Y") --> true
canFixPuzzle("_DGGBAFCFG_C_GDAB") --> true
canFixPuzzle("AAABBCCC") --> false
 */
public class Problem142 {
    public static boolean canFixPuzzle(String puzzle){
        if(puzzle.length()<=1) return false;
        if(puzzle.indexOf("_")<0){
            if(puzzle.length()==2) return puzzle.charAt(0)==puzzle.charAt(1);
            for(int i=1; i<puzzle.length()-1; i++){
                if(puzzle.charAt(i-1)!=puzzle.charAt(i) && puzzle.charAt(i)!=puzzle.charAt(i+1)) return false;
            }
            return true;
        }else{
            puzzle = puzzle.replace("_", "");
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i=0; i<puzzle.length(); i++){
                map.put(puzzle.charAt(i), map.getOrDefault(puzzle.charAt(i), 0)+1);

            }
            for(char c : map.keySet()){
                if(map.get(c)==1) return false;
            }
            return true;
        }
    }
}
