/*
 * 片方向リストの先頭 head、自然数 n が与えられるので、n 倍した連結リストを返す、reproduceByN という関数を作成してください。
 * 
 * reproduceByN(singlyLinkedList([2,10,34,45,67,356]),3) --> 2➡10➡34➡45➡67➡356➡2➡10➡34➡45➡67➡356➡2➡10➡34
 * ➡45➡67➡356➡END
 * reproduceByN(singlyLinkedList([20,-5,34,45,67,356]),4) --> 20➡-5➡34➡45➡67➡356➡20➡-5➡34➡45➡67➡356➡20➡-5
 * ➡34➡45➡67➡356➡20➡-5➡34➡45➡67➡356➡END
 * reproduceByN(singlyLinkedList([20,-5,34,45,67,356]),6) --> 20➡-5➡34➡45➡67➡356➡20➡-5➡34➡45➡67➡356➡20➡-5
 * ➡34➡45➡67➡356➡20➡-5➡34➡45➡67➡356➡20➡-5➡34➡45➡67➡356➡20➡-5➡34➡45➡67➡356➡END
 * reproduceByN(singlyLinkedList([-8,14,34,45,67,356]),1) --> -8➡14➡34➡45➡67➡356➡END
 */
public class Problem163 {
	public static SinglyLinkedListNode<Integer> reproduceByN(SinglyLinkedListNode<Integer> head, int n){
		SinglyLinkedListNode<Integer> pointerA = head;
		SinglyLinkedListNode<Integer> pointerB = head;
		SinglyLinkedListNode<Integer> pointerC = head;
		while(pointerB.next != null){
			pointerB = pointerB.next;
		}
		pointerC = pointerB;

		while(n>1){
			do{
				pointerB.next = new SinglyLinkedListNode<Integer>(pointerA.data);
				pointerB = pointerB.next;
				pointerA = pointerA.next;            
			}while(pointerA != pointerC.next);
			n--;
			pointerA = head;
		}

		return head;
	}
}
