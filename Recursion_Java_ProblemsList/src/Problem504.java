import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * attackCommands(["xab","yss","ytt","xcc","xab","xcc","ytt","xab","xab","yab"]) --> [xab,xcc]
 * attackCommands(["yab","xss","xab","xhj","xhl","ykk","xlm","xst","yab","yab"]) --> [xab,xhj,xhl,xlm,xss,xst]
 * attackCommands(["xbb","xbb","xbb","xbb","xbb","xbb","xbb","xbb","xbb","xbb"]) --> [xbb]
 */
public class Problem504 {
    public static String[] attackCommands(String[] commandList){
        Set<String> color = new HashSet<>();
        for(String i: commandList){
            System.out.println(i.charAt(0));
            if(i.charAt(0)=='x'){
                color.add(i);
            }
        }

        String[] result = new String[color.size()];
        int i = 0;

        for (String v : color) {
            result[i++] = v;
        }
        Arrays.sort(result);
        return result;
    }
}
