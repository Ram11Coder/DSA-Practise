package linkedList;

class LLNode {
	private int data;
	private LLNode next;

	public LLNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LLNode getNext() {
		return next;
	}

	public void setNext(LLNode next) {
		this.next = next;
	}

}

public class SLL {
	private int count;

	public SLL() {
		count = 0;
	}

	LLNode head;

	public void insertAtFirst(LLNode newnode) {

		newnode.setNext(head);
		head = newnode;
		count++;
	}

	public void insertAtEnd(LLNode newnode) {
		if (head == null) {
			return;
		}
		if (head.getNext() == null)
			head = newnode;
		else {
			LLNode p = head;
			for (p = p.getNext(); p.getNext() != null; p = p.getNext())
				;
			p.setNext(newnode);
		}
		count++;
	}

	public void insertPosition(int pos, int data) {

		if (pos < 0) {
			pos = 0;
		}
		if (pos > count) {
			pos = count;
		}
		if (head == null) {
			head = new LLNode(data);
		}
		if (pos == 0) {
			LLNode newnode = new LLNode(data);
			newnode.setNext(head);
			head = newnode;
		} else {
			LLNode newnode = new LLNode(data);
			LLNode temp = head;
			for (int i = 1; i < pos; i++) {
				temp = temp.getNext();
			}
			newnode.setNext(temp.getNext());
			temp.setNext(newnode);
		}
		count++;

	}

	public int count() {
		return count;
	}

	public void deleteAtFirst() {
		if (head == null) {
			return;
		}
		if (head.getNext() == null) {
			head = null;
		} else {
			LLNode temp = head;
			head = head.getNext();
			temp.setNext(null);
		}

		count--;
	}

	public void deleteAtEnd() {
		if (head == null) {
			return;
		}
		if (head.getNext() == null) {
			head = null;
		} else {
			LLNode temp = head;
			while (temp.getNext().getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(null);
		}

		count--;
	}

	public void delete(int pos) {
		if (head == null) {
			return;
		}
		if (pos < 0)
			pos = 0;
		if (pos > count)
			pos = count;
		if (pos == 0) {
			head = head.getNext();
		} else {
			LLNode p = head, q = null;
			for (int i = 1; i <= pos; i++) {

				q = p;
				p = q.getNext();
			}
			q.setNext(p.getNext());
			p = null;
		}
	}

	public void deleteElement(LLNode node) {
		if (head == null) {
			return;
		}
		if (head.equals(node)) {
			head = head.getNext();
			return;
		}
		LLNode p = head, q = null;
		while ((q = p.getNext()) != null) {
			if (node.equals(q)) {
				p.setNext(q.getNext());
				return;
			}
			p = q;
		}
		if (p.getData() == node.getData()) {
			deleteAtEnd();
		}
	}

	@Override
	public String toString() {
		String res = "";
		if (head == null) {
			return "[]";
		}
		LLNode temp = head;

		while (temp != null) {
			res += "[" + temp.getData() + "] ";
			temp = temp.getNext();
		}

		return res;
	}

	public void deleteAll() {
		head = null;
		count = 0;
	}

	public boolean recursiveSearch(LLNode node, int data) {
		if (node == null)
			return false;
		if (node.getData() == data)
			return true;
		return recursiveSearch(node.getNext(), data);
	}

	public boolean search(int data) {
		if (head == null) {
			return false;
		}
		LLNode temp = head;
		while (temp != null) {
			if (temp.getData() == data)
				return true;
			temp = temp.getNext();
		}

		return false;
	}

	public int getNth(int index) {
		if (index >= count || head == null)
			return -1;
		LLNode temp = head;
		for (int i = 0; i < index; i++)
			temp = temp.getNext();

		return temp.getData();
	}

	public int recursiveGetNth(LLNode node, int index) {
		if (index >= count || node == null)
			return -1;
		if (index == 0)
			return node.getData();

		return recursiveGetNth(node.getNext(), index - 1);
	}

	public int getNthnodeFromEnd(int index) {
		if (head == null || index > count)
			return -1;
		int pos = count - index;
		LLNode temp = head;
		for (int i = 0; i < pos; i++)
			temp = temp.getNext();

		return temp.getData();
	}

	static int c;

	public void recursiveGetNthnodeFromEnd(LLNode node, int index) {

		c = 0;
		if (node == null || index > count)
			return;
		// int i = 0;
		recursiveGetNthnodeFromEnd(node.getNext(), index);
		if (++c == index)
			System.out.println(node.getData());
	}

	public int findMiddleWithLength() {
		int mid = count / 2, i = 1;
		LLNode temp = head;
		while (i <= mid) {
			temp = temp.getNext();
			i++;
		}
		return temp.getData();
	}

	public int findMiddle() {
		LLNode p = head, q = head;
		while (q != null && q.getNext() != null) {
			p = p.getNext();
			q = q.getNext().getNext();
		}
		return p.getData();
	}

	public static void main(String[] args) {
		SLL list = new SLL();
		LLNode node = new LLNode(10);

		list.insertAtFirst(node);
		node = new LLNode(20);
		list.insertAtFirst(node);
		node = new LLNode(30);
		list.insertAtFirst(node);
		node = new LLNode(40);
		list.insertAtFirst(node);
		node = new LLNode(60);
		list.insertAtEnd(node);
		node = new LLNode(70);
		list.insertAtEnd(node);
		list.insertPosition(2, 11);
		list.insertPosition(3, 12);
		System.out.println(list);
		// list.deleteAtFirst();
		list.deleteAtEnd();
		list.deleteAtFirst();

		System.out.println(list);
		node = new LLNode(60);
		list.deleteElement(node);
		System.out.println(list);
		System.out.println(list.count());
		// list.deleteAll();
		// System.out.println(list.count());

		System.out.println(list.search(14));
		System.out.println(list.recursiveSearch(list.head, 20));
		System.out.println(list.recursiveSearch(list.head, 13));
		System.out.println(list);
		System.out.println();
//nth node
		System.out.println(list.getNth(0));
		System.out.println(list.getNth(3));
		System.out.println(list.getNth(4));
		// Recurive nth node

		System.out.println(list.recursiveGetNth(list.head, 2));
		System.out.println(list.recursiveGetNth(list.head, 0));
		System.out.println(list.recursiveGetNth(list.head, 4));
		System.out.println(list.recursiveGetNth(list.head, 3));
//Nth node from end
		System.out.println();
		System.out.println(list.getNthnodeFromEnd(1));
		System.out.println(list.getNthnodeFromEnd(4));
		System.out.println(list.getNthnodeFromEnd(5));
		System.out.println();
		// recursive approach
		list.recursiveGetNthnodeFromEnd(list.head, 1);
		list.recursiveGetNthnodeFromEnd(list.head, 4);
		list.recursiveGetNthnodeFromEnd(list.head, 5);
		System.out.println("Middle elements");
		System.out.println(list.findMiddle());
		System.out.println(list.findMiddleWithLength());
	}

}
