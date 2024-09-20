
public class Problem525 {
    public static String fizzBuzz(int n) {
        if (n <= 0)      return "";
        if (n % 15 == 0) return "fizzBuzz";
        if (n % 3 == 0)  return "Fizz";
        if (n % 5 == 0)  return "Buzz";
        return "not covered";

    }

    public static void main(String[] args) throws Exception {
        Assertion.run("not covered".equals(fizzBuzz(7)));
        Assertion.run("Buzz".equals(fizzBuzz(5)));
        Assertion.run("Fizz".equals(fizzBuzz(3)));
        Assertion.run("fizzBuzz".equals(fizzBuzz(15)));
        Assertion.run("".equals(fizzBuzz(0)));
        Assertion.run("".equals(fizzBuzz(-3)));        
    }
}
