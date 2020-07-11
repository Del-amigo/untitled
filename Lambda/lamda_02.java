package Lambda;
import java.util.Arrays;

public class lamda_02 {
    public static void main(String[] args) {
        String[] arr = {"programer", "*****", "am", "I", "best", "Java"};
        Arrays.sort(arr, (String m, String n) -> Integer.compare(m.length(), n.length()));
        System.out.println( Arrays.toString(arr));

        // in this example how U can see we did sorting an arrays without looping and etc...
    }
}
