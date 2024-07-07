/*
 * ソート済みの連結リストの先頭 head と、データ data が与えられるので、
 * ノードを正しい位置に挿入した連結リストを返す、insertNodeInSorted という関数を作成してください。
 */
public class Problem161 {
	public static SinglyLinkedListNode<Integer> insertNodeInSorted(
			SinglyLinkedListNode<Integer> head, int data) {
		// もしもheadがnullだった場合
		if (head == null)
			return new SinglyLinkedListNode<Integer>(data);

		// もしも1番最初にノードを追加したい場合
		if (data <= head.data) {
			SinglyLinkedListNode<Integer> result = new SinglyLinkedListNode<Integer>(data);
			result.next = head;
			return result;
		}

		// もしも追加したいノードが2番目にある場合
		SinglyLinkedListNode<Integer> pointer = head;
		while (pointer != null) {
			if (pointer.next == null) {
				pointer.next = new SinglyLinkedListNode<Integer>(data);
				break;
			}
			if (pointer.data <= data && data <= pointer.next.data) {
				SinglyLinkedListNode<Integer> temp = pointer.next;
				pointer.next = new SinglyLinkedListNode<Integer>(data);
				pointer.next.next = temp;
				break;
			}
			pointer = pointer.next;
		}
		return head;
	}
}
