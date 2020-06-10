package Day26;

import java.util.ArrayList;
import java.util.HashMap;

public class Project {
    public static void main(String[] args) {
        ArrayList<Double>BehruzNumber = new ArrayList<>();
        BehruzNumber.add(900.989191);
        BehruzNumber.add(267.266_7070);
        BehruzNumber.add(267.233_1010);

        ArrayList<Double>UmarNumbers = new ArrayList<>();
        UmarNumbers.add(233.255_9090);
        UmarNumbers.add(707.156_9050);

        HashMap<String, ArrayList<Double>> info = new HashMap<>();
        info.put("Behruz",BehruzNumber);
        info.put("Umar", UmarNumbers);
        System.out.println(info);
    }
}
