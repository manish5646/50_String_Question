
public class NoOfAlphabets_05 {
    public static void main(String[] args) {

        String s = "AyvakA123Mar";

        int Alphacount = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z')) {

                Alphacount++;
            }
        }

        System.out.println("No of alphabets = " + Alphacount);
    }
}
