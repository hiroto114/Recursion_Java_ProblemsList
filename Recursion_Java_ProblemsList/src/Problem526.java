public class Problem526 {
    public static boolean isValidPassword(String password) {
        boolean case1 = !password.contains(" ");
        boolean case2 = password.length() >= 6;
        //. は任意の1文字を表します。
        //* は直前の文字が0回以上繰り返されることを表します。
        boolean case3 = password.matches(".*[0-9]{1}.*");
        boolean case4 = !password.equals(password.toUpperCase()) && !password.equals(password.toLowerCase());
        return case1 || case2 || case3 || case4;
    }

    public static void main(String[] args) throws Exception {
        Assertion.run(isValidPassword("Aa 12E4"));
        Assertion.run(isValidPassword("abe12cd"));
        Assertion.run(isValidPassword("Aa1"));
        Assertion.run(isValidPassword("AaBbC23"));
        Assertion.run(isValidPassword("123456"));
        Assertion.run(isValidPassword("uYjkmese"));
        Assertion.run(isValidPassword("tK 23bmd"));
        Assertion.run(isValidPassword("aaaaa1"));
        Assertion.run(isValidPassword("AAAAA1"));
    }
}
