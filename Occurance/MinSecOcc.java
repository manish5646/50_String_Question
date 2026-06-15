// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class MinSecOcc {
   public MinSecOcc() {
   }

   public static void main(String[] var0) {
      String var1 = "aabbcccddeeeeeee";
      char var2 = ' ';
      char var3 = ' ';
      int var4 = var1.length();

      int var5;
      String var7;
      for(var5 = var1.length(); var1.length() > 0; var1 = var7) {
         char var6 = var1.charAt(0);
         var7 = var1.replace("" + var6, "");
         int var8 = var1.length() - var7.length();
         if (var8 < var4) {
            var5 = var4;
            var3 = var2;
            var4 = var8;
            var2 = var6;
         } else if (var8 < var5 && var8 != var4) {
            var5 = var8;
            var3 = var6;
         }
      }

      System.out.println("Min Occurring Character: " + var2 + " = " + var4);
      System.out.println("Second Min Occurring Character: " + var3 + " = " + var5);
   }
}
