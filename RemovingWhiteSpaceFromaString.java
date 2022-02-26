package Activity1;

import java.util.Scanner;

public class RemovingWhiteSpaceFromaString {

    public static void main(String[] args){
    
    //Input : Hello World
    //Output: HelloWorld
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        
        String input = scanner.nextLine();
        input = input.replaceAll("\\s", "");
        
        System.out.println(input);
    }
}
