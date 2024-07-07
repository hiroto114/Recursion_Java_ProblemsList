import java.util.function.Supplier;

public class Problem453 {
	public static void main(String[] args) {
		TaskQueue scheduler = new TaskQueue();
		Supplier<String> firstTask = () -> "Running the first function!!!";
		Supplier<String> secondTask = () -> "Running the second function~~~";
		Supplier<String> thirdTask = () -> "Running the third function>>>";
		Supplier<String> fourthTask = () -> "Running the fourth function<<<";

		scheduler.push(firstTask);
		scheduler.push(secondTask);
		scheduler.push(thirdTask);
		scheduler.push(fourthTask);
		scheduler.run();
	}
}

class Item {
	public Supplier<String> data;
	public Item next;

	public Item(Supplier<String> data) {
		this.data = data;
	}
}

class Queue {
	public Item head;
	public Item tail;

	public Item peekFront() {
		return head;
	}

	public void enqueue(Supplier<String> data) {
		if (head == null) {
			head = new Item(data);
			tail = head;
		} else {
			Item tailResult = new Item(data);
			tail.next = tailResult;
			this.tail = tailResult;
		}
	}

	public Item dequeue() {
		if (head == null) return null;
		Item result = head;
		head = head.next;
		return result;
	}
}

class TaskQueue {
	public Queue queue = new Queue();

	public void push(Supplier<String> task) {
		this.queue.enqueue(task);
	}

	public boolean taskExist() {
		return queue.head != null;
	}

	public void run() {
		while (taskExist()) {
			System.out.println(queue.head.data.get());
			queue.dequeue();
		}
	}
}
