
/*
 * Mariah は、ブログのいくつかの記事を削除することを考えています。
 * まず、特定の投稿（ID が 1、5、6 のもの）を削除し、
 * さらに「travel_vacation」というカテゴリーに属する全ての投稿を削除する必要があります。
 * その後、残った投稿をカテゴリー順（昇順）、そして同じカテゴリー内ではタイトル順（昇順）に整理して表示する SQL クエリを作成してください。
 */
public class Problem542 {
	/*
	 * delete from posts where id in ('1','5','6');
	 * delete from posts where category = 'travel_vacation';
	 * select * from posts order by category,title;
	 */
}
