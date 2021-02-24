public class ManualImplementation {
    Node head;

    // Add Method
    void add(int data) {
        Node toAdd = new Node(data);
        if (isEmpty()) {
            head = toAdd;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    // Print Method
    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // get function
    void get(int index) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (count == index) {
                System.out.println(temp.data);
            }
            temp = temp.next;
            count++;
        }
    }

    // set
    void set(int index, int data) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (count == index) {
                temp.data = data;
            }
            temp = temp.next;
            count++;
        }
    }

    // remove
    void remove(int index) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (count == index) {
                ;
            }
            temp = temp.next;
            count++;
        }
    }

    // To check whether the linked list is empty or not
    boolean isEmpty() {
        // if(head==null){
        // return true;
        // }
        // else{
        // return false;
        // }

        return head == null;
    }

    // node class
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
