
/*
 * 百貨店の販売データを管理しているシステムがあります。
 * items テーブルを見ればその商品がいつ売れたかがわかります。sold_at が入っていない商品はまだ売れていない商品です。
 * 
 * 2021 年 6 月に売れた商品データの中から、合計販売数（sold_count）、値段の最大値（max_price）
 * 、最小値（min_price）、平均値（avg_price）、総計（total_price）を算出し、出力してください。
 */
public class Problem545 {
	/*
	 * select count(*) as sold_count,max(price) as max_price
	 * ,min(price) as min_price,avg(price) as avg_price,sum(price) as total_price
	 * from items where sold_at is not null
	 * and sold_at like '2021-06%'
	 */
}
