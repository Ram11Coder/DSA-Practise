package stack;

/**
 * 
 * Linkedlist based Stack implementation
 *
 */

class ListNode<T> {
	private T data;
	private ListNode<T> next;

	public ListNode(T data) {
		this.data = data;
		this.next = null;

	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ListNode<T> getNext() {
		return next;
	}

	public void setNext(ListNode<T> next) {
		this.next = next;
	}

}

public class LinkListImplementationOfStack<T> {
	private int length;
	private ListNode<T> top;

	public LinkListImplementationOfStack() {
		length = 0;
		top = null;
	}

	public int getSize() {
		return length;
	}

	public void push(T data) {
		ListNode<T> temp = new ListNode<T>(data);
		temp.setNext(top);
		System.out.println("Pushed : " + data);
		top = temp;
		length++;
	}

	public T pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("StackunderFlow!!");
		}
		T data = top.getData();
		top = top.getNext();
		length--;
		return data;
	}

	private boolean isEmpty() {
		return top == null;
	}

	@Override
	public String toString() {
		String res = "";
		ListNode<T> temp = top;
		while (temp != null) {
			res += "[" + temp.getData() + ((temp.getNext() == null) ? "]" : "] -> ");
			temp = temp.getNext();
		}
		return res;
	}

	public static void main(String[] args) throws Exception {
		LinkListImplementationOfStack<Integer> stackLL = new LinkListImplementationOfStack<Integer>();
		stackLL.push(1);
		stackLL.push(2);
		stackLL.push(3);
		stackLL.push(6);
		System.out.println("Popped : " + stackLL.pop());
		System.out.println("Popped : " + stackLL.pop());
		stackLL.push(3);
		stackLL.push(4);

		System.out.println("Printing Linkedlist");
		System.out.println(stackLL);

	}
}
