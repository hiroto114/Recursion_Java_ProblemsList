/*
 * ソート済みの連結リストの先頭 head1 と head2 が与えられるので、
 * それを合体させ、新しい連結リストを返す、mergeTwoSortedLinkedLists という関数を作成してください。
 * 
 * mergeTwoSortedLinkedLists(singlyLinkedList([1,2,3]),singlyLinkedList([1,4,5])) --> 1➡1➡2➡3➡4➡5➡END
 * mergeTwoSortedLinkedLists(singlyLinkedList([1,2,3,10,30,45]),singlyLinkedList([1,4,30,50,80])) --> 1➡1➡2➡3➡4➡10➡30➡30➡45➡50➡80➡END
 * mergeTwoSortedLinkedLists(singlyLinkedList([2,3,5]),singlyLinkedList([5,8,12])) --> 2➡3➡5➡5➡8➡12➡END
 * mergeTwoSortedLinkedLists(singlyLinkedList([1,1,2,3,3,5]),singlyLinkedList([2,2,3,3,5,5,10,10])) --> 1➡1➡2➡2➡2➡3➡3➡3➡3➡5➡5➡5➡10➡10➡END
 * 
 */
public class Problem188 {
	public static SinglyLinkedListNode<Integer> mergeTwoSortedLinkedLists(SinglyLinkedListNode<Integer> head1,SinglyLinkedListNode<Integer> head2) {
		// ダミーノードを最初に作っておいて後続処理をやっておくと簡潔に書ける
		SinglyLinkedListNode<Integer> result = new SinglyLinkedListNode<Integer>(0);
		SinglyLinkedListNode<Integer> resultPointer = result;

		while (head1 != null || head2 != null) {
			if (head1 == null) {
				resultPointer.next = new SinglyLinkedListNode<Integer>(head2.data);
				head2 = head2.next;
			} else if (head2 == null) {
				resultPointer.next = new SinglyLinkedListNode<Integer>(head1.data);
				head1 = head1.next;
			} else {
				resultPointer.next = new SinglyLinkedListNode<Integer>(Math.min(head1.data, head2.data));
				if (head1.data == Math.min(head1.data, head2.data))
					head1 = head1.next;
				else
					head2 = head2.next;
			}
			resultPointer = resultPointer.next;
		}
		return result.next;
	}
}
