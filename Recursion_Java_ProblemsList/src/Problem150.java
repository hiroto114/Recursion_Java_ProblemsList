public class Problem150 {
    public static char divideEmployees(int num){
        if(num % 10 == 0 ||num % 10 == 1){
            return 'A';
        }else if(num % 10 == 2 ||num % 10 == 9){
            return 'B';
        }else if(num % 10 == 3 ||num % 10 == 8){
            return 'C';
        }else if(num % 10 == 4 ||num % 10 == 7){
            return 'D';
        }else{
            return 'E';
        }
    }
}
