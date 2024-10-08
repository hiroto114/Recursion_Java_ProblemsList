/*
 * 浮動小数点型はコンピュータにおいて小数を表現する一般的な方法ですが、
 * その内部表現のために、完全に正確な数値計算を行うことはできません。
 * そのため、浮動小数点数を使用した計算では、非常に小さい誤差が生じることがあります。
 * この誤差は、通常の計算では無視できるほど小さいことが多いですが、特に複雑な計算や大量の計算を行う場合には、
 * これらの誤差が積み重なって影響を及ぼすことがあります。したがって、金融などの精度が非常に重要な分野では、
 * 他の数値表現方法を使用することが推奨されます。
 * 
 * 0.1 + 0.2 をコンソールに出力してみましょう。
 * 3.1 + 2.7 をコンソールに出力してみましょう。
 */
public class Problem387 {
    public static void main(String[] args){
        System.out.println(0.1 + 0.2);
        System.out.println(3.1 + 2.7);
    }
}
