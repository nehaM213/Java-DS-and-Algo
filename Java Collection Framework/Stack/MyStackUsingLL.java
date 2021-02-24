public class MyStackUsingLL<E> {
    private ManualImplementation<E> ll = new ManualImplementation<>();

    void push(E e) {
        ll.add(e);
    }

    E pop() throws Exception {
        if (ll.isEmpty()) {
            throw new Exception("Popping from empty stack");
            return null;
        }
        ll.removeLast();
    }

    E peek() throws Exception {
        if (ll.isEmpty()) {
            throw new Exception("Popping from empty stack");
            return null;
        }
        return ll.getLast();
    }
}
