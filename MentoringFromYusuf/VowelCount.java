package MentoringFromYusuf;

import java.util.Random;
public class VowelCount {
   /* Create a method that checks every letter if they are vowel
    or not and tells the number of vowels in a String*/
    public static void main(String[] args) {
        System.out.println(vowelCount("I love my mentor"));
    }
    public static int vowelCount(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'u' || str.charAt(i) == 'o') {
                count++;
            }
        }
        return count;
    }
/*    Create a method which has 2 String parameters and counts the vowels inside them
    return true if they have same amount of vowels, if not false*/
    public static boolean sameAmountCheck(String a , String b){
        return vowelCount(a)==vowelCount(b); // return true;
    }
    /*Write a method which mixes up the letters of a given String
    return type and parameters will be String*/
    public static String mixUpLetters(String str){
        char array[] = str.toCharArray();
        char newArray[]= new char[str.length()];
        Random rand = new Random();
        String x = "";
        for(int i = 0; i <str.length() ; i++) {
            int randomNumber = rand.nextInt(str.length());
            String randomNumberString = String.valueOf(randomNumber);

            if(!x.contains(randomNumberString)){
                newArray[randomNumber] = array[i];
                x+=randomNumber;
            }else{
                randomNumber=rand.nextInt(str.length());
                i--;
            }
        }
        String mixUp = new String(newArray);
        return mixUp;

    }
}
