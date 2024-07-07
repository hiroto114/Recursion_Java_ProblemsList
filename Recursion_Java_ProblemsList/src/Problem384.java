/*
 * Larry は昨日、彼のお気に入りの RPG ゲームで 10 時間遊び、その間に彼のキャラクターはいくつかの能力値を改善しました。
 * Larry のキャラクターの現在の能力値が与えられています。
 * あなたの仕事は、指示に従ってこれらの能力値をアップデートし、最終的な結果を出力することです。
 * 
 * 演算子 += を使って、myPower に格納されている値を 10 増やしてください。
 * 演算子 -= を使って、mySpeed に格納されている値を 5 減らしてください。
 * 演算子 *= を使って、myTechnique に格納されている値を 7 倍にしてください。
 * 演算子 /= を使って、myDefense に格納されている値を 2 で割ってください。
 * これらの更新を行った後、エディタのコードを使用して最終的な値を出力してください。
 */
public class Problem384 {
    public static void main(String[] args){
        int myPower = 300 + 10;
        int mySpeed = 200 - 5;
        int myTechnique = 50*7;
        int myDefense = 500/2;
        
        // ここから書きましょう
        System.out.println("myPower : " + String.valueOf(myPower));
        System.out.println("mySpeed : " + String.valueOf(mySpeed));
        System.out.println("myTechnique : " + String.valueOf(myTechnique));
        System.out.println("myDefense : " + String.valueOf(myDefense));
    }
}
