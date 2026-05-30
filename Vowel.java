//printing vowels
public class Vowels {
    public static void main(String[] args)
     {

        String s = "abcdef";

        for (int i = 0; i < s.length(); i++) 
        {

            char ch = s.charAt(i);

            // Fixed: Changed double quotes to single quotes

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch);
            }

        }

    } 
    // Fixed: Added missing closing brace for the main method
}


