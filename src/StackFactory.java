public class StackFactory {
    public static <T> Stack<T> createArray() {
        // return new ArrayStack<>(1000);  // alternatively take as param and ignore for LinkedStack
        return new LinkedStack<>();
    }
}
