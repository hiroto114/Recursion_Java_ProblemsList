/*
 * 連結リストの先頭 head と整数 data が与えられるので、
 * リストの先頭と末尾にデータを挿入した新しい連結リストを返す、insertHeadTail という関数を作成してください。
 */
public class Problem170 {
    public static SinglyLinkedListNode<Integer> insertHeadTail(SinglyLinkedListNode<Integer> head, int data){
        SinglyLinkedListNode<Integer> result = new SinglyLinkedListNode<Integer>(data);
        result.next = head;
        while(head.next !=null){
            head = head.next;
        }
        head.next = new SinglyLinkedListNode<Integer>(data);
        return result;
    }
}
