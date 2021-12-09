package linkedList;

//Circular Linked list
class CLLNode {
	private int data;
	private CLLNode next;

	public CLLNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public CLLNode getNext() {
		return next;
	}

	public void setNext(CLLNode next) {
		this.next = next;
	}
}

public class CLL {
	private int count;
	private CLLNode head;

	public CLL() {
		count = 0;
	}

	public boolean isEmepty() {
		return head == null;
	}

	@Override
	public String toString() {
		String s = "";
		if (isEmepty())
			return "[]";
		CLLNode temp = head;
		s += "[" + temp.getData() + "] ";
		temp = temp.getNext();
		while (temp != head) {
			s += "[" + temp.getData() + "] ";
			temp = temp.getNext();
		}

		return s;
	}

	public void insertAtFirst(CLLNode newnode) {
		if (isEmepty()) {
			head = newnode;
			head.setNext(head);
		} else {
			newnode.setNext(head);
			CLLNode temp = head;
			while (temp.getNext() != head) {
				temp = temp.getNext();
			}
			temp.setNext(newnode);
			head = newnode;
		}
		count++;
	}

	public void insertAtEnd(CLLNode newnode) {

		if (isEmepty()) {
			head = newnode;
			head.setNext(head);
		} else {
			CLLNode temp = head.getNext();
			newnode.setNext(head);
			while (temp.getNext() != head) {
				temp = temp.getNext();
			}
			temp.setNext(newnode);
			head = newnode.getNext();
		}
		count++;
	}

	public void insertAtPosition(int pos, int data) {
		if (pos < 0)
			pos = 0;
		if (pos > count)
			pos = count;
		CLLNode newnode = new CLLNode(data);

		if (pos == 0) {
			insertAtFirst(newnode);
		} else {
			CLLNode temp = head;
			for (int i = 1; i < pos; i++) {
				temp = temp.getNext();
			}
			newnode.setNext(temp.getNext());
			temp.setNext(newnode);
		}
		count++;
	}

	public void deleteAtFirst() {

		if (isEmepty()) {
			return;
		}
		if (head.getNext() == head) {
			head = null;
		} else {
			CLLNode temp = head.getNext();

			while (temp.getNext() != head) {
				temp = temp.getNext();
			}
			temp.setNext(head.getNext());
			head = temp.getNext();
		}
		count--;
	}

	public void deleteAtEnd() {

		if (isEmepty()) {
			return;
		}
		if (head.getNext() == head) {
			head = null;
		} else {
			CLLNode p = head, q = null;

			while (p.getNext() != head) {
				q = p;
				p = q.getNext();
			}
			q.setNext(p.getNext());
			p = null;
		}
		count--;
	}

	public void deleteAtPosition(int pos) {
		if (pos < 0)
			pos = 0;
		if (pos >= count)
			pos = count - 1;

		if (pos == 0) {
			deleteAtFirst();
		} else {
			CLLNode temp = head;
			for (int i = 1; i < pos; i++) {
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
		}
		count--;
	}

	public int count() {
		return count;
	}

	public CLLNode getHead() {
		return head;
	}

	public static void main(String[] args) {
		CLL list = new CLL();

		CLLNode node = new CLLNode(10);
		list.insertAtFirst(node);

		node = new CLLNode(20);
		list.insertAtFirst(node);
		node = new CLLNode(30);
		list.insertAtFirst(node);
		node = new CLLNode(40);
		list.insertAtFirst(node);
		System.out.println(list);
		node = new CLLNode(50);
		list.insertAtEnd(node);
		System.out.println(list);
		list.insertAtPosition(1, 11);
		System.out.println(list);
		list.deleteAtFirst();
		System.out.println(list);
		list.deleteAtEnd();
		System.out.println(list);
		list.deleteAtPosition(1);
		System.out.println(list);
		list.deleteAtPosition(1);
		System.out.println(list);
		list.deleteAtPosition(1);
		System.out.println(list);
		list.deleteAtPosition(1);
		System.out.println(list);
	}
}
