package stack;

/**
 * 
 * Space Complexity (for n push operations) O(n) Time Complexity of push() O(1)
 * Time Complexity of pop() O(1) Time Complexity of size() O(1) Time Complexity
 * of isEmpty() O(1) Time Complexity of isFullStack() O(1) Time Complexity of
 * deleteStack() O(1)
 *
 * 
 */
public class ArrayBasedStack {
	static private final int CAPACITY = 10;
	private int top = -1;
	private int capacity;
	private int stack[];

	public ArrayBasedStack() {
		this(CAPACITY);
	}

	public int getTop() throws Exception {
		if (isStackEmpty())
			throw new Exception("Stack underflow!!");
		return stack[top];
	}

	public int getSize() {
		return top + 1;
	}

	private void push(int data) {
		if (isStackFull()) {
			throw new StackOverflowError();
		} else {
			stack[++top] = data;
			System.out.println(data + " is pushed into index " + top);
		}
	}

	public int pop() throws Exception {
		if (isStackEmpty())
			throw new Exception("Stack underflow!!");
		int data = stack[top];
		stack[top--] = Integer.MIN_VALUE;
		return data;
	}

	public boolean isStackEmpty() {
		return getSize() <= 0;
	}

	private boolean isStackFull() {
		return getSize() == capacity;
	}

	public ArrayBasedStack(int cap) {
		capacity = cap;
		stack = new int[capacity];
	}

	private void printStack() {
		System.out.println("Stack elements are :" + (isStackEmpty() ? " Empty  " : ""));
		for (int i = 0; i < getSize(); i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}

	private void reverseTheDatas() {
		System.out.println("Reverse of stack elements are :" + (isStackEmpty() ? " Empty  " : ""));
		for (int i = getSize() - 1; i >= 0; i--) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		ArrayBasedStack stack = new ArrayBasedStack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack.pop() + " is popped!!");
		System.out.println(stack.pop() + " is popped!!");
		System.out.println(stack.pop() + " is popped!!");
		// System.out.println(stack.pop() + " is popped!!");
//		System.out.println(stack.pop() + " is popped!!");
		stack.printStack();
		stack.reverseTheDatas();
		System.out.println(stack.getSize());
		System.out.println(stack.getTop());
	}

}
