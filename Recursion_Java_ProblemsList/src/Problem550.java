
/*
 * 大企業の会社が三つのユーザーテーブルを設定しました。
 * 会社員（employees）、見込み客（leads）、客（customers）テーブルがあります。
 * キャンペーンをリリースする前に、現在のデータを分析する必要があります。
 * 
 * 全ユーザーの特定の情報を取得してください。
 * 全ユーザーテーブルを結合して、username, email, first_name, last_name, created_at, type という情報を抽出してください。
 * created_at を降順にして、各ユーザーの type カラムは元テーブル名にしてください。
 */
public class Problem550 {
/*
 * -- クエリを書いてください。 --
select
    username,
    email,
    customer_first_name as first_name,
    customer_last_name as last_name,
    created_at,
    'customers' as type
from
    customers
union all
select
    username,
    email,
    employee_first_name as first_name,
    employee_last_name as last_name,
    created_at,
    'employees' as type
from
    employees
union all
select
    null,
    email,
    first_name as first_name,
    last_name as last_name,
    created_at,
    'leads' as type
from
    leads
order by
    created_at desc;
 */
}
