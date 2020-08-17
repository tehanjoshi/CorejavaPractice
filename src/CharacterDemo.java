


import java.lang.*;

public class CharacterDemo {

   public static void main(String[] args) {

      // create 2 character primitives ch1, ch2
      char ch1, ch2;

      // assign values to ch1, ch2
      ch1 = '@';
      ch2 = '$';

      // create 2 int primitives i1, i2
      int i1, i2;

      // assign getType values of ch1, ch2 to i1, i2
      i1 = Character.getType(ch1);
      i2 = Character.getType(ch2);
      
      

      /**
       *  value 1 represents UPPERCASE_LETTER
       *  value 26 represents CURRENCY_SYMBOL
       */

      String str1 = "Category of " + ch1 + " is " + i1;
      String str2 = "Category of " + ch2 + " is " + i2;

      // print i1, i2 values
      System.out.println( str1 );
      System.out.println( str2 );
   }
}