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

	public void build(LinkedList<Node> list){
		Iterator<Node> i = list.iterator();
		head = i.next();
		Node tmp = head;
		System.out.println(tmp.getData());
		while (i.hasNext()) {
			tmp.setNext(i.next());
			tmp = tmp.getNext();
			System.out.println(tmp.getData());
		}

	}

}
