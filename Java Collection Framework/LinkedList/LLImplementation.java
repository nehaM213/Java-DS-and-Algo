import java.util.LinkedList;
import java.util.List;

public class LLImplementation {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(2);
        ll.add(32);
        ll.add(100);
        ll.add(101);
        System.out.println(ll);

        List<String> ll2 = new LinkedList<>();
        ll2.add("100");
        ll2.add("101");

        // System.out.println(ll2);

        // ll.addAll(ll2);
        // System.out.println(ll);

        System.out.println(ll.get(5));
        // ll.set(1, 56);
        // System.out.println(ll);

        // ll.remove(1);
        // System.out.println(ll);

        // ll.removeAll(ll2);
        // System.out.println(ll);

        // ll.clear();
        // System.out.println(ll.size());

        // System.out.println(ll.contains(100));

        // System.out.println(ll.isEmpty());

        // String arr[] = new String[ll2.size()];
        // ll2.toArray(arr);
        // for (String e : arr) {
        // System.out.println(e);
        // }

    }

}
