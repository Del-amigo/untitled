package Day11;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, provide your password: ");
        String text = scanner.nextLine();
        if (text.length()>=8 &&text.contains("@") || text.contains("#")
                || text.contains("!") || text.contains("~")
                || text.contains("$") || text.contains("%")
                || text.contains("^") || text.contains("&")
                || text.contains("*") || text.contains("(")
                || text.contains(")") || text.contains("-")
                || text.contains("+") || text.contains("/")
                || text.contains(":") || text.contains(".")
                || text.contains(",") || text.contains("<")
                || text.contains(">") || text.contains("?")
                || text.contains("|") || text.contains("\\")) {
            System.out.println("nice password, man");
        } else{
            System.out.println("Your password seems not so strong as should be");
        }
    }
}
