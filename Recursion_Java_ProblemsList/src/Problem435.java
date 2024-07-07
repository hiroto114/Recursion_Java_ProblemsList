import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Problem435 {
    public static String maxByCriteria(BiPredicate<String, String> callback, ArrayList<String> stringArrayList) {
        String maxString = "";
        for (final String current : stringArrayList) {
            if (callback.test(current, maxString)) {
                maxString = current;
            }
        }
        return maxString;
    }

    public static void main(String[] args) {
        final BiPredicate<String, String> compareLength = (s1, s2) -> s1.length() >= s2.length();
        final Function<String, Integer> calcTotalAscii = (string) -> string.chars().sum();
        final BiPredicate<String, String> compareAsciiTotal = (s1, s2) -> calcTotalAscii.apply(s1) >= calcTotalAscii.apply(s2);

        System.out.println(maxByCriteria(compareLength, new ArrayList<>(Arrays.asList(new String[]{"apple", "yumberry", "grape", "banana", "mandarin"})))); // --> mandarin
        System.out.println(maxByCriteria(compareLength, new ArrayList<>(Arrays.asList(new String[]{"zoomzoom", "choochoo", "beepbeep", "ahhhahhh"})))); // --> ahhhahhh
        System.out.println(maxByCriteria(compareAsciiTotal, new ArrayList<>(Arrays.asList(new String[]{"apple", "yumberry", "grape", "banana", "mandarin"})))); // --> yumberry
        System.out.println(maxByCriteria(compareAsciiTotal, new ArrayList<>(Arrays.asList(new String[]{"zoom", "choochoo", "beepbeep", "ahhhahhh"})))); // --> choochoo
    }
}
