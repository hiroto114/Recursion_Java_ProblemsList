/*
 * 片方向リストの先頭 head が与えられるので、真ん中のノードを返す、middleNode という関数を作成してください。
 * 真ん中のノードが 2 つ存在する場合は 2 つ目のノードを返してください。
 * 例えば、入力が [1,2,3,4,5,6,7,8] の場合、真ん中のノードは 4 と 5 の 2 つになります。
 * この場合、2 つ目を優先させるので、答えは [5,6,7,8] になります。
 * 
 * middleNode(singlyLinkedList([1,2])) --> 2➡END
 * middleNode(singlyLinkedList([1,2,3,4,5,6,7])) --> 4➡5➡6➡7➡END
 * middleNode(singlyLinkedList([1,2,3,4,5,6,7,8])) --> 5➡6➡7➡8➡END
 * middleNode(singlyLinkedList([14,35,8,4,97,33,53,68,23,1,84])) --> 33➡53➡68➡23➡1➡84➡END
 * 
 */
public class Problem265 {
	public static SinglyLinkedListNode<Integer> middleNode(SinglyLinkedListNode<Integer> head){
		// 関数を完成させてください
		SinglyLinkedListNode<Integer> slow = head;
		SinglyLinkedListNode<Integer> fast = head;
		while(slow != null && fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;

	}
}

