package Day42.Task3;

import java.util.ArrayList;
import java.util.List;

public class MyNumber {
    private List<Integer> evenNumbers;

    public MyNumber(List<Integer> evenNumbers) {
        this.evenNumbers = evenNumbers;
    }

    public List<Integer> getEvenNumbers() {
        List<Integer> list = new ArrayList<>(evenNumbers);
        return list;
    }

    public String toString() {
        return "MyNumber{" +
                "evenNumbers=" + evenNumbers +
                '}';
    }
}
