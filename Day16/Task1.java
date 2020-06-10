package Day16;

public class Task1 {
    // create integer array with size of 5
    // give some values
    // print sum of your array
    public static void main(String[] args) {
        int[] IntArrays = {20,30,40,50,60,70};
        int sum = 0;
        for (int i = 0; i < IntArrays.length; i++) {
            sum += IntArrays[i];
        }
        System.out.println(sum);
    }
}
