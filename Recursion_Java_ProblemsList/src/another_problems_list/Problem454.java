package another_problems_list;

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

class Item1 {
	public Supplier<String> data;
	public Item1 next;

	public Item1(Supplier<String> data) {
		this.data = data;
	}
}

class Queue1 {
	public Item1 head;
	public Item1 tail;

	public Item1 peekFront() {
		return head;
	}

	public void enqueue(Supplier<String> data) {
		if (head == null) {
			head = new Item1(data);
			tail = head;
		} else {
			Item1 tailResult = new Item1(data);
			tail.next = tailResult;
			this.tail = tailResult;
		}
	}

	public Supplier<String> dequeue() {
		if (head == null)
			return null;
		Item1 result = head;
		head = head.next;
		return result.data;
	}
}

class EventQueue {
	public Map<String, Queue1> queue = new HashMap<String, Queue1>();

	public void push(String event, Supplier<String> task) {
		if (queue.get(event) == null) {
			Queue1 q = new Queue1();
			q.enqueue(task);
			queue.put(event, q);
		} else {
			Queue1 q = queue.get(event);
			q.enqueue(task);
			queue.put(event, q);
		}
	}

	public void dispatch(String event) {
		if (eventExists(event)) {
			Queue1 eventQueue = queue.get(event);
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
