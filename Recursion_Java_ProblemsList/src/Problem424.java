/*
 * 片方向リストの先頭ノード head が与えられるので、
 * 逆向きに変換した連結リストを返す reverseLinkedList という関数を作成してください。
 */
public class Problem424 {
	public static SinglyLinkedListNode<Integer> reverseLinkedList(SinglyLinkedListNode<Integer> head){
		return reverseLinkedListHelper(head,null);
	}

	public static SinglyLinkedListNode<Integer> reverseLinkedListHelper(SinglyLinkedListNode<Integer> head,SinglyLinkedListNode<Integer> prev){
		if(head == null) return prev;

		SinglyLinkedListNode<Integer> temp = head.next;
		head.next = prev;

		return reverseLinkedListHelper(temp, head);
	}
}
