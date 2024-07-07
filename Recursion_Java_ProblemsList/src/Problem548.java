/*
 * 2021 年 10 月に行った商談をもとにして、社員ごとに結果が `SUCCESS` になっている商談数を取得してください。表示するカラムは社員 ID（member_id）と商談成功数（success_count）にして、表示順は商談成功数が多い順にしてください。同じ成功数な場合、member_id 順にしてください。
 */
public class Problem548 {
	/*
	 * select member_id,count(member_id) as success_count
	 * from negotiations
	 * where done_at like '2021-10%' and status = 'SUCCESS' group by member_id order by success_count DESC, member_id;
	 */
}
