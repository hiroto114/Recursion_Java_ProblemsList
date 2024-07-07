/*
 * 0 と 1 で構成される片方向リストの先頭 head が与えられるので、連結リスト内の数値を 10 進数に変換する、binaryToInteger という関数を作成してください。
 */
public class Problem283 {
	public static int binaryToInteger(SinglyLinkedListNode<Integer> head){
		StringBuilder result = new StringBuilder("");
		SinglyLinkedListNode<Integer> pointer = head;
		while(pointer != null){
			result.append(pointer.data);
			pointer = pointer.next;
		}
		return Integer.parseInt(result.toString(), 2);
	}
}
