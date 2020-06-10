package CodeWars;

public class DuplicateEncoder {
    /*
    The goal of this exercise is to convert a string to a new string where each character in the new string
    is "(" if that character appears only once in the original string, or ")" if that character appears more
    than once in the original string. Ignore capitalization when determining if a character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("
Notes

Assertion messages may be unclear about what they display in some languages. If you read "...It
 Should encode XXX", the "XXX" is the expected result, not the input!
     */
    public static void main(String[] args) {
        System.out.println(encode("din"));
    }
    static String encode(String word){
        String lowerWord = word.toLowerCase();
        return lowerWord.chars().mapToObj(letter -> lowerWord.chars().filter(l -> l == letter).count() == 1 ? '(' : ')')
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        }
    }
