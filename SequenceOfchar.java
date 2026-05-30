public class SequenceOfChar_03 {
    public static void main(String[] args) {

        String s = "Ram@123#M";

        String res = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                res += ch;

            else if (ch >= 'a' && ch <= 'z')
                res += ch;

            else if (ch >= '0' && ch <= '9')
                res += ch;

            else
                res += ch;
        }

        System.out.println(res);
    }
}
