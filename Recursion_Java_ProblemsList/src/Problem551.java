/*
 * 半導体製造会社 Red は、半導体を製造し、ToB 向けにセールスを行なっています。Red のマーケチームは今回取引先の会社それぞれの取引額を算出することにしました。

purchase テーブルを駆動表としてクエリを書き、以下のデータを出力してください。quantity × item_price で各 purchases レコードの取引額を計算します。

会社 id（company_id）, 会社名（company_name）, 会社連絡 email（company_email）, 合計取引額（total_amount）
 */
public class Problem551 {
/*
 * select 
    companies.id as company_id
    , companies.name as company_name
    , companies.contact_email as email
    , calculatedPurchases.total_amount
from
    companies
inner join 
    (
    select 
        company_id
        , sum(quantity * item_price) as total_amount
    from 
        purchases
    group by
        company_id
    ) as calculatedPurchases
on 
    companies.id = calculatedPurchases.company_id ;

 */
}
