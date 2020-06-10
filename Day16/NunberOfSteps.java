package Day16;

public class NunberOfSteps {
    public static void main(String[] args) {
        int num = 123;
        int counter = 0;
        while(num != 0){
            if(num % 2 == 0){
                num /= 2;
                counter ++;
            }
            else{
                num --;
                counter ++;
            }
        }
        System.out.println(counter);
    }
}
