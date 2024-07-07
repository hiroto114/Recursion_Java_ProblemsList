public class Problem552 {
/*
 * select
    categories.id
    , categories.name
    , sum(purchases.sales_price) as sum_sales_price
from
    purchases
inner join
    product_categories
on
    purchases.product_id = product_categories.product_id
inner join
    categories
on
    product_categories.category_id = categories.id
group by
    categories.name
order by
    sum_sales_price desc
 */
}
