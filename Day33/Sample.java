package Day33;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        int size = args.length;
        int[] arr = new int[args.length];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt( args[i] );
            }
        Arrays.sort( arr );
        System.out.println(arr[arr.length-1]);
    }
    }
