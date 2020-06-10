package Day19;

public class Task2 {
        public static void main(String[] args) {

            String str = "123abZ$123";
            System.out.println("length ---> " + str.length());
            System.out.println("letter count ---> " + letterCount(str));

            System.out.println("****************************");

            char a = '$';
            System.out.println(checkDigit(a));

            System.out.println("*****************************");

            String str1 = "123a54";
            System.out.println(countDigit(str1));

            System.out.println("****************************");

            String password="2faas$dkfj1halk#f6jaajf";
            System.out.println(checkpass(password));


        }
        // create a method which counts letters in given string

        public static int letterCount(String text) {
            int count = 0;

////        text=text.toLowerCase(); // second option

            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                    count += 1;
                }
                if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                    count += 1;
                } else {
                    count += 0;
                }

            }
            return count;
        }

        // create a method which checks if character is digit
        public static boolean checkDigit(char character) {
            boolean result = false;
            if (character >= '0' && character <= '9') {
                result = true;
            }
            return result;
        }
        // create a method which counts digits in given string

        public static int countDigit(String text) {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
                    count += 1;
                } else {
                    count += 0;
                }
            }
            return count;
        }

//    Write a Java method to check whether a string is a valid password.
//    Password rules:
//    A password must have at least ten characters.
//    A password consists of only letters and digits.
//    A password must contain at least two digits.

        public static boolean checkpass(String text) {
            boolean status;
            int countNumber = 0;
            int counLetter = 0;

            text=text.toLowerCase();
            for (int i = 0; i < text.length() ; i++) {
                if (text.charAt(i)>='0' && text.charAt(i)<='9'){
                    countNumber+=1;
                } else if (text.charAt(i)>='a' && text.charAt(i)<='z'){
                    counLetter+=1;
                }
            }
            if (counLetter+countNumber!=text.length()){
                status=false;
            }
            else if (text.length()<10){
                status=false;
            }
            else if (countNumber<2){
                status=false;
            }
            else {status=true;}

            return status;
        }
    }