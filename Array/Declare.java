public class Declare {
    public static void main(String[] args) {
        // int[] marks=new int[5];
        // int[] marks;
        // marks = new int[5];
        // int marks[]=new int[5];
        // int rollNos[],classes;// here rollNos is array and classes is variable
        // int[] rollNos,classes;// here both are array

        int[] age = { 2, 5, 1, 24, 12 };
        // double[] percentage = { 2.4, 23.5, 5.8 };
        // System.out.println(age[0]);
        // System.out.println(percentage[1]);
        // percentage[1] = 5.98;
        // System.out.println(percentage[1]);

        // Fetching

        // System.out.println(age[0]);
        // System.out.println(age[1]);
        // System.out.println(age[2]);
        // System.out.println(age[3]);
        // System.out.println(age[4]);

        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
    }

}
