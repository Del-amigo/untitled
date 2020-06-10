package Day22;

import java.util.HashSet;

public class ExampleSet {
    public static void main(String[] args) {
        HashSet<Double> numbers = new HashSet<>();
        numbers.add(3.23);
        numbers.add(3.10);
        numbers.add(5.12);
        numbers.add(10.12);
        numbers.add(23.12);

        double totall = 0;
        for(Double sum:numbers){
            totall+=sum;
        }
        System.out.println(totall);
    }
}