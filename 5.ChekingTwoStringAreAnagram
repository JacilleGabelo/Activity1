package Activity1;

import java.util.Arrays;

public class twostringareanagram {

     public static void main(String[] args) throws Exception {
       String str1="Brag";
       String str2="Grab";
       
       str1=str1.toLowerCase(); //Brag
       str2=str2.toLowerCase(); //Grab

       if(str1.length() !=str2.length()) {
         System.out.println("Not Anagram");
       }
       else {
         char[] string1=str1.toCharArray();
         char[] string2=str2.toCharArray();
         
         Arrays.sort(string1); // a b g r
         Arrays.sort(string2); // a b g r

         if(Arrays.equals(string1, string2)==true){
           System.out.println("Both Are Anagram");
         }
         else{
           System.out.println("Not Anagram");
         }
       }
     }

}
