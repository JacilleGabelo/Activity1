package Activity1;

import java.util.Scanner;

public class DPS {

 public static void main(String[] args) {  
        String string1 = "Java Programing";  
        int count;  
          
        //Converts given string into character array  
        char strArr[] = string1.toCharArray();  
          
        System.out.println("Duplicate characters: Java Programing ");  
        //Counts each character present in the string  
        for(int i = 0; i <strArr.length; i++) {  
            count = 1;  
            for(int j = i+1; j <strArr.length; j++) {  
                if(strArr[i] == strArr[j] && strArr[i] != ' ') {  
                    count++;
                    
                    //Set string[j] to 0 to avoid printing visited character  
                     strArr[j] = '0'; 
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && strArr[i] != '0')  
                System.out.println(strArr[i]+"\t"+(count-1)+"  ");
        }  
    }  
}