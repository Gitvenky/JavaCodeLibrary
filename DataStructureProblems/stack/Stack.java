package stack;

public class Stack<X> {
	private X[] data;
	private int stackPointer;

	public Stack(int size) {
		data = (X[]) new Object[size];
		stackPointer = 0;
	}

	public void push(X item) throws Exception {
		if (stackPointer == data.length)
			throw new ArrayIndexOutOfBoundsException("the array sixe is full, can't add any more items!");

		data[stackPointer++] = item;
	}

	public X pop() throws Exception {
		if (stackPointer == 0)
			throw new IllegalStateException("No items to pop!");
		X itemToPop = data[--stackPointer];
		return itemToPop;

	}

	public boolean contains(X matchingItem) {
		for (X x : data) {
			if (x == matchingItem)
				return true;
			return false;
		}
		return false;

	}

	public void printStack() {
		for (int i = 0; i <= stackPointer - 1; i++) {
			System.out.print(data[i] + " ");
		}
	}

	public X access(X matchingItem) throws Exception {
		while (stackPointer > 0) {
			X item = this.pop();
			if (item == matchingItem) {
				return item;
			}
		}
		throw new IllegalArgumentException("Item Not Found!! " + matchingItem);
	}

	public int size() {
		return this.stackPointer;

	}
}