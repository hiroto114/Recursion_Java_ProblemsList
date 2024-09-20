
public class Problem524 {
    public static int applyDiscount(int originalPrice, double discount) {
        if(discount <= 0 || discount >= 1) return originalPrice;
        double discountedPrice = originalPrice * (1.0 - discount);
        return (int) discountedPrice;
    }

    public static void main(String[] args) throws Exception {
        Assertion.run(applyDiscount(30, 0.5)==15);
        Assertion.run(applyDiscount(50, 0.2)==40);
        Assertion.run(applyDiscount(70, 1.0)==70);
        Assertion.run(applyDiscount(70, 0.0)==70);
        Assertion.run(applyDiscount(90, 2.0)==90);
        Assertion.run(applyDiscount(30, -3.0)==30);
    }
}
