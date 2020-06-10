package Day15;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number and single nouns: ");
        int x = scan.nextInt();

        String singleNouns = "";

        for (int i = 0; i < x; i++) {
            singleNouns = scan.next();
            //ch, x, s, o
            if (singleNouns.endsWith("ch") == true || singleNouns.endsWith("x") == true || singleNouns.endsWith("s") == true || singleNouns.endsWith("o") == true) {
                System.out.println(singleNouns += "es");
            }
            //f or fe
            else if (singleNouns.endsWith("f") || singleNouns.endsWith("fe")) {
                if (singleNouns.endsWith("f") == true) {
                    int lastLetter = singleNouns.length() - 1;
                    String a = singleNouns.substring(0, lastLetter);
                    System.out.println(a + "ves");
                } else {
                    int lastLetter = singleNouns.length() - 2;
                    String a = singleNouns.substring(0, lastLetter);
                    System.out.println(a + "ves");
                }
            }
            //y
            else if (singleNouns.endsWith("y") == true) {
                System.out.println(singleNouns.replace("y", "ies"));
            }
            //others is only s added
            else {
                System.out.println(singleNouns += "s");
            }
        }
    }
}
