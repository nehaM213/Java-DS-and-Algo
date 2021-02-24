import java.util.ArrayList;
import java.util.List;

public class Arr1 {
    public static void main(String[] args) {
        Arr2<Integer, String> a=new Arr2<>(12,"Neha");
        Arr2<String, String> a2=new Arr2<>("Mohit","Saini");
        a.getDescription();
        a2.getDescription();
        
    }
}