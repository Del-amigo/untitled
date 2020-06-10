package Day12;

import java.util.Scanner;

public class Task7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Available models: Activa125(act125), Activa5G(act5g),"
                + " Accesses125(acc125), Vespa(ves125), TvsJupiter(jup)");
        System.out.println("Select one model: ");
        String model = sc.next();
        switch (model) {
            case "act125":
                System.out.println("The price of activa125 is 80000");
                break;
            case "act5g":
                System.out.println("The price of activa5G is 75000");
                break;
            case "acc125":
                System.out.println("The price of access125 is 70000");
                break;
            case "ves125":
                System.out.println("The price of vespa is 90000");
                break;
            case "jup":
                System.out.println("The price of tvsjupiter is 73000");
                break;
            default:
                System.out.println("Model not found");
                break;
        }
    }
}