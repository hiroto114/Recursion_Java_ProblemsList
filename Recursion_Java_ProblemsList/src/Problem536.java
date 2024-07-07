/*
 * アプリケーション L は、ユーザーの財務状況や毎月の予算を管理するのに役立ちます。
 * このアプリの新機能の 1 つは、不必要な買い物をユーザーに勧めることができます。
 * 
 * ユーザーの支出を記録した expenses というテーブルが与えられるので、不要な支出をすべて返してください。
 * 不要な支出は、価格が 200 以上であり、is_asset カラムで資産の購入としてマークされておらず、
 * entertainment, outside_dining, travel_vacation, shopping, uncategorized のカテゴリのいずれかに該当する場合です。
 * uncategorized は null として扱われます。
 */
public class Problem536 {
	/*
	 * select * from expenses
	 * where spent >= 200 and is_asset  = 0
	 * and ((type is null) or (type in ('entertainment', 'outside_dining', 'travel_vacation', 'shopping')))
	 */
}
