package CodingBat;

public class lastDigit {
    /*

Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
 Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
     */
    public static void main(String[] args) {
    lastDigit lastDigit = new lastDigit();
        System.out.println(lastDigit.lastDigit(7,17));
        System.out.println(lastDigit.lastDigit(6,17));
        System.out.println(lastDigit.lastDigit(3,113));
    }

    public boolean lastDigit(int a, int b) {
    return a%10==b || b%10==a || a%100==b || b%100==a;
    }
}
