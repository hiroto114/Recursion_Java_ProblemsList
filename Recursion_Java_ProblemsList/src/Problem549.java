/*
 * 商品 ID、倉庫 ID、年、月ごとの仕入れ数（all_count）を取得してください。
 */
public class Problem549 {
	/*
	 * select 
	 * product_id          -- 商品ID
	 * , warehouse_id      -- 倉庫ID
	 * , CASE
	 * 		WHEN month BETWEEN 1 AND 9 THEN year||'-0'||month 
	 * 		ELSE year||'-'||month
	 * 	 END AS stock_year_month       -- 年-月
	 * , count(*) AS all_count         -- 仕入れ件数
	 * from 
	 * warehouse
	 * where 
	 * month in ('12','1','2','3')
	 * group by 
	 * product_id,warehouse_id,year,month
	 * order by
	 * stock_year_month desc,warehouse_id asc,product_id asc;
	 */
}
