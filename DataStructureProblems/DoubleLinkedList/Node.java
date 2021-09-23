package DoubleLinkedList;

@SuppressWarnings("hiding")
public class Node<Employee> {
	Node<Employee> prev;
	Employee value;
	Node<Employee> next;

	public Employee getValue() {
		return value;
	}

	public Node(Employee value) {
		this.value = value;
		this.prev = null;
		this.next = null;
	}

	@Override
	public String toString() {
		return "" + value + "";
	}

}
