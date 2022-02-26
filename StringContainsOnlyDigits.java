package Activity1;

import java.util.Scanner;

public class StringContainsOnlyDigits {

    public static void main(String[] args){
    
    //Input : 12345
    //Output: It should be string only contains digit only
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        Boolean result = false;
        
        for (int i = 0; i < input.length(); i++) {
  
            if (input.charAt(i) >= '0'
                && input.charAt(i) <= '9') {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        if(result){
            System.out.println("String contains digit only");
        } else {
            System.out.println("String does not contains digit only");   
        }
    }
}

