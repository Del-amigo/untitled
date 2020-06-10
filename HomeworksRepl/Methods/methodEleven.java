package HomeworksRepl.Methods;

import javax.print.DocFlavor;

public class methodEleven {
    /*
    Create one method name is  addDigits
Taking int as a parameter.
 Return type is also int

Given a positive integer num, repeatedly add all its digits until the result has only one digit.
Example:
Input: 38
Output: 2
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
             Since 2 has only one digit, return it.
     */
    public static void main(String[] args) {
        System.out.println(addDigits(37));
    }

    public static int addDigits(int nums) {

        int sum = 0;

        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (nums > 0 || sum > 9)
        {
            if (nums == 0) {
                nums = sum;
                sum = 0;
            }
            sum += nums % 10;
            nums /= 10;
        }
        return sum;
    }
}
