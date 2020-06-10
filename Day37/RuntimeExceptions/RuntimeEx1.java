package Day37.RuntimeExceptions;

import java.util.Scanner;

public class RuntimeEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println("Provide first integer: ");
        int a = scan.nextInt();

        System.out.println("Provide second integer: ");
        int b = scan.nextInt();

        System.out.println(a/b);
        //Unexpexted or Unchecked comes at Runtime(exceptions which we R not waiting...)
    }
}
