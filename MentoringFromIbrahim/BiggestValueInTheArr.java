package MentoringFromIbrahim;

public class BiggestValueInTheArr {
    public static void main(String[] args) {
        int[] arr = {-12,666,6626,-34,3,43434,-23,34343,4};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    public static int max(int[] arr){
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
    public static int min(int[] arr){
        int maxNum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
}
