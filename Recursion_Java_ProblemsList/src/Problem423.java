/*
 * 片方向リストの先頭ノード head が与えられるので、偶数番目の値を 2 倍にし、
 * それぞれの要素の後ろに追加し、連結リストを返す doubleEvenNumber という関数を作成してください。
 * 
 * doubleEvenNumber(singlyLinkedList([3,2,1,5,6,4])) --> 3➡6➡2➡1➡2➡5➡6➡12➡4➡END
 * doubleEvenNumber(singlyLinkedList([3])) --> 3➡6➡END
 * doubleEvenNumber(singlyLinkedList([3,1])) --> 3➡6➡1➡END
 * doubleEvenNumber(singlyLinkedList([3,1,5])) --> 3➡6➡1➡5➡10➡END
 */
public class Problem423 {
	public static SinglyLinkedListNode<Integer> doubleEvenNumber(SinglyLinkedListNode<Integer> head){
		SinglyLinkedListNode<Integer> headPointer = head;

		while(headPointer != null){
			SinglyLinkedListNode<Integer> temp = headPointer.next;
			headPointer.next = new SinglyLinkedListNode<Integer>(headPointer.data*2);
			headPointer.next.next = temp;
			if(temp == null) break;
			if(temp.next == null) break;
			headPointer = temp.next;
		}

		return head;

	}
}
