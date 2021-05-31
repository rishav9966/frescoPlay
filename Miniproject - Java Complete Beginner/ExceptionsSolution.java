import java.util.Scanner;
import java.lang.*;
import java.util.*;

class InvalidMessageException extends Exception{
    public InvalidMessageException(String s){
        super(s);
    }
    public String toString(){ 
        return ("InvalidMessageException: Try again with valid message") ;
   }
}

class ExceptionsSolution{
    public static String encryptMessage(String name){
        boolean validated=false;
        try{
            validated = Validator.validate(name);
            if(validated){
                StringBuilder input = new StringBuilder();
                input.append(name);
                input.reverse();
                name = new String(input);
                name = name.toLowerCase();
                return name;
            }
            throw new InvalidMessageException("Try again with valid message");
        }catch(InvalidMessageException e){
            System.out.print(e.toString());
            return e.toString();
        }
    }
}

class Validator {
    public static boolean validate(String message) {
        return message.matches("[A-Za-z0-9 ]+");
    }
}

public class Solution {
    private static final Scanner INPUT_READER = new Scanner(System.in);
    
    public static void main(String[] args) {
        String message = INPUT_READER.nextLine();
        
        try {
            String encrypted_message = ExceptionsSolution.encryptMessage(message);
            if(! encrypted_message.startsWith("InvalidMessageException"))
                System.out.println(encrypted_message);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
