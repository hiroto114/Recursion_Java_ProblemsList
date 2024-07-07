/*
 * 双方向リストの実装
 */
public class Problem425 {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7};
		DoublyLinkedList numList = new DoublyLinkedList(arr);
		System.out.println(numList.head.data);
		System.out.println(numList.head.next.data);
		System.out.println(numList.head.next.prev.data);
		System.out.println(numList.tail.data);
		System.out.println(numList.tail.prev.data);
		System.out.println(numList.tail.prev.prev.data);
	}
}
class Node{
	public int data;
	public Node prev;
	public Node next;

	public Node(int data){
		this.data = data;
	}
}

class DoublyLinkedList{
	public Node head;
	public Node tail;

	public DoublyLinkedList(int[] arr){
		if(arr.length <= 0){
			this.head = null;
			this.tail = this.head;
			return;
		}

		this.head = new Node(arr[0]);
		Node currentNode = this.head;
		for(int i=1; i < arr.length; i++){
			currentNode.next = new Node(arr[i]);
			currentNode.next.prev = currentNode;
			currentNode = currentNode.next;
		}
		this.tail = currentNode;
	}

	public Node at(int index){
		Node iterator = this.head;
		for(int i=0; i < index; i++){
			iterator = iterator.next;
			if(iterator == null) return null;
		}
		return iterator;
	}

	public void preappend(Node newNode){
		this.head.prev = newNode;
		newNode.next = this.head;
		newNode.prev = null;
		this.head = newNode;
	}    

	public void append(Node newNode){
		this.tail.next = newNode;
		newNode.prev = this.tail;
		newNode.next = null;
		this.tail = newNode;
	}

	public void addNextNode(Node node, Node newNode){
		Node tempNode = node.next;
		node.next = newNode;
		newNode.next = tempNode;
		newNode.prev = node;

		if(node == this.tail) this.tail = newNode;
		else tempNode.prev = newNode;
	}

	// リストの先頭から要素をpopします。O(1)
	public void popFront(){
		this.head = this.head.next;
		this.head.prev = null;
	}

	// リストの末尾から要素をpopします。O(1)
	public void pop(){
		this.tail = this.tail.prev;
		this.tail.next = null;
	}

	// 与えられたノードをO(1)で削除します。
	public void deleteNode(Node node){
		if(node == this.tail) this.pop();
		else if(node == this.head) this.popFront();
		else {
			node.prev.next = node.next;
			node.next.prev = node.prev;
		}
	}

	/*
	 * あとはここだけやな。
	 * ここはこういう簡潔に書ける解き方もあるんだで覚えておこう。
	 */
	public void reverse() {
		Node currentNode = this.head;
		this.head = this.tail;
		this.tail = currentNode;

		while (currentNode != null) {
			Node prevNode = currentNode.prev;
			currentNode.prev = currentNode.next;
			currentNode.next = prevNode;
			currentNode = currentNode.prev;
		}
	}

	public void printInReverse(){
		String str = "";
		Node iterator = this.tail;
		while(iterator != null){
			str += iterator.data + " ";
			iterator = iterator.prev;
		}
		System.out.println("[" + str + "]");
	}

	public void printList(){
		Node iterator = this.head;
		String str = "";
		while(iterator != null){
			str += iterator.data + " ";
			iterator = iterator.next;
		}
		System.out.println("[" + str + "]");
	}
}
