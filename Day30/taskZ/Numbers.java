package Day30.taskZ;

import java.util.ArrayList;

public class Numbers {

    public boolean checkEvenNumbers (int n){
        return n%2==0;
    }

    public ArrayList<Integer> evenNumbers(){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <=20 ; i++) {
            if(checkEvenNumbers(i)){
                result.add(i);
            }
        }
        return result;
    }

}
