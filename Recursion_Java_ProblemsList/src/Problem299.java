import java.util.ArrayList;
import java.util.List;

/*
 * 片方向リストの先頭 head と自然数 x が与えられるので、リストを x だけ右に回転させる、rotateLinkedList という関数を作成してください。
 * 
 * rotateLinkedList(singlyLinkedList([3,2,1]),2) --> 2➡1➡3➡END
 * rotateLinkedList(singlyLinkedList([3,2,1]),10) --> 1➡3➡2➡END
 * rotateLinkedList(singlyLinkedList([3,2,1]),9) --> 3➡2➡1➡END
 * rotateLinkedList(singlyLinkedList([5,6,7,8,9]),2) --> 8➡9➡5➡6➡7➡END
 * rotateLinkedList(singlyLinkedList([6,17,8,1,2,8,3,9,4,5]),18) --> 8➡1➡2➡8➡3➡9➡4➡5➡6➡17➡END
 */
public class Problem299 {
	public static SinglyLinkedListNode<Integer> rotateLinkedList(SinglyLinkedListNode<Integer> head, int x){
		SinglyLinkedListNode<Integer> pointer = head;

		List<Integer> list = new ArrayList<Integer>();

		while(pointer != null){
			list.add(pointer.data);
			pointer = pointer.next;
		}

		// ダミーノード技術を使う。
		SinglyLinkedListNode<Integer> result = new SinglyLinkedListNode<Integer>(0);
		pointer = result;	

		for(int i = list.size() - (x % list.size()); i < list.size(); i++){
			pointer.next = new SinglyLinkedListNode<Integer>(list.get(i));
			pointer = pointer.next;
		}

		for(int i = 0; i<list.size() - (x % list.size()) ; i++){
			pointer.next = new SinglyLinkedListNode<Integer>(list.get(i));
			pointer = pointer.next;
		}	

		return result.next;
	}
}
