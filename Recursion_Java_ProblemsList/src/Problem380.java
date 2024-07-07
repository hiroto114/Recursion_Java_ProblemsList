/*
 * Leoは車の買い替えを検討していて、いくつか気になる車種のスペックを比較しています。
 * Leoはガソリンスタンドが嫌いなので、ガソリンが空になるまでの時間が長い車を探しています。
 * 特定の速さ[マイル/秒]、燃費[マイル/ガロン]、ガスタンク容量[ガロン]が与えられるので、
 * その車のガソリンが空になるまで何時間かかるか計算するhoursToEmptyという関数を定義してください。
 * ただし、出力は小数第 2 位以降を切り取ってください。
 * 
 * hoursToEmpty(0.04,98,12) --> 8.1
 * hoursToEmpty(0.057,36,12) --> 2.1
 * hoursToEmpty(0.059,11,18) --> 0.9
 * hoursToEmpty(0.08,55,14) --> 2.6
 */
public class Problem380 {
    public static double hoursToEmpty(double velocity, int fuelEconomy, int tankCapacity){
    double result = (fuelEconomy * tankCapacity)/(3600 * velocity);

    return Math.floor(result*10)/10;
}
}
