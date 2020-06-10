package CodeWars;

public class isogram {
    public static void main(String[] args) {
/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function
 that determines whether a string that contains only letters is an isogram. Assume the empty string is
 an isogram. Ignore letter case.

isIsogram "Dermatoglyphics" == true
isIsogram "aba" == false
isIsogram "moOse" == false -- ignore letter case
 */
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("aba"));
        System.out.println(isIsogram("moOse"));

    }
    public static boolean isIsogram(String str) {
        // ...
        String string = str.toLowerCase();
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            if(counter>=2){
                return false;
            }
        }
        return true;
    }
}