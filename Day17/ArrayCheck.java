package Day17;

public class ArrayCheck {
    public static void main(String[] args) {
        int[] array = {2,6,4,8,2,};
        for (int i = 0; i < array.length; i++) {
            if(array[0]==array.length){
                System.out.println("They're the same");break;
            }else{
                System.out.println("Not same");break;
            }
        }
    }
}
