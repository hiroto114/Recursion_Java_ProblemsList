public class Problem573 {
    public static void main(String[] args){
        int temperature = 30;
        boolean isRaining = false;
        boolean isWeekend = true;

        if((temperature>= 30 && !isRaining)|| !isWeekend){
            System.out.println("It's a good day for outdoor activities.");
        }else{
            System.out.println("Stay indoors or take an umbrella.");

        }
    }
}
