package HomeworksRepl.Methods;

public class methodTwelve {
    /*
    create a method name is powerOfThree
    parameter is one int
    return type is boolean
    Given an integer, write a function to determine if it is a power of three.
    Example 1:
    Input: 27
    Output: true

    Explanation: 3*3*3 =27
    result = true

    Example 2:
    Input: 0
    Output: false
    Example 3:
    Input: 9
    Output: true
    Explanation: 3*3 = 9
    result = true


    Example 4:
    Input: 45
    Output: false
    Explanation: 3*3*3*3 =81
    result = false

    45 is not power of 3
     */
    public static void main(String[] args) {
       System.out.println(powerOfThree(6));

    }

    public static boolean powerOfThree(int num) {
        return num > 0 && 1162261467 % num == 0;
    }
}

/*
An important piece of information can be deduced from the function signature


In particular, n is of type int. In Java, this means it is a 4 byte, signed integer [ref]. The maximum value of this data type is 2147483647. Three ways of calculating this value are

Google
System.out.println(Integer.MAX_VALUE);
MaxInt = \frac{ 2^{32} }{2} - 1
2
2
32

​
 −1 since we use 32 bits to represent the number, half of the range is used for negative numbers and 0 is part of the positive numbers
Knowing the limitation of n, we can now deduce that the maximum value of n that is also a power of three is 1162261467. We calculate this as:

3^{\lfloor{}\log_3{MaxInt}\rfloor{}} = 3^{\lfloor{}19.56\rfloor{}} = 3^{19} = 1162261467
3
⌊log
3
​
 MaxInt⌋
 =3
⌊19.56⌋
 =3
19
 =1162261467

Therefore, the possible values of n where we should return true are 3^03
0
 , 3^13
1
  ... 3^{19}3
19
 . Since 3 is a prime number, the only divisors of 3^{19}3
19
  are 3^03
0
 , 3^13
1
  ... 3^{19}3
19
 , therefore all we need to do is divide 3^{19}3
19
  by n. A remainder of 0 means n is a divisor of 3^{19}3
19
  and therefore a power of three.


Complexity Analysis

Time complexity : O(1)O(1). We are only doing one operation.

Space complexity : O(1)O(1). We are not using any additional memory.
 */