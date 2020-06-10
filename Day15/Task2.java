package Day15;
//part2: using nested loop, print multiplication table of 1,2,3,4,5,6,7,8,9,10
public class Task2 {
    public static void main(String[] args) {

        for(int num = 1; num <= 10; num++) {
        for(int i = 1; i <= 10; i++) {
            int result = num * i;

            System.out.println( num + " x " + i + " = " + result );

        }
        System.out.println();

    }
    }

}