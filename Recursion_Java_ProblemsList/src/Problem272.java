/*
 * 片方向リストの先頭 head が与えられるので、隣接する 2 つのノードを全て入れ替えた後、その根ノードを返す、swapNodes という関数を作成してください。
 */
public class Problem272 {
	public static SinglyLinkedListNode<Integer> swapNodes(SinglyLinkedListNode<Integer> head){
		SinglyLinkedListNode<Integer> pointer = head;
		while(pointer != null && pointer.next != null){
			Integer temp = pointer.data;
			pointer.data = pointer.next.data;
			pointer.next.data = temp;
			pointer = pointer.next.next;
		}
		return head;
	}
}
