/*
 * 連結リストの先頭 head が与えられるので、
 * リストの中の最小値のインデックスを返す、findMinNum という関数を作成してください。最小値が複数ある場合最後の最小値のインデックスを返してください。
 */
public class Problem171 {
	public static int findMinNum(SinglyLinkedListNode<Integer> head){
		SinglyLinkedListNode<Integer> pointer = head;
		Integer min = head.data;
		int index  = 0;
		int minIndex = 0;

		while(pointer != null){
			if(pointer.data <= min){
				min = pointer.data;
				minIndex = index;
			}
			index += 1;
			pointer = pointer.next;
		}

		return minIndex;
	}
}
