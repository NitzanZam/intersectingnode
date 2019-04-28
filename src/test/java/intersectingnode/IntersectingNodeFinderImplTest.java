package intersectingnode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class IntersectingNodeFinderImplTest {

		private IntersectingNodeFinder intersectingNodeFinder = new IntersectingNodeFinderImpl();
		private Node first = new Node(8, null);
		private Node second = new Node(4, null);


		@Test
		public void sameLengthList() {
				SinglyLinkedList singlyLinkedListA = getSinglyLinkedList(new int[]{3, 7});
				SinglyLinkedList singlyLinkedListB = getSinglyLinkedList(new int[]{99, 1});

				Node intersectingNode = intersectingNodeFinder.findIntersectingNode(singlyLinkedListA, singlyLinkedListB);
				Assert.assertEquals(first,intersectingNode);
		}

		@Test
		public void listAisShorter(){
				SinglyLinkedList singlyLinkedListA = getSinglyLinkedList(new int[]{3});
				SinglyLinkedList singlyLinkedListB = getSinglyLinkedList(new int[]{99, 1});

				Node intersectingNode = intersectingNodeFinder.findIntersectingNode(singlyLinkedListA, singlyLinkedListB);
				Assert.assertEquals(first,intersectingNode);
		}

		@Test
		public void listBisShorter(){
				SinglyLinkedList singlyLinkedListA = getSinglyLinkedList(new int[]{3, 7});
				SinglyLinkedList singlyLinkedListB = getSinglyLinkedList(new int[]{99});

				Node intersectingNode = intersectingNodeFinder.findIntersectingNode(singlyLinkedListA, singlyLinkedListB);
				Assert.assertEquals(first,intersectingNode);
		}

		@Test
		public void listsAreEquals(){
				SinglyLinkedList singlyLinkedListA = getSinglyLinkedList(new int[]{});
				SinglyLinkedList singlyLinkedListB = getSinglyLinkedList(new int[]{});

				Node intersectingNode = intersectingNodeFinder.findIntersectingNode(singlyLinkedListA, singlyLinkedListB);
				Assert.assertEquals(first,intersectingNode);
		}

		private SinglyLinkedList getSinglyLinkedList(int[] dataArr) {
				LinkedList<Node> listA = buildList(dataArr);
				SinglyLinkedList singlyLinkedListA = new SinglyLinkedList();
				singlyLinkedListA.build(listA);
				return singlyLinkedListA;
		}

		private LinkedList<Node> buildList(int[] dataArr) {
				LinkedList<Node> list = new LinkedList();
				for (int data : dataArr) {
						list.addLast(new Node(data, null));
				}
				list.addLast(first);
				list.addLast(second);
				return list;
		}


}
