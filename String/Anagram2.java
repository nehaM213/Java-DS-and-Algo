public class Anagram2 {
    public static void main(String[] args) {
        String a = "8998090&900##%$*";
        String b = "8998090&900##%$*";
        int al[] = new int[256];
        int bl[] = new int[256];
        boolean isAnagram = true;
        for (char c : b.toCharArray()) {
            int index = (int) c;
            bl[index]++;
        }
        for (char c : a.toCharArray()) {
            int index = (int) c;
            al[index]++;
        }

        for (int i = 0; i < 256; i++) {
            if (al[i] != bl[i]) {
                isAnagram = false;
            }
        }
        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }

    }
}
