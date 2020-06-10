package CodingBat;

public class intMax {
    /*
    Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
     */
    public static void main(String[] args) {
        System.out.println(intMax(3,4,1));
        System.out.println(intMax(2,5,9));
    }
    public static int intMax(int a, int b, int c) {
    int num = Math.max(a,b);
        return Math.max(num,c);
    }
}
