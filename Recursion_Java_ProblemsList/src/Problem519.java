
/*
 * 今年は 2021 年です。運転免許センターに勤める Angelica は免許更新の通知を送る人のリストを作成しています。
 * 運転免許の更新は、優良運転者は前回の更新から 5 年後、それ以外の人は 3 年後に更新しなければなりません。
 * ある人の前回の更新年と、優良運転者かどうかを示す真偽値が与えられるので、
 * その人が今年運転免許の更新すべきか真偽を確かめる関数を作成してください。
 */
public class Problem519 {
    public static boolean renewLicense(int previousYear, boolean isGoodDriver){
        if(isGoodDriver) return previousYear==2016;
        return previousYear==2018;
    }
}
