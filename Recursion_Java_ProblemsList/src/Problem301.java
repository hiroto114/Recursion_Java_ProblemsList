import java.util.ArrayList;
import java.util.List;

/*
 * 片方向リストの先頭 head が与えられるので、リストを 1 番目 -> n 番目 -> 2 番目 -> n-1 番目 … と並び替える shuffleLinkedList を作成してください。
 * 
 * shuffleLinkedList(singlyLinkedList([1])) --> 1➡END
 * shuffleLinkedList(singlyLinkedList([4,5])) --> 4➡5➡END
 * shuffleLinkedList(singlyLinkedList([3,6,8])) --> 3➡8➡6➡END
 * shuffleLinkedList(singlyLinkedList([3,6,8,7])) --> 3➡7➡6➡8➡END
 * shuffleLinkedList(singlyLinkedList([3,6,8,7,2])) --> 3➡2➡6➡7➡8➡END
 * 
 */
public class Problem301 {
	public static SinglyLinkedListNode<Integer> shuffleLinkedList(SinglyLinkedListNode<Integer> head){
		List<Integer> listValues = new ArrayList<Integer>();
		SinglyLinkedListNode<Integer> pointer = head;
		while(pointer != null){
			listValues.add(pointer.data);
			pointer = pointer.next;
		}

		SinglyLinkedListNode<Integer> result = new SinglyLinkedListNode<Integer>(0);
		SinglyLinkedListNode<Integer> resultPointer = result;
		for(int i=0; i<= listValues.size()/2 - 1; i++){
			resultPointer.next = new SinglyLinkedListNode<Integer>(listValues.get(i));
			resultPointer.next.next = new SinglyLinkedListNode<Integer>(listValues.get(listValues.size()-i-1));
			resultPointer = resultPointer.next.next;
		}
		if(listValues.size() % 2 != 0){
			resultPointer.next = new SinglyLinkedListNode<Integer>(listValues.get(listValues.size()/2));
		}
		return result.next;
	}
}
