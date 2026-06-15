public class MaxSecOcc {
    public static void main(String[] args) {
        String s1 = "aabbcccddeeeeeee";

        char maxchar1 = ' ';
        char maxchar2 = ' ';

        int max1 = 0;
        int max2 = 0;

        while (s1.length() > 0) {
            char ch = s1.charAt(0);

            String s2 = s1.replace(ch + "", "");

            int count = s1.length() - s2.length();

            if (count > max1) {
                max2 = max1;
                maxchar2 = maxchar1;

                max1 = count;
                maxchar1 = ch;
            }
            else if (count > max2 && count < max1) {
                max2 = count;
                maxchar2 = ch;
            }

            s1 = s2;
        }

        System.out.println("Max Occurring Character: " + maxchar1 + " = " + max1);
        System.out.println("Second Max Occurring Character: " + maxchar2 + " = " + max2);
    }
}
