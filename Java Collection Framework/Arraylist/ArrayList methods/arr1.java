import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class arr1 {
    public static void main(String[] args) {
        List<String> f = new LinkedList<>();
        List<String> veg = new ArrayList<>();

        f.add("Apple");
        f.add("Orange");
        f.add("Hi");

        veg.add("Palak");
        veg.add("aloo");
        veg.add("methi");

        // veg.addAll(f);
        // System.out.println(f);
        // System.out.println(veg);

        System.out.println(f.get(2));
        // f.set(2, "Banana");
        // System.out.println(f);

        // f.remove(2);
        // System.out.println(f);

        // f.clear();
        // System.out.println(f);

        // List<String> toRemove = new ArrayList<>();
        // toRemove.add("Apple");
        // toRemove.add("Hii");
        // f.removeAll(toRemove);

        System.out.println(f.size());
        // System.out.println(f.contains("Apple"));
        // System.out.println(f.isEmpty());

        // String temp[] = new String[f.size()];
        // f.toArray(temp);
        // for (String e : temp) {
        // System.out.println(e);
        // }

    }
}
