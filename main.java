public static void main(String[] args) {
    // linked list stack
    LinkedStack<String> stackL = new LinkedStack<>(); // note - call implementation
    stackL.push("Apple");
    stackL.push("Banana");
    System.out.println(stackL.pop());
    System.out.println(stackL.pop());

    System.out.println("");

    ArrayStack<String> stackA = new ArrayStack<>(10); // note - call implementation
    stackA.push("Apple");
    stackA.push("Banana");
    System.out.println(stackA.pop());
    System.out.println(stackA.pop());

    System.out.println("");

    Stack<String> stack = StackFactory.createArray();
    stack.push("Apple");
    stack.push("Banana");
    System.out.println(stack.pop());
    System.out.println(stack.pop());
}
