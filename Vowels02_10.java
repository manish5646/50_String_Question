

public class Vowels02_10 {
    public static void main(String[] args) {
        String s = "Ramana";
        int vowelcount = 0;

        char[] ch = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelcount++;
            }
        }

        if (vowelcount >= 3) {
            for (int i = 0; i < ch.length; i++) {
                char c = Character.toLowerCase(ch[i]);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    ch[i] = '_';
                }
            }

            System.out.println(ch);
        }
    }
}
