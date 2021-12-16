package queue;

import stack.Stack;
import stack.Stack.StackOverflowException;
import stack.Stack.StackUnderflowException;
import queue.Queue.QueueOverFlow;
import queue.Queue.QueueUnderFlow;

public class QueueUsing2Stacks {

	Stack<Integer> forwardStack = new Stack<Integer>();
	Stack<Integer> reverseStack = new Stack<Integer>();

	public void enqueue(int data) throws QueueOverFlow {
		/**
		 * Both holding same elements so check either one of the stack
		 */
		if (forwardStack.isFull() || reverseStack.isFull()) {
			throw new QueueOverFlow();
		}
		System.out.println("Enqueued : " + data);

		try {
			if (forwardStack.isEmpty()) {
				while (!reverseStack.isEmpty()) {
					forwardStack.push(reverseStack.pop());
				}

			}
			forwardStack.push(data);
		} catch (StackOverflowException | StackUnderflowException se) {
			throw new QueueOverFlow();

		}
	}

	public int dequeue() throws QueueUnderFlow {
		if (forwardStack.isEmpty() && reverseStack.isEmpty())
			throw new QueueUnderFlow();
		try {
			if (reverseStack.isEmpty()) {
				while (!forwardStack.isEmpty()) {
					reverseStack.push(forwardStack.pop());
				}
			}

			System.out.println("Dequeued : " + reverseStack.peek());
			return reverseStack.pop();
		} catch (StackOverflowException | StackUnderflowException se) {
			throw new QueueUnderFlow();
		}

	}

	public int peek() throws QueueUnderFlow {
		if (forwardStack.isEmpty() && reverseStack.isEmpty())
			throw new QueueUnderFlow();
		try {
			if (reverseStack.isEmpty()) {
				while (!forwardStack.isEmpty()) {
					reverseStack.push(forwardStack.pop());
				}
			}

			int data = reverseStack.peek();
			while (!reverseStack.isEmpty())
				forwardStack.push(reverseStack.pop());
			return data;
		} catch (StackUnderflowException | StackOverflowException se) {
			throw new QueueUnderFlow();
		}

	}

	public static void main(String[] args) {
		QueueUsing2Stacks queue = new QueueUsing2Stacks();
		try {
			queue.enqueue(1);
			queue.enqueue(2);
			queue.enqueue(3);
			queue.enqueue(4);
			queue.enqueue(5);
			System.out.println("Peek : " + queue.peek());
			queue.dequeue();
			queue.dequeue();
			System.out.println("Peek : " + queue.peek());
			queue.dequeue();
			System.out.println("Peek : " + queue.peek());
			queue.dequeue();
			System.out.println("Peek : " + queue.peek());
			queue.dequeue();
			System.out.println(queue.peek());
		} catch (QueueOverFlow e) {
			System.err.println("Queue Overflow!!");
		} catch (QueueUnderFlow e) {
			System.err.println("Queue Underflow!!");
		}

	}
}
