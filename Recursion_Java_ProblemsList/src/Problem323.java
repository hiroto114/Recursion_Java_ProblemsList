/*
 * David はアナログ時計を見て、全ての桁数を足し合わせる遊びを子供と競っていました。
 * 分 minute が与えられるので、合計値を返す、sumOfDigits という関数を作成してください。
 * 例えば、6600 が与えられた時、110h なので、02:00 と表すことができ、0 + 2 + 0 + 0 で 2 を返します。
 * 
 * sumOfDigits(180) --> 3
 * sumOfDigits(623) --> 6
 * sumOfDigits(10) --> 1
 * sumOfDigits(390) --> 9
 * sumOfDigits(1103) --> 11
 * sumOfDigits(1439) --> 16
 * sumOfDigits(6000) --> 4
 * sumOfDigits(6208) --> 17
 * sumOfDigits(7777) --> 19
 * sumOfDigits(9999) --> 13
 * sumOfDigits(10930) --> 3
 * 
 */
public class Problem323 {
    public static int sumOfDigits(int minutes){
        int hour = (minutes / 60) % 12;
        int minute = (minutes) % 60;

        return hour/10 + hour%10 + minute/10 + minute%10;
    }
}
