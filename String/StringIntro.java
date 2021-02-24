public class StringIntro {
    public static void main(String[] args) {
        String name = "Anuj";
        String name2 = "Anuj";
        String anotherName = new String("Anuj");
        System.out.println(name == anotherName);
        System.out.println(name == name2);
        name2 = "neha";
    }

}
