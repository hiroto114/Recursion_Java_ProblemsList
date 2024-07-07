import java.util.HashMap;

/*
 * アルファベットで構成される stringArr が与えられるので、文字列の中の各要素の中で最も文字の種類の多い文字列を返す、
 * maximumType という関数を作成してください。
 * ただし、空白はカウントせず、種類の数が同数の場合は、アルファベット順（ASCII コード順）に一番最初に出てくる文字列を返してください。
 * 
 * maximumType(["A AB C","DEF"]) --> A AB C
 * maximumType(["GKSA LLSA PPS","OSKEMSKSANCs"]) --> OSKEMSKSANCs
 * maximumType(["Hayes","Enola","Ryder","Jaden","Vinnie","Darian","Boyle","Abbie","Trenton","Corkery","Jacobson",
 * "Josefa","Korey","Ella","Sporer","Nicolas","Jovanny","Clay","Eleanore","Rosemarie","Nathanael"]) --> Rosemarie
 * maximumType(["Koss","Waelchi","Franecki","Pollich","Gulgowski","Janis","Schaefer","Mae","Bednar","Karlee",
 * "Jeffry","Markus","Wuckert","Pete","Brandy","Douglas","Feeney","Heidi","McClure","Armstrong"]) --> Gulgowski
 * maximumType(["Lauryn","Blanda","Brendan","Schultz","Immanuel","Kovacek","Wolf","Murray","Lehner","Gleason",
 * "Feeney","Herbert","Andrew","Dooley","Shaylee","Murazik","Wiegand","Koelpin","Leopold","Citlalli","Elyssa","Emmet","Hassie","Barton","Vandervort","Lindgren","Justus","Jenkins"]) --> Vandervort
 * maximumType(["Reynolds","Rolfson","Frederique","Keara","Doyle","Walter","Watsica","Jerad","Paul","Hansen",
 * "Kris","Earlene","Erdman","Esta","Greg","Nikko","Frami","McDermott","Juliet","Yasmeen","Letitia","Lucio"]) --> McDermott
 * maximumType(["abcg","abce","abcf","abcd"]) --> abcd
 * maximumType(["abcd","Abcd"]) --> Abcd
 * maximumType(["Abce","Abcd"]) --> Abcd
 * 
 */
public class Problem260 {
	public static String maximumType(String[] stringArr){
		String result = stringArr[0];
		int maxSize = maximumTypeHelper(stringArr[0]);

		for(String string : stringArr){
			if(maximumTypeHelper(string) == maxSize){
				result = compareStringsByAscii(result, string);
			}
			if(maximumTypeHelper(string) > maxSize){
				result = string;
				maxSize = maximumTypeHelper(string);
			}
		}

		return result;
	}

	/*
	 * 文字列の文字をhashmapに集計
	 */
	public static int maximumTypeHelper(String input){
		HashMap<String,Integer> count = new HashMap<String,Integer>();
		for(int i=0;i<input.length();i++){
			count.put(input.substring(i,i+1),count.getOrDefault(input.substring(i,i+1),0)+1);
		}
		return count.size();
	}

	/*
	 * アルファベット順（ASCII コード順）に一番最初に出てくる文字列を返却
	 */
	public static String compareStringsByAscii(String string1, String string2){
		return string1.compareTo(string2)>0 ? string2 : string1;
	}
}
