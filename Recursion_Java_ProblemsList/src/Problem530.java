public class Problem530 {
    public static int factorial(int n) {
        if (n <= 0) return 1;
        return n * factorial(n - 1);
    }

    public static boolean factorialCheck(int number, int result) {
        return factorial(number) == result;
    }

    public static void unitTestCheck(boolean predicate) {
        if (predicate) {
            System.out.println("The test passed!!");
        } else {
            System.out.println("ERROR! The test failed!!");
        }
    }

    public static void unitTests(int[] inputs, int[] outputs) {
        unitTestCheck(factorialCheck(inputs[0],outputs[0]));
        unitTestCheck(factorialCheck(inputs[1],outputs[1]));
        unitTestCheck(factorialCheck(inputs[2],outputs[2]));
        unitTestCheck(factorialCheck(inputs[3],outputs[3]));
        unitTestCheck(factorialCheck(inputs[4],outputs[4]));
        unitTestCheck(factorialCheck(inputs[5],outputs[5]));
        unitTestCheck(factorialCheck(inputs[6],outputs[6]));
        unitTestCheck(factorialCheck(inputs[7],outputs[7]));
    }
}
