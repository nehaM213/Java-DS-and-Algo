public class Anagram {

    public static void main(String[] args) {
        String a = "abc";
        String b = "cad";
        boolean visited[] = new boolean[b.length()];
        boolean isAnagram = false;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                for (int j = 0; j < b.length(); j++) {
                    if (b.charAt(j) == c && !visited[j]) {
                        visited[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if (!isAnagram) {
                    break;
                }
            }
        }
        if (isAnagram) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
