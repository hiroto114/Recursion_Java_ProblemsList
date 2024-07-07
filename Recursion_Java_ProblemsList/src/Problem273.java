/*
 * 片方向リストの先頭 head が与えられるので、末尾から n 番目のノードを削除、連結し、新しい連結リストの根ノードを返す、
 * removeNthNode という関数を作成してください。n が 0、もしくは片方向リストのサイズより大きい場合は、head をそのまま返してください。
 * 
 * removeNthNode(singlyLinkedList([5]),15) --> 5➡END
 * removeNthNode(singlyLinkedList([5]),0) --> 5➡END
 * removeNthNode(singlyLinkedList([5]),1) --> END
 * removeNthNode(singlyLinkedList([3,5]),1) --> 3➡END
 * removeNthNode(singlyLinkedList([3,5]),2) --> 5➡END
 * removeNthNode(singlyLinkedList([0,1,2,3,4]),2) --> 0➡1➡2➡4➡END
 * removeNthNode(singlyLinkedList([3,5,2,7,56,23,86,93,43,23,55,5,78,0,13,1]),11) --> 3➡5➡2➡7➡56➡86➡93➡43➡23➡55➡5➡78➡0➡13➡1➡END
 * 
 */
public class Problem273 {
	// 末尾から n 番目のノードを削除、連結し、新しい連結リストの根ノードを返す
	public static SinglyLinkedListNode<Integer> removeNthNode(SinglyLinkedListNode<Integer> head, int n){
		SinglyLinkedListNode<Integer> pointer = head;
		int length = 0;
		while(pointer != null){
			length += 1;
			pointer = pointer.next;
		}

		if(n == 0 || n > length) return head;
		if(length - n == 0) return head.next;

		SinglyLinkedListNode<Integer> result = head;
		int index = 0;
		while(index < length - n - 1){
			index += 1;
			result = result.next;
		}
		result.next = result.next.next;
		return head;
	}
}
