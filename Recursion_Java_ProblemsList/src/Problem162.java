import java.util.ArrayList;

/*
 * 連結リストの先頭 headA と headB がそれぞれ与えられるので、
 * お互いの連結リストが交わるノードの値を返す、findMergeNode という関数を作成してください。
 * headA と headB は異なるものとし、null ではありません。また全ての整数は正とし、A と B の交わりが存在しない場合は -1 を返してください。
 * 
 * reproduceByN(singlyLinkedList([2,10,34,45,67,356]),3) --> 2➡10➡34➡45➡67➡356➡2➡10➡34➡45➡67➡356➡2➡10➡34
 * ➡45➡67➡356➡END
 * reproduceByN(singlyLinkedList([20,-5,34,45,67,356]),4) --> 20➡-5➡34➡45➡67➡356➡20➡-5➡34➡45➡67➡356➡20➡-5
 * ➡34➡45➡67➡356➡20➡-5➡34➡45➡67➡356➡END
 * reproduceByN(singlyLinkedList([20,-5,34,45,67,356]),6) --> 20➡-5➡34➡45➡67➡356➡20➡-5➡34➡45➡67➡356➡20➡-5
 * ➡34➡45➡67➡356➡20➡-5➡34➡45➡67➡356➡20➡-5➡34➡45➡67➡356➡20➡-5➡34➡45➡67➡356➡END
 * reproduceByN(singlyLinkedList([-8,14,34,45,67,356]),1) --> -8➡14➡34➡45➡67➡356➡END
 */
public class Problem162 {
    public static int findMergeNode(SinglyLinkedListNode<Integer> headA, SinglyLinkedListNode<Integer> headB){
        ArrayList<Integer> headAList = new ArrayList<Integer>();
        ArrayList<Integer> headBList = new ArrayList<Integer>();

        while(headA != null){
            headAList.add(headA.data);
            headA = headA.next;
        }

        while(headB != null){
            headBList.add(headB.data);
            headB = headB.next;
        }
        if(!(headAList.get(headAList.size()-1)).equals(headBList.get(headBList.size()-1))){
            return -1;
        }

        int result = headAList.size()-1;
        int a = headAList.size()-1;
        int b = headBList.size()-1;
        while(a >=0 && b >=0){
            if(headAList.get(a).equals(headBList.get(b))){
                result = headAList.get(a).intValue();
            }else{
                break;
            }
            a--;
            b--;
        }

        return result;
    }
}
