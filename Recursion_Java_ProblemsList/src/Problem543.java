/*
 * アプリケーション G では、ユーザーがコメントを投稿し、その内容を更新する機能があります。
 * また、カテゴリの名称を変更する必要があることが判明しました。
 * 
 * まず、ID 番号 23 のコメントを「You are so talented. I do hope these research papers are studied 
 * more so they can someday be implemented in real life!」という内容に更新してください。
 * 次に、全ての「replied」というタイプのコメントを「reply」というタイプに更新してください。
 * 
 * 最後に、更新されたコメントを ID 順に並べ、タイプが「reply」のものだけを 30 件まで表示する SQL クエリを実行してください。
 */
public class Problem543 {
	/*
	 * update comments set content = '' where id = '23';
	 * 
	 * update comments set type = 'reply' where type = 'replied';
	 * 
	 * select * from comments where type = 'reply' order by id LIMIT 30;
	 */
}
