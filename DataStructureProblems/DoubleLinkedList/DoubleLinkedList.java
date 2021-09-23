package DoubleLinkedList;

public class DoubleLinkedList {
	Node<Employee> head;

	public DoubleLinkedList() {
		this.head = null;
	}

	void addNode(Employee emp) {
		Node<Employee> tempNode = new Node<Employee>(emp);

		if (head == null) {
			head = tempNode;
		} else {
			Node<Employee> current = head;
			while (current.next != null) {
				current = current.next;
			}
			tempNode.prev = current;
			current.next = tempNode;
		}
	}

	void display() {
		Node<Employee> current = head;
		while (current != null) {
			System.out.println(current);
			current = current.next;
		}
	}

	void addNodeByReplacing(Employee oldEmp, Employee newEmp) {
		Node<Employee> tempNode = new Node<Employee>(newEmp);

		Node<Employee> current = head;

		if (current.getValue().equals(oldEmp)) {
			head = tempNode;
			head.next = current.next;

		} else {
			while (!current.getValue().equals(oldEmp)) {
				current = current.next;
			}
			current.prev.next = tempNode;

			tempNode.prev = current.prev;
			tempNode.next = current.next;

		}
	}

}
