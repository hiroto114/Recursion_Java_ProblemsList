public class Problem608 {
    public static int sumOfCubes(int n){
        if(n==0) return 0;
        return n*n*n + sumOfCubes(n-1);
    }
}
