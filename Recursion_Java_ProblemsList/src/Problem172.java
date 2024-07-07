/*
 * 連結リストの先頭 head と整数 data が与えられるので、
 * リスト内に存在する data のインデックスを返す、linkedListSearch という関数を作成してください。もし、data が存在しない場合は、-1 を返してください。
 */
public class Problem172 {
	public static int linkedListSearch(SinglyLinkedListNode<Integer> head, int data){
		SinglyLinkedListNode<Integer> pointer = head;
		int index = 0;

		while(pointer != null){
			if(pointer.data == data){
				return index;
			}
			pointer = pointer.next;
			index += 1;
		}

		return -1;
	}
}
