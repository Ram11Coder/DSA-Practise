package stack;

public class DynamicArrayStack {
	private static final int CAPACITY = 8;
	private int capacity;
	private int stack[];
	private int top = -1;

	public DynamicArrayStack() {
		this(CAPACITY);
	}

	public DynamicArrayStack(int cap) {
		capacity = cap;
		stack = new int[capacity];
	}

	public int getTop() {
		return stack[top];
	}

	public int size() {
		return top + 1;
	}

	public boolean isStackFull() {
		return size() == capacity;
	}

	public boolean isStackEmpty() {
		return size() <= 0;
	}

	public void push(int data) {
		if (isStackFull())
			recreate();
		stack[++top] = data;
	}

	private void recreate() {
		System.out.println("Recreating the stack");
		int len = size();
		int newArray[] = new int[len << 1];

		System.arraycopy(stack, 0, newArray, 0, len);
		stack = newArray;
		this.capacity = capacity << 1;
	}

	public int pop() throws Exception {
		if (isStackEmpty()) {
			throw new Exception("Stack underflow!!");
		}
		int data = stack[top];
		stack[top--] = Integer.MIN_VALUE;
		shrink();
		System.out.println("popped : "+data);
		return data;
	}

	private void shrink() {
		int len = top + 1;
		if ( top << 2 >= capacity)
			return;
		System.out.println("Shrinking the stack");
		len = len<< 1;
		int[] newStack = new int[len];
		System.arraycopy(stack, 0, newStack, 0, len);
		stack = newStack;
		this.capacity = len;//capacity>>1
	}

	@Override
	public String toString() {
		String res = "[";
		for (int i = 0; i <= top; i++) {
			res += stack[i] + ",";
		}
		return res + "]";
	}

	public static void main(String[] args) throws Exception {
		DynamicArrayStack stack = new DynamicArrayStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		stack.push(1);
		stack.push(1);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack);
	}
}
