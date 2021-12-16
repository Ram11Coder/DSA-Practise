package queue;

import java.lang.reflect.Array;

public class Queue<T> {

	private static final int SPECIALINDEX = -1;
	private int headIndex = SPECIALINDEX, tailIndex = SPECIALINDEX;
	private T elements[];
	private final static int MAXSIZE = 6;

	public Queue(Class<T> clazz) {
		this(clazz, MAXSIZE);
	}

	public Queue(Class<T> clazz, int size) {
		elements = (T[]) Array.newInstance(clazz, MAXSIZE);
	}

	public void enqueue(T data) throws QueueOverFlow {
		if (isFull())
			throw new QueueOverFlow();
		tailIndex = (tailIndex + 1) % elements.length;
		elements[tailIndex] = data;
		System.out.println("Enqueued : " + data);
		if (headIndex == SPECIALINDEX) {
			headIndex = tailIndex;
		}

	}

	public T dequeue() throws QueueUnderFlow {
		if (isEmpty())
			throw new QueueUnderFlow();
		T data = elements[headIndex];
		System.out.println("Dequeued : " + data);
		if (headIndex == tailIndex) {
			headIndex = tailIndex = SPECIALINDEX;
		} else {
			headIndex = (headIndex + 1) % elements.length;
		}
		return data;
	}

	public T peek() throws QueueUnderFlow {
		if (isEmpty())
			throw new QueueUnderFlow();
		return elements[headIndex];
	}

	private boolean isEmpty() {

		return headIndex == SPECIALINDEX;
	}

	private boolean isFull() {
		return headIndex == (tailIndex + 1) % elements.length;
	}

	public static class QueueUnderFlow extends Exception {
	}

	public static class QueueOverFlow extends Exception {
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>(Integer.class);
		try {
			queue.enqueue(1);
			queue.enqueue(2);
			queue.enqueue(3);
			queue.enqueue(4);
			queue.enqueue(5);
			queue.enqueue(6);

		} catch (QueueOverFlow e) {
			System.out.println("Queue is Full!!");
		}
		try {
			queue.dequeue();
			queue.dequeue();
			queue.dequeue();
			queue.dequeue();
			queue.dequeue();
			queue.dequeue();
			queue.enqueue(2);
		} catch (QueueUnderFlow e) {
			System.out.println("Queue is Empty!!");
		} catch (QueueOverFlow e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
