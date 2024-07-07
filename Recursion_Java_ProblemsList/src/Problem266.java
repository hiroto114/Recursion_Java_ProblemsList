/*
 * 片方向リストの先頭 head が与えられるので、偶数番目にある全てのノードを奇数番目のノードの後ろに配置する oddEven という関数を作成してください。
 * 
 * oddEven(singlyLinkedList([1,2])) --> 1➡2➡END
 * oddEven(singlyLinkedList([1,2,3])) --> 1➡3➡2➡END
 * oddEven(singlyLinkedList([1,2,3,4,5,6,7])) --> 1➡3➡5➡7➡2➡4➡6➡END
 * oddEven(singlyLinkedList([1,2,3,4,5,6,7,8])) --> 1➡3➡5➡7➡2➡4➡6➡8➡END
 * oddEven(singlyLinkedList([43,56,12,32,58,97,89,74,3,7,103,1])) --> 43➡12➡58➡89➡3➡103➡56➡32➡97➡74➡7➡1➡END
 * 
 */
public class Problem266 {
	public static SinglyLinkedListNode<Integer> oddEven(SinglyLinkedListNode<Integer> head){
		if(head == null) return null;
		SinglyLinkedListNode<Integer> odd = head;
		SinglyLinkedListNode<Integer> even = head.next;
		SinglyLinkedListNode<Integer> evenHead = head.next;
		while(even != null && even.next != null){
			odd.next = even.next;
			odd = even.next;
			even.next = odd.next;
			even = odd.next;
		}
		odd.next = evenHead;
		return head;
	}
}
