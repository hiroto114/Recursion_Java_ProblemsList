/*
 * Steele はシミュレーションゲームで遊んでおり、4 方向（North, East, South, West）に 1 マスずつ指示出しすることで
 * キャラクターを動かしています。
 * コマンドを表す大文字の文字列 commands が与えられるので、
 * 指示出しを与えられた後の位置を配列で返す、characterLocation という関数を作成してください。
 * ただし、キャラクターは原点（0,0）からスタートするとします。コマンドの進行方向は、N: y 方向に +1、E: x 方向に +1、W: x 方向に -1、S: y 方向に -1 となります。
 */
public class Problem157 {
    public static int[] characterLocation(String commands){
        int x = 0;
        int y = 0;
        char north = 'N';
        char south = 'S';
        char east  = 'E';
        char west  = 'W';

        for(int i=0; i<commands.length(); i++){
            if(north == commands.charAt(i)) y += 1;
            if(south == commands.charAt(i)) y += -1;
            if(east  == commands.charAt(i)) x += 1;
            if(west  == commands.charAt(i)) x += -1;
        }
        return new int[]{x, y};
    }
}
