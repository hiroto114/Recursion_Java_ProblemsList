/*
 * Lorber は画像検索サイトを作成しており、ユーザーの入力した文字と同じフルーツを返す処理を実装しようとしました。
 * 入力された文字 fruit が与えられるので、banana の時に url1、pineapple の時に url2、pear の時に url3、それ以外は no image と返す、fruitImgUrl という関数を作成してください。
 */
public class Problem144 {
    public static String fruitImgUrl(String fruit){
        if("banana".equals(fruit.toLowerCase())){
            return "url1";
        }else if("pineapple".equals(fruit.toLowerCase())){
            return "url2";
        }else if("pear".equals(fruit.toLowerCase())){
            return "url3";
        }else{
            return "no image";
        }
    }
}
