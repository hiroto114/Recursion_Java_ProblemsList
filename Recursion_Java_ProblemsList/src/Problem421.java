/*
 * 整数で構成される配列 arr が与えられるので、片方向リスト化する getLinkedList という関数を作成してください。
 */
public class Problem421 {
	public static SinglyLinkedListNode<Integer> getLinkedList(int[] arr){
		SinglyLinkedListNode<Integer> head = new SinglyLinkedListNode<Integer>(arr[0]);
		SinglyLinkedListNode<Integer> pointer = head;
		for(int i=1;i<arr.length;i++){
			pointer.next = new SinglyLinkedListNode<Integer>(arr[i]);
			pointer = pointer.next;
		}

		return head;
	}
}
