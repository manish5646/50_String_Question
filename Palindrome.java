
public class Palindrome_07 {
  public static void main(String[]args){
     String s="madam";

      String rev="";

      for(int i=s.length()-1;i>=0;i--)
      {
          char ch=s.charAt(i);
          rev= rev+ch;
      }
      if(s.equals(rev)){
         System.out.println("palindrome");
      }
       else {
        System.out.println("not palindrome");

      }
      
    }
  }

