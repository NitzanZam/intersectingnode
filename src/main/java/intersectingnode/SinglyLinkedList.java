package intersectingnode;

import java.util.Iterator;
import java.util.LinkedList;

public class SinglyLinkedList {
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	protected void build(LinkedList<Node> list){
		Iterator<Node> i = list.iterator();
		head = i.next();
		Node tmp = head;
		while (i.hasNext()) {
			tmp.setNext(i.next());
			tmp = tmp.getNext();
		}

	}

}
