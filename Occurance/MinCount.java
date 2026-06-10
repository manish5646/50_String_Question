public class MinCount {
  
    public static void main(String[] args) {

        String s = "aaabbcd";

        char minchar = ' ';
        int mincount = s.length();

        while (s.length() > 0) {

            char ch = s.charAt(0);

            String s1 = s.replace(ch + "", "");

            int count = s.length() - s1.length();

            if (count < mincount) {
                mincount = count;
                minchar = ch;
            }

            s = s1;
        }

        System.out.println("Minimum Character = " + minchar);
        System.out.println("Minimum Count = " + mincount);
    }
}

