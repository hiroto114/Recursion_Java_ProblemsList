
/*
 * Eric はとある組織に囚われの身となっており、ある条件を満たせば自由になれる約束をしていました。
 * それは、整数 n が与えられたときに n 未満に何個素数があるか正確に答えることでした。
 * 整数 n が与えられるので、n 未満に含まれる素数の個数を返す、primesUpToNCount という関数を定義してください。
 */
public class Problem72 {
    public static int primesUpToNCount(int n){
        int result = 0;
        for(int i=1;i<n;i++){
            if(isPrime(i)){
                result += 1;
            }
        }
        return result;
    }

    public static boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
