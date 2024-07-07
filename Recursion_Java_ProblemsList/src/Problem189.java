import java.util.Stack;

/*
 * 連結リストの先頭 head が与えられるので、それが回文になっているか判定する、palindromeLinkedList という関数を作成してください。
 * 
 * palindromeLinkedList(singlyLinkedList([1,2,3])) --> false
 * palindromeLinkedList(singlyLinkedList([1,2])) --> false
 * palindromeLinkedList(singlyLinkedList([1,0,1])) --> true
 * palindromeLinkedList(singlyLinkedList([3,4,4,3,6])) --> false
 * palindromeLinkedList(singlyLinkedList([3,6,4,4,3,6])) --> false
 * palindromeLinkedList(singlyLinkedList([3,6,4,4,6,3])) --> true
 * palindromeLinkedList(singlyLinkedList([1,2,3,2,1])) --> true
 * 
 */
public class Problem189 {
	public static boolean palindromeLinkedList(SinglyLinkedListNode<Integer> head) {
		Stack<Integer> countHalf = new Stack<Integer>();
		SinglyLinkedListNode<Integer> slow = head;
		SinglyLinkedListNode<Integer> fast = head;

		while (fast != null && fast.next != null) {
			countHalf.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}

		if (fast != null)
			slow = slow.next;

		while (countHalf.size() > 0) {
			if (countHalf.pop() != slow.data)
				return false;
			slow = slow.next;
		}

		return true;
	}
}
