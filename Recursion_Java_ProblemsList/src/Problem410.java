public class Problem410 {
	public static void main(String[] args){
		Stack s1 = new Stack();
		s1.push(2);
		System.out.println(s1.peek());
		s1.push(4);
		s1.push(3);
		s1.push(1);
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		Stack s2 = new Stack();
		s2.pop();
		s2.push(9);
		s2.push(8);
		System.out.println(s2.peek());        
	}
}

class Stack {
	public Node head;

	public Stack(){
		this.head = null;
	}

	public void push(int data){
		Node temp = this.head;
		this.head = new Node(data);
		this.head.next = temp;
	}

	public Integer pop(){
		if (this.head == null) return null;
		Node temp = this.head;
		this.head = this.head.next;
		return temp.data;
	}

	public Integer peek(){
		if (this.head == null) return null;
		return this.head.data;
	}
}
