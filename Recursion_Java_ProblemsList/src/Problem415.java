public class Problem415 {
	public static void main(String[] args){
		Deque q = new Deque();
		q.enqueueBack(4);
		q.enqueueBack(50);
		System.out.println(q.peekFront());
		System.out.println(q.peekBack());
		q.enqueueFront(36);
		q.enqueueFront(96);
		System.out.println(q.peekFront());
		System.out.println(q.peekBack());
		System.out.println(q.dequeueBack());
		System.out.println(q.dequeueBack());
		System.out.println(q.peekFront());
		System.out.println(q.peekBack());
		q.enqueueFront(20);
		System.out.println(q.dequeueBack());
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
class Deque{
	public Node head;
	public Node tail;

	public Integer peekFront(){
		if(head != null) return head.data;
		return 0;
	}

	public Integer peekBack(){
		if(tail != null) return tail.data;
		return 0;
	}    

	public void enqueueFront(int data){
		Node addItem = new Node(data);
		if(head == null){
			head = addItem;
			tail = addItem;
		}else{
			addItem.next = head;
			head.prev = addItem;
			head = addItem;	    
		}
	}

	public void enqueueBack(int data){
		Node addItem = new Node(data);
		if(head == null){
			head = addItem;
			tail = addItem;
		}else{
			tail.next = addItem;
			addItem.prev = tail;
			tail = addItem;	    
		}
	}

	public Integer dequeueFront(){
		if(this.head == null) return 0;
		Integer result = this.head.data;
		if(this.head.next != null){
			this.head = this.head.next;
			this.head.prev = null;
		}else{
			this.head = null;
			this.tail = null;
		}
		return result;
	}

	public Integer dequeueBack(){
		if(this.tail == null) return 0;
		Integer result = this.tail.data;
		if(this.tail.prev != null){
			this.tail = this.tail.prev;
			this.tail.next = null;
		}else{
			this.head = null;
			this.tail = null;
		}
		return result;
	}
}
