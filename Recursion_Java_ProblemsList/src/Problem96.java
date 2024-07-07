import java.util.Map;
import java.util.TreeMap;

/*
 * charFrequency("sssss") --> [s : 5]
 * charFrequency("i love you") --> [e : 1,i : 1,l : 1,o : 2,u : 1,v : 1,y : 1]
 * charFrequency("the future belongs to those who believe in the beauty of their dreams") --> [a : 2,b : 3,d : 1,e : 11,f : 2,g : 1,h : 5,i : 3,l : 2,m : 1,n : 2,o : 5,r : 3,s : 3,t : 7,u : 3,v : 1,w : 1,y : 1]
 * charFrequency("it is during our darkest moments that we must focus to see the light") --> [a : 2,c : 1,d : 2,e : 6,f : 1,g : 2,h : 3,i : 4,k : 1,l : 1,m : 3,n : 2,o : 4,r : 3,s : 6,t : 9,u : 4,w : 1]
 * charFrequency("do not go where the path may lead go instead where there is no path and leave a trail") --> [a : 9,d : 4,e : 11,g : 2,h : 6,i : 3,l : 3,m : 1,n : 4,o : 5,p : 2,r : 4,s : 2,t : 7,v : 1,w : 2,y : 1]
 */
public class Problem96 {
    public static String[] charFrequency(String message){
        message = message.replaceAll(" ","");
        Map<String, Integer> messageCount = new TreeMap<String, Integer>();

        for(int i=0;i<message.length();i++){
            if(messageCount.get(message.substring(i,i+1))==null){
                messageCount.put(message.substring(i,i+1),1);
            }else{
                messageCount.put(message.substring(i,i+1),messageCount.get(message.substring(i,i+1))+1);
            }
        }
        
        String[] result = new String[messageCount.size()];
        int resultIterator = 0;

        for (String key : messageCount.keySet())
        {
            result[resultIterator] = key + " : " + messageCount.get(key);
            resultIterator += 1;
        }

        return result;

    }
}
