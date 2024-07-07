/*
 * 片方向リストの先頭ノード head が与えられるので、片方向リストの長さを返す linkedListLength という関数を作成してください。
 */
public class Problem426 {
	public static int linkedListLength(SinglyLinkedListNode<Integer> head){
		int result = 0;
		while(head != null){
			result += 1;
			head = head.next;
		}

		return result;
	}
}
