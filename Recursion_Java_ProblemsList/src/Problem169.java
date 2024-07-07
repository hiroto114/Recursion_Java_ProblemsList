/*
 * 連結リストの先頭 head が与えられるので、リストの末尾のノードを削除した新しい連結リストを返す、
 * deleteTail という関数を作成してください。
 */
public class Problem169 {
    public static SinglyLinkedListNode<Integer> deleteTail(SinglyLinkedListNode<Integer> head){
        if(head == null || head.next == null) return null;
        SinglyLinkedListNode<Integer> pointer = head;
        while(pointer.next.next != null){
            pointer = pointer.next;
        }
        pointer.next = null;
        return head;
    }
}
