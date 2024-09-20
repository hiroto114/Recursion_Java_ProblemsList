
public class Problem572 {
    public static void main(String[] args){
        boolean isOpen = true;
        boolean isHoliday = false;
        boolean hasCoupon = true;
        if((isOpen && !isHoliday)|| hasCoupon) System.out.println("You can shop at a discount.");
        else System.out.println("No shopping today.");
    }
}
