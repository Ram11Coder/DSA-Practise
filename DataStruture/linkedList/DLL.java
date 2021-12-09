package linkedList;

//Doubly linked list

class DLLNode {
	private int data;
	private DLLNode prev;
	private DLLNode next;

	public DLLNode(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DLLNode getPrev() {
		return prev;
	}

	public void setPrev(DLLNode prev) {
		this.prev = prev;
	}

	public DLLNode getNext() {
		return next;
	}

	public void setNext(DLLNode next) {
		this.next = next;
	}

}

/**
 * Operations 1.Insertion -> Insert at first -> Insert at end -> Insert at
 * position 2.Deletion -> Delete at first -> Delete at end -> Delete at position
 * 3.Count Calculate node in the list 4.Print print the DLL 5.Delete all Remove
 * all elements in the LL
 * 
 *
 */
public class DLL {
	private int count = 0;
	private DLLNode head;

	public DLL() {
		count = 0;
	}

	public DLLNode getHead() {
		return head;
	}

	public int count() {
		return count;
	}

	@Override
	public String toString() {

		if (head == null)
			return "[]";
		String res = "";
		DLLNode temp = head;
		// res += "[" + temp.getData() + "] ";
		while (temp != null) {
			res += "[" + temp.getData() + "] ";
			temp = temp.getNext();
		}
		return res;
	}

	public void insertAtFirst(DLLNode node) {
		if (head == null) {
			head = node;
		} else {
			node.setNext(head);
			head.setPrev(node);
			head = node;
		}
		count++;
	}

	public void insertAtEnd(DLLNode newnode) {
		if (head == null) {
			head = newnode;
		}
		if (head.getNext() == null) {
			head.setNext(newnode);
			newnode.setPrev(head);
		} else {
			DLLNode temp = head;

			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newnode);
			newnode.setPrev(temp);
		}
		count++;
	}

	public void insertAtPosition(int pos, int data) {

		if (pos < 0) {
			pos = 0;
		}
		if (pos > count) {
			pos = count;
		}
		DLLNode newnode = new DLLNode(data);
		if (pos == 0) {

			newnode.setNext(head);
			head.setPrev(newnode);
			head = newnode;
		} else {
			DLLNode temp = head;
			for (int i = 1; i < pos; i++) {
				temp = temp.getNext();
			}
			newnode.setNext(temp.getNext());
			newnode.setPrev(temp);
			temp.getNext().setPrev(newnode);
			temp.setNext(newnode);
		}
		count++;
	}
	// 2.Deletion

	public void deleteAtFirst() {
		if (head == null) {
			return;
		}
		if (head.getNext() == null) {
			head = null;

		} else {
			head = head.getNext();
			head.setPrev(null);
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
			DLLNode p = head, q = null;
			while (p.getNext() != null) {
				q = p;
				p = q.getNext();
			}
			q.setNext(null);
			p.setPrev(null);
			p = null;
		}
		count--;
	}

	public void deleteAtPosition(int pos) {

		if (pos < 0) {
			pos = 0;
		}
		if (pos > count) {
			pos = count;
		}

		if (pos == 0) {
			deleteAtFirst();
		} else {
			DLLNode p = head, q = p.getNext();
			for (int i = 1; i < pos; i++) {
				p = q;
				q = p.getNext();
			}
			p.setNext(q.getNext());
			q.getNext().setPrev(p);
			q = null;
		}
		count--;
	}

	public static void main(String[] args) {
		DLL list = new DLL();
		// System.out.println(list.getHead());
		System.out.println(list);
		DLLNode node = new DLLNode(10);
		list.insertAtFirst(node);
		node = new DLLNode(20);
		list.insertAtFirst(node);
		node = new DLLNode(30);
		list.insertAtFirst(node);
		node = new DLLNode(40);
		list.insertAtFirst(node);
		node = new DLLNode(50);
		list.insertAtEnd(node);
		node = new DLLNode(70);
		list.insertAtEnd(node);

		node = new DLLNode(80);
		list.insertAtEnd(node);
		list.insertAtPosition(2, 35);
		System.out.println(list);
		list.deleteAtEnd();
		list.deleteAtFirst();
		list.deleteAtPosition(1);
		System.out.println(list);
		System.out.println(list.count());
	}
}
