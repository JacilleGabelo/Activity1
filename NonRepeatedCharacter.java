package Activity1;

import java.util.Scanner;

public class NonRepeatedCharacter {

  public static void main(String[] args) {  

Scanner sc = new Scanner(System.in);
  System.out.println("Jacille Gabelo ");
   String str1 = sc.nextLine();
   
   System.out.println(" String remove White Space = " + str1);
   
   String str2 = str1. replaceAll("\\s", "");
   System.out.println( "Final String without white space=" + str2);
   

  }

}
 