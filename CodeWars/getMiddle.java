package CodeWars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class getMiddle {
    /*
    You are going to be given a word. Your job is to return the middle character of the word. If the word's length
     is odd, return the middle character. If the word's length is even, return the middle 2 characters.

#Examples:

Kata.getMiddle("test") should return "es"
Kata.getMiddle("testing") should return "t"
Kata.getMiddle("middle") should return "dd"
Kata.getMiddle("A") should return "A"
#Input

A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases
due to an error in the test cases). You do not need to test for this. This is only here to tell you that you do not need to worry about your solution timing out.

#Output
The middle character(s) of the word represented as a string.
     */
        @Test
        public void evenTests() {
            assertEquals("es", getMiddle.getMiddle("test"));
            assertEquals("dd", getMiddle.getMiddle("middle"));
        }

        @Test
        public void oddTests() {
            assertEquals( "t", getMiddle.getMiddle( "testing" ) );
            assertEquals( "A", getMiddle.getMiddle( "A" ) );
        }
    public static String getMiddle(String word) {
        int length = word.length();
        int half = length/2;
        if (length % 2 == 0) {
            return word.substring(half - 1, half + 1);
        } else {
          return word.substring(half, half + 1);
        }
    }

    public static void main(String[] args) {
        String test = "testing";
        System.out.println(test.substring( 3,test.length()-3 ));
    }
}
