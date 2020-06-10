package Day19;

public class JavaMethodReturnType {
    public static void main(String[] args) {

        int sum = sumOfTwoNumbers(5, 5);
        double avg = sum / 2.0;

        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + avg);
    }

    public static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

}
