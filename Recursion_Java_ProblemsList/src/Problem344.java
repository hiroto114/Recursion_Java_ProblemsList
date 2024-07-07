/*
 * 0 以上の整数 n が与えられるので、1 から n までの XOR を計算する、xORToN という関数を作成してください。
 * 例えば、5 が与えられたとき、1 XOR 2 XOR 3 XOR 4 XOR 5 = 1 となります。
 * 
 * xORToN(2) --> 3
 * xORToN(5) --> 1
 * xORToN(7) --> 0
 * xORToN(11) --> 0
 * xORToN(32) --> 32
 * xORToN(534) --> 535
 * xORToN(203444343) --> 0
 * 
 */
public class Problem344 {
    public static int xORToN(long n){
        if(n==0L) return 0;
        if(n==1L) return 1;
        if(n==2L) return 3;
        if(Math.toIntExact(n)%4==3) return 0;
        if(Math.toIntExact(n)%4==0) return Math.toIntExact(n);
        if(Math.toIntExact(n)%4==1) return 1;
        return Math.toIntExact(n)+1;
    }
}
