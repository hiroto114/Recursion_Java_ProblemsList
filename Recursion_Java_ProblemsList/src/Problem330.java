/*
 * 西暦 year が与えられるので、世紀へと変更する関数、getCentury という関数を作成してください。
 * 
 * getCentury(2001) --> 21st century
 * getCentury(2020) --> 21st century
 * getCentury(2199) --> 22nd century
 * getCentury(2200) --> 22nd century
 * getCentury(356) --> 4th century
 * getCentury(105) --> 2nd century
 * getCentury(89) --> 1st century
 * getCentury(1999) --> 20th century
 * getCentury(3299) --> 33rd century
 * getCentury(3300) --> 33rd century
 * getCentury(3301) --> 34th century
 * getCentury(7100) --> 71st century
 * getCentury(5200) --> 52nd century
 * getCentury(1001) --> 11th century
 * getCentury(1100) --> 11th century
 * getCentury(1101) --> 12th century
 * getCentury(1200) --> 12th century
 * getCentury(1201) --> 13th century
 * getCentury(1300) --> 13th century
 * 
 */
public class Problem330 {
    public static String getCentury(int year){
        int i = year / 100;
        int m = (year % 100 > 0)? 1:0;
        String result = "";
        switch ((i + m) % 10) {
            case 0 :
                result = String.valueOf(i + m) + "th century";
                break;
            case 1 :
		        if((i+m) == 11) result =  String.valueOf(i + m) + "th century";
                else result =  String.valueOf(i + m) + "st century";
                break;
            case 2 :
		        if((i+m) == 12) result =  String.valueOf(i + m) + "th century";
                else result =  String.valueOf(i + m) + "nd century";
                break;
            case 3 :
		        if((i+m) == 13) result =  String.valueOf(i + m) + "th century";
                else result =  String.valueOf(i + m) + "rd century";
                break;
            case 4 :
                result =  String.valueOf(i + m) + "th century";
                break;
            case 5 :
                result =  String.valueOf(i + m) + "th century";
                break;
            case 6 :
                result =  String.valueOf(i + m) + "th century";
                break;
            case 7 :
                result =  String.valueOf(i + m) + "th century";
                break;
            case 8 :
                result =  String.valueOf(i + m) + "th century";
                break;
            case 9 :
                result =  String.valueOf(i + m) + "th century";
                break;
        }
        return result;

    }
}
