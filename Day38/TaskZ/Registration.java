package Day38.TaskZ;

import java.util.Scanner;

public class Registration {
    /*
Create class Registration,
a. Create method signUp, where user will provide a password(Scanner)
b. Create method checkPassword, where we will check password for validity
 */
    public void signUp(){
        System.out.println("Please, provide a password: ");

        Scanner scanner = new Scanner( System.in );
        String password = scanner.nextLine();

        checkPassword(password);

        System.out.println("Successful sigh up!");
    }

    private void checkPassword(String password) {
        // must not be -NULL-
        if(password == null){
            throw new NullPointerException("Your password myst not be null");
        }
        // must not be -empty-
        if (password.isEmpty()){
            throw new IllegalArgumentException("Your password must not be empty");
        }
       // must not contain any -spaces-
       if (password.trim().isEmpty()){
           throw new IllegalArgumentException("Your password must not contain only spaces");
       }
       //must contain at least 3 digits
        if (digitCount(password)<3){
            throw new IllegalArgumentException("Your password must contain at least 3 digits");
        }
        //must contain at least 3 letters
        if(letterCount( password )<3){
            throw new IllegalArgumentException("Your password must contain at least 3 letters");
        }
        // Must have a length at least 6letters
        if (password.length()<6){
            throw new RuntimeException("Your password must have at least 6 characters");
        }
    }
    // create a method which checks if character is digit or not
    public  boolean isDigit(char character){
        return character>='0' && character<='9';
    }
    // create a method which counts digits in given string
    public int digitCount (String str){
        int couter = 0;

        char[] chars = str.toCharArray();
        for (char aChar:chars){
            if (isDigit( aChar )){
                couter++;
            }
        }
        return couter;
    }
    //create a method which checks if character is letter
    public boolean isLetter(char character){
        character = Character.toLowerCase( character );
        return character>='a' && character<='z';
    }
    //create e method which counts letters in given String
    public int letterCount(String str){
        int counter = 0;

        char[] chars = str.toCharArray();
        for (char aChar:chars) {
            if (isLetter( aChar )){
                counter++;
            }
        }
        return counter;
    }
}
