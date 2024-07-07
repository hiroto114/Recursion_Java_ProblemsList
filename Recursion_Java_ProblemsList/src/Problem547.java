/*
 * 昨今では我々は飛行機の予約システムを使って飛行機の予約を行っています。
 * 予約を 10 回行ったユーザーには次回の予約で割引が適用されます。
 * 
 * 今の時点で予約を 10 回以上行ったユーザーリストを取得してください。
 * 出力カラムは、ユーザー ID（user_id）、予約回数（reservation_count）の順番にしてください。
 */
public class Problem547 {
	/*
	 * select user_id, reservation_count from 
	 * (SELECT user_id,count(*)AS reservation_count  FROM reservations GROUP BY user_id)
	 * where reservation_count >= 10
	 */
}
