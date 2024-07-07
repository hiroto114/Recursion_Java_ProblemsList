/*
 * 連結リストの先頭 head と整数 data が与えられるので、連結リストの末尾にデータを挿入した新しい連結リストを返す、insertAtTail という関数を作成してください。


 */
public class Problem168 {
    public static SinglyLinkedListNode<Integer> insertAtTail(SinglyLinkedListNode<Integer> head, int data){
        SinglyLinkedListNode<Integer> pointer = head;
        while(pointer.next != null){
            pointer = pointer.next;
        }

        pointer.next = new SinglyLinkedListNode<Integer>(data);

        return head;
    }
}
