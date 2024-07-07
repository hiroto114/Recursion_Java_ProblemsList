/*
 * 連結リストの先頭 head と整数 data が与えられるので、リストの先頭にデータを挿入した新しい連結リストを返す、insertAtHead という関数を作成してください。
 */
public class Problem167 {
    public static SinglyLinkedListNode<Integer> insertAtHead(SinglyLinkedListNode<Integer> head, int data){
        SinglyLinkedListNode<Integer> target = new SinglyLinkedListNode<Integer>(data);
        target.next = head;
        return target;
        
    }
}
