package DoubleLinkedList;

public class DoubleLinkedListTest {
	public static void main(String[] args) {
		DoubleLinkedList dList = new DoubleLinkedList();
		dList.addNode(new Employee(1, "a"));
		dList.addNode(new Employee(2, "b"));
		dList.addNode(new Employee(3, "c"));
		dList.addNode(new Employee(4, "d"));
		dList.addNode(new Employee(5, "e"));
		dList.addNode(new Employee(6, "f"));
		dList.display();

		dList.addNodeByReplacing(new Employee(1, "a"), new Employee(0, "O"));
		System.out.println("----After Replacing :----");
		dList.display();

	}
}
