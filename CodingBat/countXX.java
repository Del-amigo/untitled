package CodingBat;

public class countXX {
    /*
    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
     */
    public static void main(String[] args) {
        System.out.println( countXX( "abcxx" ) );
        System.out.println( countXX( "xxx" ) );
        System.out.println( countXX( "xxxx" ) );
    }

    static int countXX(String str) {
        int counter = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 'x' && arr[i + 1] == 'x')
                counter++;
        }
        return counter;
    }
}
