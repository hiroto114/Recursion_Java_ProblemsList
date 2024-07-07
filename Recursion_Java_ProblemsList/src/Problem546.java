/*
 * 今世界的に人気な文字投稿ができる SNS があります。それぞれの投稿にはタグを一つだけ付けることができます。
 * この SNS は開発者用の API を公開しており、そこからパブリックな投稿を取得することができます。
 * 
 * 上記の API にアクセスして取得した投稿データを posts テーブルに保存しました。
 * 投稿数が多いタグを調べて、上から順に人気の 30 個のタグと関連データを取得してください。
 * 取得するデータは、「tag_id、投稿数」を取得してください。
 */
public class Problem546 {
	/*
	 * select tag_id,count(tag_id) from posts group by tag_id order by count(tag_id) desc limit 30;
	 */
}
