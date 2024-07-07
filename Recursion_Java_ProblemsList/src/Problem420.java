public class Problem420 {
	public static void main(String[] args){
		SinglyLinkedListNode<Integer> item1 = new SinglyLinkedListNode<Integer>(7);
		SinglyLinkedListNode<Integer> item2 = new SinglyLinkedListNode<Integer>(99);
		SinglyLinkedListNode<Integer> item3 = new SinglyLinkedListNode<Integer>(45);
		item1.next = item2;
		item2.next = item3;
		SinglyLinkedListNode<Integer> pointer = item1;
		while(pointer != null){
			System.out.println(pointer.data);
			pointer = pointer.next;
		}

	}
}
