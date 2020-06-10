package Day19;

public class Task4 {
    // create method that calculate sum of array
    public static int sum(int[] array) {
        int result = 0;
        for (int number : array) {
            result += number;
        }
        return result;
    }
//create method that calculate average of numbers in int array
public static double avarage(int[]array) {
    int sum = sum(array);
    int count = array.length;
    return (double)sum / count;
}
}
