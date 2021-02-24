public class ManualImplementation<E> {
    Node<E> head;

    // Add Method
    public void add(E data) {
        Node<E> toAdd = new Node<>(data);
        if (isEmpty()) {
            head = toAdd;
            return;
        }
        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    // Print Method
    public void print() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // get function
    public void get(int index) {
        int count = 0;
        Node<E> temp = head;
        while (temp != null) {
            if (count == index) {
                System.out.println(temp.data);
            }
            temp = temp.next;
            count++;
        }
    }

    // set
    public void set(int index, int data) {
        int count = 0;
        Node<E> temp = head;
        while (temp != null) {
            if (count == index) {
                temp.data = data;
            }
            temp = temp.next;
            count++;
        }
    }

    // remove
    public void remove(int index) {
        int count = 0;
        Node<E> temp = head;
        while (temp != null) {
            if (count == index) {
                ;
            }
            temp = temp.next;
            count++;
        }
    }

    public E removeLast() throws Exception{
        Node<E> temp = head;
        if(temp==null){
            throw new Exception("Cannot remove last element from empty stack");
        }
        //if list has 1 element
        if(temp.next==null){
            Node<E> toRemove =head;
            head=null;
            return (E) toRemove.data;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node<E> toRemove = temp.next;
        temp.next = null;
        return (E) toRemove.data;
    }
    public E getLast()throws Exception{
        Node<E> temp = head;
        if(temp==null){
            throw new Exception("Cannot peek last element from empty stack");
        }
        while (tenmp.next != null) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    // To check whether the linked list is empty or not
    public boolean isEmpty() {
        // if(head==null){
        // return true;
        // }
        // else{
        // return false;
        // }

        return head == null;
    }

    // node class
    static class Node<E> {
        int data;
        Node<E> next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
