/*
 * メールアドレスが与えられるので、メソッドチェーンを用いてドメイン名を大文字で切り出す
 * upperCaseDomain という関数を作成してください。
 * 
 * upperCaseDomain("bjacobi@example.com") --> EXAMPLE.COM
 * upperCaseDomain("christine37@example.net") --> EXAMPLE.NET
 * upperCaseDomain("deontae.braun@metz.org") --> METZ.ORG
 * upperCaseDomain("elwyn.leannon@example.com") --> EXAMPLE.COM
 * upperCaseDomain("carter88@gmail.com") --> GMAIL.COM
 * upperCaseDomain("amaya.kohler@yahoo.com") --> YAHOO.COM
 * 
 */
public class Problem352 {
    public static String upperCaseDomain(String email){
        int a = email.indexOf("@");
        return email.substring(a+1).toUpperCase();
    }
}
