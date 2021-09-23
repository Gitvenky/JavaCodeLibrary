package stack;

public class App {

	public static void main(String[] args) {
		Stack<String> basicStack = new Stack<>(100);
		try {
			basicStack.push("000");
			basicStack.push("001");
			basicStack.push("002");
			basicStack.push("003");
			// printing the stack
			System.out.println("*********************");
			basicStack.printStack();
			System.out.println();

			System.out.println("*********************");

			System.out.println("after popping the first element."); // popping the stack

			basicStack.pop();
			basicStack.pop();

			// printing the stack System.out.print("contents of Stack are : ");
			basicStack.printStack();
			String matchingItem = "000";
			System.out.println();
			System.out.println(matchingItem + " present inside of Stack! " + basicStack.contains(matchingItem));

			String accessItem = "001";
			System.out.println("Accessing the element " + accessItem);
			basicStack.access(accessItem);
			System.out.println("Size of the stack is " + basicStack.size());

			System.out.println();
			System.out.println("Contents of the Stack are");
			basicStack.printStack();

			int a = 4;
			int b = 0;
			int c = (a / b);

		} catch (Exception e) {
			// e.printStackTrace();
		}

	}
}
