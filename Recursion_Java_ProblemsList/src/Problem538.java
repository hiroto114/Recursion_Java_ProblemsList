
/*
 * Clair のチームはモバイル開発に携わっています。モバイルアプリがクラッシュするたびに、そのイベントをサーバに送信し、クラッシュの詳細が crash_logs に保存されます。

最近のバグにより、特定の電話機用のアプリでアプリがクラッシュするようになりました。デバッグするために、発生した最新のクラッシュを取得する必要があります。

発生した最新のクラッシュを作成日順に最新順に返すクエリを作成してください。エラーの model_number, event, stack_trace, created_at を返します。
 */
public class Problem538 {
	/*
	 * select model_number, event, stack_trace, created_at
	 * from crash_logs
	 * order by created_at desc
	 */
}
