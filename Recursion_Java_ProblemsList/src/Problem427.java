/*
 * 片方向リストの先頭ノード head が与えられるので、末尾の値を返す linkedListLastValue という関数を作成してください。
 */
public class Problem427 {
	public static int linkedListLastValue(SinglyLinkedListNode<Integer> head){
		SinglyLinkedListNode<Integer> pointer = head;
		while(pointer.next != null){
			pointer = pointer.next;
		}
		return pointer.data;
	}
}
