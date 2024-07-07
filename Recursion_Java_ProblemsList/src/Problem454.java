import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Problem454 {
	public static void main(String[] args) {
		EventQueue myEventQueueSystem = new EventQueue();
		Supplier<String> math = () -> "You will study math today";
		Supplier<String> music = () -> "You will study music today";
		Supplier<String> squat = () -> "You will work out squat 6 times today";
		Supplier<String> pushUp = () -> "You will work out squat 20 Push-up today";

		myEventQueueSystem.push("Study", math);
		myEventQueueSystem.push("Study", music);
		myEventQueueSystem.push("WorkOut", squat);
		myEventQueueSystem.push("WorkOut", pushUp);

		myEventQueueSystem.dispatch("Study");
		myEventQueueSystem.dispatch("Study");
		myEventQueueSystem.dispatch("Study");
		myEventQueueSystem.dispatch("WorkOut");
		myEventQueueSystem.dispatch("WorkOut");
		myEventQueueSystem.dispatch("Something");
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

	public Supplier<String> dequeue() {
		if (head == null)
			return null;
		Item result = head;
		head = head.next;
		return result.data;
	}
}

class EventQueue {
	public Map<String, Queue> queue = new HashMap<String, Queue>();

	public void push(String event, Supplier<String> task) {
		if (queue.get(event) == null) {
			Queue q = new Queue();
			q.enqueue(task);
			queue.put(event, q);
		} else {
			Queue q = queue.get(event);
			q.enqueue(task);
			queue.put(event, q);
		}
	}

	public void dispatch(String event) {
		if (eventExists(event)) {
			Queue eventQueue = queue.get(event);
			Supplier<String> i = eventQueue.dequeue();
			System.out.println(i.get());
			if (eventQueue.peekFront() == null)
				queue.remove(event);
		} else {
			System.out.println("Event is none!");
		}
	}

	public boolean eventExists(String event) {
		return queue.get(event) != null;
	}
}
