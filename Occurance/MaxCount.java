public class MaxCount {
    public static void main(String[] args) {

        String s = "aaabbcd";

        char maxchar = ' ';
        int maxcount = 0;

        while (s.length() > 0) {

            char ch = s.charAt(0);

            String s1 = s.replace(ch + "", "");

            int count = s.length() - s1.length();

            if (count > maxcount) {
                maxcount = count;
                maxchar = ch;
            }

            s = s1;
        }

        System.out.println("Maximum Character = " + maxchar);
        System.out.println("Maximum Count = " + maxcount);
    }
}
