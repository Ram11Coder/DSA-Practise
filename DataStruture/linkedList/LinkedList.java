package linkedList;

/**
 * @author thula
 *
 */
public class LinkedList {
	private static int count = 0;

	public LinkedList() {
		count = 0;
	}

	Node head;

	public Node getHead() {
		return head;
	}

	public void insertAtBegin(Node node) {
		node.setNext(head);
		head = node;
		count++;
	}

	public void insertAtEnd(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node p = head, q;
			while ((q = p.getNext()) != null) {
				p = q;
			}
			p.setNext(node);
		}
		count++;
	}

	public void insert(int data, int position) {
		if (position < 0)
			position = 0;
		if (position > count)
			position = count;

		if (head == null)
			head = new Node(data);

		if (position == 0) {
			Node newNode = new Node(data);
			newNode.setNext(head);
			head = newNode;
		} else {
			Node temp = head;
			Node newNode = new Node(data);
			for (int i = 1; i < position; i++) {
				temp = temp.getNext();
			}
			newNode.next = temp.next;
			temp.setNext(newNode);
		}
		count++;
	}

	public Node deieteAtFirst() {
		Node node = head;
		if (node != null) {
			head = node.next;
			node.setNext(null);
		}
		return node;
	}

	public Node removeAtEnd() {
		if (head == null)
			return head;
		Node p = head, q = null, next = head.getNext();
		if (next == null) {
			head = null;
			return p;
		}
		while ((next = p.getNext()) != null) {
			q = p;
			p = next;
		}
		q.setNext(null);
		return p;
	}

	public void removeMatchedElement(Node node) {
		if (head == null) {
			return;
		}
		if (node.equals(head)) {
			head = head.getNext();
			return;
		}
		Node p = head, q = null;
		while ((q = p.getNext()) != null) {
			if (node.equals(q)) {
				p.setNext(q.getNext());
				return;

			}
			p = q;
		}
	}

	public void remove(int position) {

		if (position < 0)
			position = 0;

		if (position >= count)
			position = count;
		if (head == null) {
			return;
		}
		if (position == 0) {
			head = head.getNext();
		} else {
			Node temp = head;
			for (int i = 1; i < position; i++) {
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
		}
		count--;
	}

	@Override
	public String toString() {
		String res = "[";
		if (head == null) {
			return res + "]";
		}
		res = res + head.getData();
		Node temp = head.getNext();
		while (temp!= null) {
			res = res + " , " + temp.getData();
			temp = temp.getNext();
		}
		return res + "]";
	}

	public int length() {
		return count;
	}

	public int getPosition(int data) {

		Node temp = head;
		int pos = 0;
		while (temp != null) {
			if (temp.getData() == data) {
				return pos;
			}
			pos++;
			temp = temp.getNext();
		}
		return Integer.MAX_VALUE;
	}

	public void clearList() {
		head = null;
		count = 0;
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		System.out.println(ll.getHead());
		ll.insert(4, 0);
		ll.insert(4, 1);
		ll.insert(4, 2);
		Node newnode = new Node(10);
		ll.insertAtBegin(newnode);
	//	ll.insertAtEnd(newnode);
		System.out.println(ll.length());
		System.out.println(ll.toString());
	}

}
