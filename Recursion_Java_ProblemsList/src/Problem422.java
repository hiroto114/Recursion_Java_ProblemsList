/*
 * 片方向リストの先頭ノード head と自然数 index が与えられるので、片方向リスト内の index 番目の要素の値を返す getIndexValue という関数を作成してください。
 */
public class Problem422 {
	public static int getIndexValue(SinglyLinkedListNode<Integer> head, int index){
		int count = 1;
		SinglyLinkedListNode<Integer> pointer = head;
		while(pointer != null){
			if(count == index) return pointer.data;
			count += 1;
			pointer = pointer.next;
		}


		return -1;
	}
}
